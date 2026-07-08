package qtk;

import X.C0L1M;
import X.C0L9N;
import X.C0LAB;
import X.C0LXN;
import X.C1449260noi;
import X.C20684815ws;
import X.C2344009Gk;
import X.C522610KeZ;
import X.InterfaceC21358118iB;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.u;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements InterfaceC21358118iB {
    public final ShortVideoContext LIZ;

    @Override // X.InterfaceC21358118iB
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC21358118iB
    public final void LIZJ() {
    }

    @Override // X.InterfaceC21358118iB
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC21358118iB
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC21358118iB
    public final void LJIIJJI() {
    }

    @Override // X.InterfaceC21358118iB
    public final void onComplete() {
    }

    @Override // X.InterfaceC21358118iB
    public final void LJIIL() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", getCreationId());
        c0lab.LJ("tab_name", "giphy");
        c0lab.LJ("enter_from", "video_shoot_page");
        C20684815ws.LJIILLIIL("click_gif_button", c0lab.LIZ);
    }

    @Override // X.InterfaceC21358118iB
    public final void LJIILIIL() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", getCreationId());
        c0lab.LJ("enter_method", "click");
        c0lab.LJ("enter_from", "tiktok_avatar_effect_intro_show");
        C20684815ws.LJIILLIIL("click_greenscreen_thumbnail", c0lab.LIZ);
    }

    @Override // X.InterfaceC21358118iB
    public final String getCreationId() {
        String creationId;
        ShortVideoContext shortVideoContext = this.LIZ;
        return (shortVideoContext == null || (creationId = shortVideoContext.getCreationId()) == null) ? "" : creationId;
    }

    @Override // X.InterfaceC21358118iB
    public final String getShootWay() {
        String str;
        ShortVideoContext shortVideoContext = this.LIZ;
        return (shortVideoContext == null || (str = shortVideoContext.shootWay) == null) ? "" : str;
    }

    public c(ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
    }

    @Override // X.InterfaceC21358118iB
    public final void LIZ(Map map) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJI(map);
        C20684815ws.LJIILLIIL("tool_performance_effects_image_tray", c0lab.LIZ);
    }

    @Override // X.InterfaceC21358118iB
    public final void LJII(C0L1M c0l1m) {
        LJIIJ(c0l1m.LIZ, c0l1m.LIZIZ, "media_tray");
    }

    @Override // X.InterfaceC21358118iB
    public final void LIZLLL(String str, boolean z) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", getCreationId());
        c0lab.LJ("prop_id", str);
        c0lab.LIZ(z ? 1 : 0, "giphy_show");
        C20684815ws.LJIILLIIL("show_media_tray", c0lab.LIZ);
    }

    @Override // X.InterfaceC21358118iB
    public final void LJI(int i, int i2) {
        String value = C0L9N.UPLOAD_CONTENT_NEXT.getValue();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("content_type", "photo");
        c2344009Gk.LJIIIIZZ("upload_method", "click_button");
        c2344009Gk.LJIIIIZZ("upload_type", "multiple_content");
        c2344009Gk.LIZJ(i2, "photo_cnt");
        c2344009Gk.LIZJ(0, "video_cnt");
        c2344009Gk.LIZJ(0, "live_photo_cnt");
        c2344009Gk.LJIIIIZZ("upload_tab_name", "");
        c2344009Gk.LIZJ(i, "is_shown_in_picker");
        C20684815ws.LJIILLIIL(value, c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC21358118iB
    public final void LJIIJ(String str, String str2, String str3) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", getCreationId());
        c0lab.LJ("giphy_id", str);
        c0lab.LJ("prop_id", str2);
        c0lab.LJ("tab_name", str3);
        C20684815ws.LJIILLIIL("choose_gif_content", c0lab.LIZ);
    }

    @Override // X.InterfaceC21358118iB
    public final void LJ(int i, String str, String str2, String str3, String str4, String str5) {
        String str6;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("prop_id", str);
        c0lab.LJ("resource_id", str2);
        c0lab.LJ("enter_from", str4);
        ShortVideoContext shortVideoContext = this.LIZ;
        if (shortVideoContext == null || (str6 = shortVideoContext.shootWay) == null) {
            str6 = "";
        }
        c0lab.LJ("shoot_way", str6);
        c0lab.LIZ(i, str5);
        c0lab.LJ("folded_status", str3);
        C20684815ws.LJIILLIIL("upload_picker_status_change", c0lab.LIZ);
    }

    @Override // X.InterfaceC21358118iB
    public final void LJFF(String str, String str2, int i, boolean z, boolean z2, int i2, Effect effect) {
        String str3 = str2;
        if (str3 == null || str3.length() == 0) {
            str3 = "";
        }
        String str4 = "album";
        if (u.LJIJI(str, "VIDEO", false)) {
            ShortVideoContext shortVideoContext = this.LIZ;
            if (shortVideoContext != null) {
                Pair[] pairArr = new Pair[5];
                pairArr[0] = new Pair("video_source", "upload");
                pairArr[1] = new Pair("prop_id", str3);
                String str5 = "multi_video";
                if (!z2) {
                    if (z) {
                        str4 = "multi_video";
                    } else {
                        str4 = "video";
                    }
                }
                pairArr[2] = new Pair("click_content", str4);
                pairArr[3] = new Pair("video_cnt", String.valueOf(i));
                if (!z) {
                    str5 = "video";
                }
                pairArr[4] = new Pair("content_type", str5);
                HashMap<String, String> mapLIZ = C1449260noi.LIZ(shortVideoContext, pairArr);
                if (C522610KeZ.LIZ()) {
                    mapLIZ.put("selected_index", String.valueOf(i2));
                }
                if (effect != null) {
                    mapLIZ.put("prop_resource_id", effect.getResourceId());
                    mapLIZ.put("effect_source", String.valueOf(effect.getSource()));
                    C0LXN.LIZ.getClass();
                    C0LXN.LIZ(effect, mapLIZ);
                }
                C1449260noi.LJ("prop_customized_click", mapLIZ);
                return;
            }
            return;
        }
        ShortVideoContext shortVideoContext2 = this.LIZ;
        if (shortVideoContext2 == null) {
            return;
        }
        Pair[] pairArr2 = new Pair[5];
        pairArr2[0] = new Pair("picture_source", "upload");
        pairArr2[1] = new Pair("prop_id", str3);
        String str6 = "multi_photo";
        if (!z2) {
            if (z) {
                str4 = "multi_photo";
            } else {
                str4 = "photo";
            }
        }
        pairArr2[2] = new Pair("click_content", str4);
        pairArr2[3] = new Pair("photo_cnt", String.valueOf(i));
        if (!z) {
            str6 = "photo";
        }
        pairArr2[4] = new Pair("content_type", str6);
        HashMap<String, String> mapLIZ2 = C1449260noi.LIZ(shortVideoContext2, pairArr2);
        if (C522610KeZ.LIZ()) {
            mapLIZ2.put("selected_index", String.valueOf(i2));
        }
        if (effect != null) {
            mapLIZ2.put("prop_resource_id", effect.getResourceId());
            mapLIZ2.put("effect_source", String.valueOf(effect.getSource()));
            C0LXN.LIZ.getClass();
            C0LXN.LIZ(effect, mapLIZ2);
        }
        C1449260noi.LJ("prop_customized_click", mapLIZ2);
    }
}
