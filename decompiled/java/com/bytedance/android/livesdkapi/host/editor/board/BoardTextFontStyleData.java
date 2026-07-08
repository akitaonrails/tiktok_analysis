package com.bytedance.android.livesdkapi.host.editor.board;

import X.C09CT;
import com.bytedance.android.livesdk.model.SMBBoardFontStyle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Locale;
import kotlin.text.u;

/* JADX INFO: loaded from: classes28.dex */
public final class BoardTextFontStyleData {
    public String LIZ;
    public Effect LIZJ;
    public SMBBoardFontStyle LIZLLL;

    @C09CT("font_display_name")
    public String fontDisplayName;

    @C09CT("font_identifier")
    public String fontIdentifier;

    @C09CT("default_font_size")
    public int fontSize;

    @C09CT("font_file_name")
    public String fileName = "";
    public int LIZIZ = 2;

    public final String LIZ() {
        String upperCase;
        String str = this.fontIdentifier;
        if (str == null || (upperCase = str.toUpperCase(Locale.ROOT)) == null) {
            return null;
        }
        return u.LJJIFFI(upperCase, " ", "", false);
    }
}
