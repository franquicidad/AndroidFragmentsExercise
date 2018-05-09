/*
* Copyright (C) 2017 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*  	http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.example.android.android_me.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;


import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

// This activity will display a custom Android image composed of three body parts: head, body, and legs
public class AndroidMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);

        /** Head Fragment
         *
         * */

        BodyPartFragment bodyPartFragment=new BodyPartFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();

        bodyPartFragment.setmImageIds(AndroidImageAssets.getHeads());
        bodyPartFragment.setmListIndex(0);

        fragmentManager.beginTransaction().add(R.id.head_container,bodyPartFragment).commit();

        /** Body Fragment
         *
         * */

        BodyPartFragment tronkFragment= new BodyPartFragment();

        tronkFragment.setmImageIds(AndroidImageAssets.getBodies());
        fragmentManager.beginTransaction().add(R.id.body_container,tronkFragment).commit();


        /** Leg Fragment
         *
         */

        BodyPartFragment legFragment=new BodyPartFragment();
        legFragment.setmImageIds(AndroidImageAssets.getLegs());
        fragmentManager.beginTransaction().add(R.id.legs_container,legFragment).commit();


    }
}
