/*
 * Copyright (C) 2019 - MFFBrokenSwing
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.mffbrokenswing.example;

import com.github.mffbrokenswing.mcmodabstraction.api.mod.Mod;
import com.github.mffbrokenswing.mcmodabstraction.impl.mod.AbstractMod;

import static com.github.mffbrokenswing.mcmodabstraction.api.mod.EDependencyConstraint.LOAD_AFTER;
import static com.github.mffbrokenswing.mcmodabstraction.api.mod.EDependencyConstraint.REQUIRED;

@Mod
public class ExampleMod extends AbstractMod
{

    public static final String MOD_ID = "examplemod";
    public static final String NAME = "Example mod";
    public static final String VERSION = "1.0.0";

    public ExampleMod()
    {
        super(MOD_ID, NAME, VERSION);
        this.dependsOn("jei").between("4.7.0.68", "4.13.1.225").constraints(LOAD_AFTER, REQUIRED);
    }

    @Override
    public String getDescription()
    {
        return "A mod used as an example and as a test for the abstraction layer.";
    }

}
