package com.sow.biblio.web.tiles;

import org.apache.tiles.AttributeContext;
import org.apache.tiles.preparer.ViewPreparer;
import org.apache.tiles.request.Request;

public class ResultsTilePreparer implements ViewPreparer {

	@Override
	public void execute(Request tilesContext, AttributeContext attributeContext) {
		System.out.println("\n****in execute of ResultsTilePreparer*****");
//		tilesContext.getContext("request").put("testTileObj", "testTileObjValue");
//	
//		String testStr1 = (String) tilesContext.getContext("request").get("testObj1");		
//		System.out.println("\n******ResultsTilePreparer testStr1:" + testStr1);
//		
//		String testStr2 = (String) tilesContext.getContext("session").get("testSessionObj1");		
//		System.out.println("\n******ResultsTilePreparer testStr2:" + testStr2);
	}
}