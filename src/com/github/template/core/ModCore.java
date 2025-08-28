package com.github.template.core;

import arc.util.Log;
import com.github.bsideup.jabel.Desugar;
import mindustry.mod.Mod;

@Desugar
@SuppressWarnings("unused")
public class ModCore extends Mod {
    @Override
    public void loadContent() {
        var hello = "Hello!";
        Log.info(hello);
    }
}
