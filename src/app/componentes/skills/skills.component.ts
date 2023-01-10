import { Component, OnInit } from '@angular/core';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { SkillsService } from 'src/app/service/skills.service';
import { skills } from 'src/app/model/skills.model';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {
  skills:skills[] = [];
  constructor(public skillsService:SkillsService) { }

  ngOnInit(): void {
    this.skillsService.getSkills().subscribe(data4 => {
      this.skills=data4;
  }
    )};

}
