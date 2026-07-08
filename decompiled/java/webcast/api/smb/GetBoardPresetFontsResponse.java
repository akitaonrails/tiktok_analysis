package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.livesdk.model.SMBBoardColorPreset;
import com.bytedance.android.livesdk.model.SMBBoardFontStyle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class GetBoardPresetFontsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("font_list")
        public List<SMBBoardFontStyle> fontList = new ArrayList();

        @C09CT("color_presets")
        public List<SMBBoardColorPreset> colorPresets = new ArrayList();

        @C09CT("available_text_presets")
        public List<Integer> availableTextPresets = new ArrayList();
    }
}
