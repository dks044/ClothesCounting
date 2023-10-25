package main;

import java.util.ArrayList;

import actor.Actor;
import actor.Final_1800ACTOR;

public class ClothesCounting {

	public static void main(String[] args) {
		ArrayList<Actor> actor_list = Actor.getActor_list();
		ArrayList<String> final_1800arr = Final_1800ACTOR.get1800actor();
		//의상이 몇개인지
		//Actor.outputClothesPCS();
		System.out.println("====================================================================");
		for(Actor a : actor_list) {
			if(!final_1800arr.contains(String.valueOf(a.getActor_no()))) continue;
			int total = a.ClothesOfActorCounting(a); //필요한 사진갯수
			int total2 = a.ClothesOfCounting(a); //시나리오에는 몇개 있는지
			System.out.print(a.getActor_no()+"에는 시나리오 시트 기준으로 의상이 "+total2+"개 기록됐습니다.|| ");
			System.out.println(a.getActor_no()+"에는 의상 이미지 파일이 "+total+"개 있어야합니다.");
			System.out.print("의상 목록 : ");
			for(String str : a.getClothes_arr()) {
				System.out.print(str+" ");
			}
			ArrayList<String> acc_name_arr = a.acc_namelist(a);
			System.out.print("| 악세사리 목록 : ");
			for(String str : acc_name_arr) {
				if(!str.equals(" ")) System.out.print(str+" ");
			}
			System.out.println("\n====================================================================");
		}
		System.out.println("====================================================================");
		Actor.outputClothesPCS();
		System.out.println("====================================================================");
	}

}
