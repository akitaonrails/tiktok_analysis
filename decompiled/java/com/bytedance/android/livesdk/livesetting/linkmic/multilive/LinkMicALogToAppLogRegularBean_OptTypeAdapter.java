package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class LinkMicALogToAppLogRegularBean_OptTypeAdapter extends TypeAdapter<LinkMicALogToAppLogRegularBean> {
    public final Gson LIZ;

    public LinkMicALogToAppLogRegularBean_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LinkMicALogToAppLogRegularBean read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicALogToAppLogRegularBean linkMicALogToAppLogRegularBean = new LinkMicALogToAppLogRegularBean(null, null, null, null, null, 31, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1944159427:
                        if (strLJJJJ.equals("role_allow_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicALogToAppLogRegularBean.roleAllowList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 47876975:
                        if (strLJJJJ.equals("level_allow_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicALogToAppLogRegularBean.levelAllowList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 258330356:
                        if (strLJJJJ.equals("white_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicALogToAppLogRegularBean.whiteList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1060492834:
                        if (strLJJJJ.equals("tag_module_allow_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicALogToAppLogRegularBean.tagModuleAllowList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1286305040:
                        if (strLJJJJ.equals("block_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicALogToAppLogRegularBean.blockList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
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
        return linkMicALogToAppLogRegularBean;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicALogToAppLogRegularBean linkMicALogToAppLogRegularBean) {
        LinkMicALogToAppLogRegularBean linkMicALogToAppLogRegularBean2 = linkMicALogToAppLogRegularBean;
        if (linkMicALogToAppLogRegularBean2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("tag_module_allow_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, linkMicALogToAppLogRegularBean2.tagModuleAllowList, String.class);
        c09dl.LJIILLIIL("white_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, linkMicALogToAppLogRegularBean2.whiteList, String.class);
        c09dl.LJIILLIIL("block_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, linkMicALogToAppLogRegularBean2.blockList, String.class);
        c09dl.LJIILLIIL("level_allow_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, linkMicALogToAppLogRegularBean2.levelAllowList, String.class);
        c09dl.LJIILLIIL("role_allow_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, linkMicALogToAppLogRegularBean2.roleAllowList, String.class);
        c09dl.LJII();
    }
}
