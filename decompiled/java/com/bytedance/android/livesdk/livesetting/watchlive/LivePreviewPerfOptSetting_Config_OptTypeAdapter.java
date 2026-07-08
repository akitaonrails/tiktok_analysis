package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreviewPerfOptSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LivePreviewPerfOptSetting_Config_OptTypeAdapter extends TypeAdapter<LivePreviewPerfOptSetting.Config> {
    public final Gson LIZ;

    public LivePreviewPerfOptSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LivePreviewPerfOptSetting.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePreviewPerfOptSetting.Config config = new LivePreviewPerfOptSetting.Config(false, false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1743268035:
                        if (strLJJJJ.equals("enable_pcs_decoration_lazy_load")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enablePcsDecorationLazyLoad = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1679480788:
                        if (strLJJJJ.equals("disable_top_and_bottom_mask_widget")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.disableTopAndBottomMaskWidget = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1105453266:
                        if (strLJJJJ.equals("enable_preview_pull_strategy_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enablePreviewPullStrategyOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -471256572:
                        if (strLJJJJ.equals("enable_pull_stream_data_json_parse_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enablePullStreamDataJsonParseOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePreviewPerfOptSetting.Config config) throws IOException {
        LivePreviewPerfOptSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_pull_stream_data_json_parse_opt");
        c09dl.LJJJJJL(config2.enablePullStreamDataJsonParseOpt);
        c09dl.LJIILLIIL("disable_top_and_bottom_mask_widget");
        c09dl.LJJJJJL(config2.disableTopAndBottomMaskWidget);
        c09dl.LJIILLIIL("enable_pcs_decoration_lazy_load");
        c09dl.LJJJJJL(config2.enablePcsDecorationLazyLoad);
        c09dl.LJIILLIIL("enable_preview_pull_strategy_opt");
        c09dl.LJJJJJL(config2.enablePreviewPullStrategyOpt);
        c09dl.LJII();
    }
}
