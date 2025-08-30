package com.github.nekit508.emkb.core;

import com.github.nekit508.emkb.ui.dialogs.KeybindsDialog;
import mindustry.mod.Mod;

public class EMKBCore extends Mod {
    public static KeybindsDialog dialog;

    @Override
    public void init() {
        dialog = new KeybindsDialog("emkb-keybinds-dialog");
    }
}
