package com.ss.android.ugc.aweme.offline.tools.offline.mob;

import X.C07SL;
import X.C07T8;
import X.C1697810uHb;
import X.C1866007So;
import X.C1866507St;
import X.C20684815ws;
import X.InterfaceC20685415wy;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.internal.ICreationEventMonitorService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class CreationEventMonitorSerivce implements ICreationEventMonitorService {
    @Override // com.ss.android.ugc.aweme.internal.ICreationEventMonitorService
    public final void LIZ() {
        C1866507St.LIZ.LJ = true;
    }

    @Override // com.ss.android.ugc.aweme.internal.ICreationEventMonitorService
    public final void LIZIZ(List<String> list) {
        C07SL.LIZJ = list;
        C07SL.LIZ(C1697810uHb.LJIIJJI(new C07T8() { // from class: X.07QZ
            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 0L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "change_sync_mode";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }
        }, new C07T8() { // from class: X.00Wz
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "click_music_entrance";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("creation_id", "content_source", "content_type", "shoot_way", "enter_from");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }
        }, new C07T8() { // from class: X.00X0
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "edit_music_complete";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("shoot_way", "creation_id", "music_id");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }
        }, new C07T8() { // from class: X.07SP
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "edit_music";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("music_selected_from", "shoot_way", "music_id", "shoot_way");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }
        }, new C07T8() { // from class: X.01Cd
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "enter_music_detail";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("enter_method", "enter_from");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                if (!C13LP.LJJJJ(map.get("enter_from"), Collections.singletonList("sound_history"))) {
                    String str = map.get("music_id");
                    if (str == null || str.length() == 0) {
                        C01CY.LIZJ("enter_music_detail", null, null, null, "music_id is empty");
                    }
                }
            }
        }, new C07T8() { // from class: X.00YX
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "enter_music_tab";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return Collections.singletonList("tab_name");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }
        }, new C07T8() { // from class: X.07SO
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "favourite_song";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("enter_from", "music_id");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                C07TY.LIZ("favourite_song", map);
            }
        }, new C07T8() { // from class: X.07Sb
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "music_play_end";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("enter_from", "music_id", "music_selected_method", "music_show_rank", "music_duration", "play_duration", "is_from_edit_page_panel");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }
        }, new C07T8() { // from class: X.07SS
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 0L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "music_show";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("tab_name", "content_source", "content_type", "shoot_way", "creation_id", "music_id", "music_from", "music_show_rank");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                C07TY.LIZ("music_show", map);
            }
        }, new C07T8() { // from class: X.07Sj
            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "select_music";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("music_selected_method", "music_show_rank", "tab_name", "enter_from", "content_source", "content_type", "shoot_way", "creation_id", "music_id", "is_pgc");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                C1865807Sm c1865807Sm = C1866507St.LIZJ;
                String str = map.get("music_id");
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = map.get("music_selected_from");
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = map.get("music_log_id");
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = map.get("tab_name");
                if (str5 != null) {
                    str2 = str5;
                }
                c1865807Sm.LIZIZ(new C1865907Sn(str, str3, str4, str2, false), map.get("enter_from"));
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                String str = map.get("music_id");
                if (str == null) {
                    return "";
                }
                return str;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                C1867107Sz c1867107Sz = C1866507St.LIZ.LIZ;
                HashMap map2 = new HashMap();
                map2.put("shoot_way", c1867107Sz.LIZ);
                C07T3.LIZ("select_music", "shoot, select_music or show_music_title", map, map2);
                C07TY.LIZJ("select_music", map);
            }
        }, new C07T8() { // from class: X.07Sl
            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "show_music_title";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("music_selected_from", "enter_from", "music_id", "creation_id");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                C1865907Sn c1865907Sn;
                String str = map.get("enter_from");
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = map.get("music_id");
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = map.get("music_log_id");
                if (str4 == null) {
                    str4 = "";
                }
                C1865807Sm c1865807Sm = C1866507St.LIZJ;
                c1865807Sm.getClass();
                if (Intrinsics.LJFF(str, "video_shoot_page")) {
                    c1865907Sn = c1865807Sm.LIZ;
                } else {
                    c1865907Sn = C1866507St.LIZ.LIZJ;
                }
                if (c1865907Sn == null) {
                    c1865907Sn = new C1865907Sn(null, null, null, 31);
                }
                if (!Intrinsics.LJFF(c1865907Sn.LIZ, str3)) {
                    String str5 = map.get("music_id");
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str6 = map.get("music_selected_from");
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str7 = map.get("music_log_id");
                    if (str7 == null) {
                        str7 = "";
                    }
                    String str8 = map.get("tab_name");
                    if (str8 != null) {
                        str2 = str8;
                    }
                    c1865807Sm.LIZIZ(new C1865907Sn(str5, str6, str7, str2, true), str);
                    return;
                }
                if (Intrinsics.LJFF(c1865907Sn.LIZJ, str4)) {
                    return;
                }
                c1865807Sm.LIZIZ(new C1865907Sn(c1865907Sn.LIZ, c1865907Sn.LIZIZ, str4, c1865907Sn.LIZLLL, c1865907Sn.LJ), str);
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                String str = map.get("music_id");
                if (str == null) {
                    return "";
                }
                return str;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                C07TY.LIZJ("show_music_title", map);
            }
        }, new C07T8() { // from class: X.07SQ
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "show_music";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("enter_from", "music_id");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                String str = map.get("music_id");
                if (str == null) {
                    return "";
                }
                return str;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                C07TY.LIZ("show_music", map);
                if (!Intrinsics.LJFF(map.get("is_similarmusic"), "1")) {
                    C01CY.LIZ("show_music", C1697810uHb.LJIIJJI("shoot_way", "creation_id"), map);
                }
            }
        }, new C07T8() { // from class: X.07Sk
            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "unselect_music";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("enter_from", "shoot_way", "creation_id", "music_id", "music_selected_from");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                C1866507St.LIZJ.LIZIZ(null, map.get("enter_from"));
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                C1867107Sz c1867107Sz = C1866507St.LIZ.LIZ;
                C1865807Sm c1865807Sm = C1866507St.LIZJ;
                String str = map.get("enter_from");
                c1865807Sm.getClass();
                if (Intrinsics.LJFF(str, "video_shoot_page")) {
                    C1865907Sn c1865907Sn = c1865807Sm.LIZ;
                } else {
                    C1865907Sn c1865907Sn2 = C1866507St.LIZ.LIZJ;
                }
                HashMap map2 = new HashMap();
                map2.put("shoot_way", c1867107Sz.LIZ);
                C07T3.LIZ("unselect_music", "shoot, select_music or show_music_title", map, map2);
            }
        }));
        C07SL.LIZ(C1697810uHb.LJIIJJI(new C07T8() { // from class: X.07Su
            public final List<String> LIZ = C1697810uHb.LJIIJJI("click_ep_add_material", "click_replace");
            public final List<String> LIZIZ = Collections.singletonList("click_back_button");

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "enter_video_shoot_page";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                String str = map.get("enter_method");
                boolean z = false;
                if (C13LP.LJJJJ(str, this.LIZ)) {
                    C1866707Sv c1866707Sv = C1866507St.LIZIZ;
                    if (!c1866707Sv.LIZIZ) {
                        c1866707Sv.LIZ = c1866707Sv.LIZJ;
                        c1866707Sv.LIZIZ = true;
                    }
                    c1866707Sv.LIZJ = null;
                } else if (C13LP.LJJJJ(str, this.LIZIZ)) {
                    C1866707Sv c1866707Sv2 = C1866507St.LIZIZ;
                    if (c1866707Sv2.LIZIZ) {
                        c1866707Sv2.LIZ(c1866707Sv2.LIZ);
                        c1866707Sv2.LIZ = null;
                        c1866707Sv2.LIZIZ = false;
                    }
                } else {
                    C1867107Sz c1867107Sz = C1866507St.LIZ.LIZ;
                    if (c1867107Sz.LIZIZ.length() == 0) {
                        String str2 = map.get("creation_id");
                        if (str2 == null) {
                            str2 = "";
                        }
                        C1866507St.LIZIZ(C1867107Sz.LIZ(c1867107Sz, str2, null, 253));
                    }
                }
                String str3 = map.get("shoot_tab_name");
                if (str3 == null || str3.length() == 0) {
                    z = true;
                }
                C1866507St.LJFF = z;
            }
        }, new C07T8() { // from class: X.07T4
            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "exit_shoot_popup_result";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                if (Intrinsics.LJFF(map.get("to_status"), "start_over")) {
                    C1866507St.LIZIZ.getClass();
                    C1866507St.LIZ.LIZIZ.clear();
                    C07T6 c07t6 = C1866507St.LIZ.LIZLLL;
                    c07t6.LIZ = 0;
                    c07t6.LIZIZ = 0;
                }
            }
        }, new C07T8() { // from class: X.07T5
            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "record_video_discard";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                C1866507St.LIZIZ.getClass();
                List<C1867007Sy> list2 = C1866507St.LIZ.LIZIZ;
                ListProtector.remove(list2, C1697810uHb.LJIIJ(list2));
                C07T6 c07t6 = C1866507St.LIZ.LIZLLL;
                c07t6.LIZIZ--;
            }
        }, new C07T8() { // from class: X.07T1
            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "record_video";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("creation_id", "shoot_way");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                if (Intrinsics.LJFF(map.get("shooting_segment_cnt"), "1")) {
                    C1866507St.LIZIZ.getClass();
                    C1866507St.LIZ.LIZIZ.clear();
                    C07T6 c07t6 = C1866507St.LIZ.LIZLLL;
                    if (Intrinsics.LJFF(map.get("content_type"), "video")) {
                        c07t6.LIZ = 0;
                        c07t6.LIZIZ = 1;
                    } else {
                        c07t6.LIZ = 1;
                        c07t6.LIZIZ = 0;
                    }
                } else {
                    C07T6 c07t62 = C1866507St.LIZ.LIZLLL;
                    if (Intrinsics.LJFF(map.get("content_type"), "video")) {
                        c07t62.LIZIZ++;
                    } else {
                        c07t62.LIZ++;
                    }
                }
                if (!Intrinsics.LJFF(map.get("is_aime_effect"), "1")) {
                    C1866707Sv c1866707Sv = C1866507St.LIZIZ;
                    c1866707Sv.getClass();
                    C1866507St.LIZ.LIZIZ.add(c1866707Sv.LIZJ);
                }
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                boolean z;
                C1867007Sy c1867007Sy;
                boolean zLJFF = Intrinsics.LJFF(map.get("is_aime_effect"), "1");
                List<String> list2 = C07TY.LIZ;
                String str = map.get("music_id");
                String str2 = map.get("music_selected_from");
                if (!C13LP.LJJJJ(map.get("shoot_way"), C07TY.LIZLLL) && !C13LP.LJJJJ(str2, C07TY.LIZIZ)) {
                    if (str != null && str.length() != 0) {
                        if (!u.LJJIIJZLJL(str, "-", false) && (str2 == null || str2.length() == 0 || C07TY.LIZ.contains(str2))) {
                            C01CY.LIZJ("record_video", map, C1697810uHb.LJIIJJI("music_id", "music_selected_from"), null, "music_selected_from should not be in (null, origin, original) when music_id is not empty.");
                        }
                    } else if (str2 != null && str2.length() != 0 && !C07TY.LIZ.contains(str2) && (str == null || str.length() == 0)) {
                        C01CY.LIZJ("record_video", map, C1697810uHb.LJIIJJI("music_id", "music_selected_from"), null, "music_id should not be empty when music_selected_from not in (null, origin, original).");
                    }
                }
                HashMap map2 = new HashMap();
                C1867107Sz c1867107Sz = C1866507St.LIZ.LIZ;
                map2.put("shoot_way", c1867107Sz.LIZ);
                map2.put("from_prop_id", c1867107Sz.LIZLLL);
                if (c1867107Sz.LJ.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                String str3 = "";
                if (z) {
                    map2.put("from_prop_resource_id", c1867107Sz.LJ);
                } else {
                    C1866907Sx c1866907Sx = C1866507St.LIZ;
                    String str4 = map.get("from_prop_resource_id");
                    if (str4 == null) {
                        str4 = "";
                    }
                    c1866907Sx.LIZ = C1867107Sz.LIZ(c1867107Sz, null, str4, 239);
                }
                map2.put("from_group_id_prop_list", c1867107Sz.LJFF);
                map2.put("from_group_id_prop_resource_list", c1867107Sz.LJI);
                if (zLJFF || (c1867007Sy = C1866507St.LIZIZ.LIZJ) == null) {
                    c1867007Sy = new C1867007Sy((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047);
                }
                map2.put("prop_id", c1867007Sy.LIZ);
                map2.put("resource_id", c1867007Sy.LJFF);
                map2.put("effect_source", c1867007Sy.LJI);
                map2.put("prop_impr_position", c1867007Sy.LJ);
                if (Intrinsics.LJFF(c1867007Sy.LJII, "1")) {
                    map2.put("is_default_prop", c1867007Sy.LJII);
                } else {
                    C01CY.LIZIZ(map2, map);
                }
                if (zLJFF) {
                    map2.put("prop_selected_from", "");
                }
                C07T3.LIZ("record_video", "prop_click", map, map2);
                if (!zLJFF) {
                    C1866707Sv c1866707Sv = C1866507St.LIZIZ;
                    C1867007Sy c1867007Sy2 = c1866707Sv.LIZJ;
                    if (c1867007Sy2 == null) {
                        c1867007Sy2 = new C1867007Sy((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047);
                    }
                    String str5 = map.get("prop_selected_from");
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (C1697810uHb.LJIIJJI("music_panel_hot_music_effect_video", "music_panel_favor_music_effect_video").contains(str5)) {
                        if (c1867007Sy2.LIZ.length() > 0) {
                            c1866707Sv.LIZ(C1867007Sy.LIZ(c1867007Sy2, str5));
                        }
                    } else {
                        if (c1867007Sy2.LIZ.length() == 0) {
                            if (!Intrinsics.LJFF(str5, "")) {
                                LJI("", str5, map);
                            }
                        } else {
                            String str6 = map.get("from_prop_id");
                            if (str6 != null && str6.length() != 0 && c1866707Sv.LIZLLL == 1) {
                                String str7 = map.get("shoot_way");
                                if (str7 != null) {
                                    str3 = str7;
                                }
                                if (C1697810uHb.LJIIJJI("single_song", "prop_page").contains(str3) && !Intrinsics.LJFF(str5, str3)) {
                                    LJI(str3, str5, map);
                                }
                            } else if (a0.LJJIIZI(c1867007Sy2.LIZLLL, "carousel", false)) {
                                if (!u.LJJIIJZLJL(str5, "prop_carousel_", false)) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("prop_carousel_");
                                    sbLIZ.append("XXX");
                                    LJI(C2188811AlT.LIZIZ(sbLIZ), str5, map);
                                }
                            } else if (Intrinsics.LJFF(c1867007Sy2.LIZLLL, "search")) {
                                if (!Intrinsics.LJFF(str5, "prop_search")) {
                                    LJI("prop_search", str5, map);
                                }
                            } else if (!Intrinsics.LJFF(str5, "direct_shoot") && !u.LJJIIJZLJL(str5, "prop_panel_", false)) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("prop_panel_");
                                sbLIZ2.append("XXX");
                                LJI(C2188811AlT.LIZIZ(sbLIZ2), str5, map);
                            }
                        }
                        if (c1867007Sy2.LIZ.length() > 0) {
                            c1866707Sv.LIZ(C1867007Sy.LIZ(c1867007Sy2, str5));
                        }
                    }
                }
                List listSingletonList = Collections.singletonList("from_group_id");
                if (!listSingletonList.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listSingletonList) {
                        String str8 = map.get(obj);
                        if (str8 == null || str8.length() == 0) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("These keys should not be empty: ");
                        sbLIZ3.append(arrayList);
                        C01CY.LIZJ("record_video", map, arrayList, null, C2188811AlT.LIZIZ(sbLIZ3));
                    }
                }
            }

            public static void LJI(String str, String str2, Map map) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("It might be an exception of one of the following situations: 1. report error prop_selected_from parameter in record_video, expected: ");
                sbLIZ.append(str);
                sbLIZ.append(", actual: ");
                sbLIZ.append(str2);
                sbLIZ.append(" 2. prop_click event is missing report");
                C01CY.LIZJ("record_video", map, Collections.singletonList("prop_selected_from"), null, C2188811AlT.LIZIZ(sbLIZ));
            }
        }, new C07T8() { // from class: X.07SW
            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "shoot";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("shoot_way", "group_id");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                C1866507St.LIZ(map.get("prop_id"), map.get("prop_resource_id"), map, true);
            }
        }));
        C07SL.LIZ(C1697810uHb.LJIIJJI(new C07T8() { // from class: X.07SF
            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "click_add_overlay";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                C1866507St.LIZLLL = true;
            }
        }, new C07T8() { // from class: X.07SG
            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "click_edit_add_material";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                C1866507St.LIZLLL = true;
            }
        }, new C07T8() { // from class: X.07Sc
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "click_save_local_on_edit_page";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("shoot_way", "creation_id");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                C07T3.LIZ("click_save_local_on_edit_page", "enter_video_edit_page", map, C07T0.LIZIZ(map));
            }
        }, new C07T8() { // from class: X.07SJ
            public final List<String> LIZ = C1697810uHb.LJIIJJI("replace", "delete", "split");

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "click_track_option";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                if (C13LP.LJJJJ(map.get("tab_name"), this.LIZ)) {
                    C1866507St.LIZLLL = true;
                }
            }
        }, new C07T8() { // from class: X.07SH
            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 0L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "delete_clips";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                C1866507St.LIZLLL = true;
            }
        }, new C07T8() { // from class: X.07SK
            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 0L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "edit_page_function_click";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                if (Intrinsics.LJFF(map.get("function"), "image_video_separate_switch")) {
                    C1866507St.LIZ.LJFF = true;
                }
            }
        }, new C07T8() { // from class: X.07Sh
            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "enter_video_edit_page";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("content_source", "content_type", "shoot_way", "creation_id");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            public static boolean LJI(Map map) {
                if (!LJII(map) && !(!Intrinsics.LJFF(map.get("content_source"), "shoot")) && !Intrinsics.LJFF(map.get("shoot_way"), "share_to_story")) {
                    return true;
                }
                return false;
            }

            public static boolean LJII(Map map) {
                CharSequence charSequence = (CharSequence) map.get("draft_way");
                if ((charSequence == null || charSequence.length() == 0) && !Intrinsics.LJFF(map.get("enter_method"), "click_continue_popup") && !Intrinsics.LJFF(map.get("is_delete_to_edit"), "1")) {
                    return false;
                }
                return true;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                if (LJII(map)) {
                    C1866507St.LIZ(map.get("from_prop_id"), map.get("from_prop_resource_id"), map, false);
                } else if (Intrinsics.LJFF(map.get("aime_entrance"), "aime_tab")) {
                    C1867107Sz c1867107Sz = C1866507St.LIZ.LIZ;
                    String str = map.get("creation_id");
                    if (str == null) {
                        str = "";
                    }
                    C1866507St.LIZIZ(C1867107Sz.LIZ(c1867107Sz, str, null, 253));
                }
                if (!LJI(map)) {
                    C07T2.LIZ(map);
                }
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                String str;
                if (LJI(map)) {
                    C07T3.LIZ("enter_video_edit_page", "shoot, select_music, show_music_title or record_video", map, C07T0.LIZ(map, new C1865107Sf(true)));
                    return;
                }
                String str2 = map.get("draft_way");
                if ((str2 == null || str2.length() == 0) && ((str = map.get("aime_entrance")) == null || str.length() == 0)) {
                    List listLJIIJJI = C1697810uHb.LJIIJJI("aime_hub", "pugc_template");
                    String str3 = map.get("shoot_way");
                    if (!C13LP.LJJJJ(str3, listLJIIJJI)) {
                        String str4 = map.get("prop_selected_from");
                        if (Intrinsics.LJFF(map.get("is_edit_prop"), "1") || (Intrinsics.LJFF("enter_video_edit_page", "enter_video_edit_page") && str4 != null && u.LJJIIJZLJL(str4, "edit_page", false))) {
                            C01CY.LIZ("enter_video_edit_page", C13LQ.LJIJI(new String[]{"prop_list", "prop_selected_from", "resource_list"}), map);
                        } else {
                            List listLJIILJJIL = C1697810uHb.LJIILJJIL("prop_list", "prop_selected_from", "effect_source");
                            if (!C13LP.LJJJJ(str3, C1865407Si.LIZ)) {
                                listLJIILJJIL.add("resource_list");
                            }
                            if (!Intrinsics.LJFF(map.get("content_source"), "shoot")) {
                                C01CY.LIZ("enter_video_edit_page", listLJIILJJIL, map);
                            } else {
                                listLJIILJJIL.add("prop_impr_position");
                                C01CY.LIZ("enter_video_edit_page", listLJIILJJIL, map);
                            }
                        }
                    }
                }
                List<String> list2 = C07TY.LIZ;
                String str5 = map.get("music_id");
                String str6 = map.get("music_selected_from");
                String str7 = map.get("music_log_id");
                if (C13LP.LJJJJ(str6, C07TY.LIZIZ) || str5 == null || str5.length() == 0 || u.LJJIIJZLJL(str5, "-", false)) {
                    return;
                }
                if (str6 != null && str6.length() != 0 && !Intrinsics.LJFF(str6, "origin") && !Intrinsics.LJFF(str6, "original")) {
                    C07TY.LIZIZ("enter_video_edit_page", str6, str7, map);
                } else {
                    C01CY.LIZJ("enter_video_edit_page", map, C1697810uHb.LJIIJJI("music_id", "music_selected_from"), null, "music_selected_from should not be in (null, origin, original) when music_id is not empty.");
                }
            }
        }, new C07T8() { // from class: X.07SI
            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "move_material";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                C1866507St.LIZLLL = true;
            }
        }));
        C07SL.LIZ(C1697810uHb.LJIIJJI(new C07T8() { // from class: X.07Se
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "enter_video_post_page";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("content_source", "content_type", "shoot_way", "creation_id");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                if (!Intrinsics.LJFF(map.get("enter_method"), "click_draft") && !Intrinsics.LJFF(map.get("enter_method"), "click_continue_popup")) {
                    C07T3.LIZ("enter_video_post_page", "enter_video_edit_page", map, C07T0.LIZ(map, new C1865107Sf(false)));
                } else {
                    C1866507St.LIZ(map.get("from_prop_id"), map.get("from_prop_resource_id"), map, false);
                    C07T2.LIZ(map);
                }
            }
        }, new C07T8() { // from class: X.07Sg
            public final List<String> LIZ = C1697810uHb.LJIIJJI("live_highlights_quickpost", "fans_club_milestone_celebrate_page", "fans_club_milestone_page", "live_auto_post");

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "publish";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("shoot_way", "content_source", "content_type");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                String str = map.get("creation_id");
                if (str == null) {
                    return "";
                }
                return str;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                if (!C13LP.LJJJJ(map.get("shoot_way"), this.LIZ)) {
                    C07T3.LIZ("publish", "enter_video_post_page", map, C07T0.LIZ(map, new C1865107Sf(false)));
                }
                if (!Intrinsics.LJFF(map.get("is_delete_to_edit"), "1")) {
                    List<String> list2 = C07TY.LIZ;
                    String str = map.get("music_id");
                    String str2 = map.get("fake_music_id");
                    String str3 = map.get("music_selected_from");
                    String str4 = map.get("music_log_id");
                    if (!C13LP.LJJJJ(str3, C07TY.LIZIZ)) {
                        if (str != null && str.length() != 0) {
                            if (str3 == null || str3.length() == 0 || C07TY.LIZ.contains(str3)) {
                                C01CY.LIZJ("publish", map, C1697810uHb.LJIIJJI("music_id", "music_selected_from"), null, "music_selected_from should not be in (null, origin, original) when music_id is not empty.");
                            }
                            C07TY.LIZIZ("publish", str3, str4, map);
                            return;
                        }
                        if (str3 == null || str3.length() == 0 || C07TY.LIZ.contains(str3)) {
                            return;
                        }
                        if (str != null && str.length() != 0) {
                            return;
                        }
                        if (str2 != null && str2.length() != 0) {
                            return;
                        }
                        C01CY.LIZJ("publish", map, C1697810uHb.LJIIJJI("music_id", "fake_music_id", "music_selected_from"), null, "music_id and fake_music_id should not be empty when music_selected_from is not in (null, origin, original).");
                    }
                }
            }
        }, new C07T8() { // from class: X.07Sd
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "save_draft";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("shoot_way", "creation_id");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                C07T3.LIZ("save_draft", "enter_video_edit_page", map, C07T0.LIZIZ(map));
            }
        }));
        C07SL.LIZ(C1697810uHb.LJIIJJI(new C07T8() { // from class: X.07SD
            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 0L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "apply_auto_edit_mix_material";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                if (Intrinsics.LJFF(map.get("is_edit_prop"), "1")) {
                    C1866507St.LJ = true;
                }
            }
        }, new C07T8() { // from class: X.07ST
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "click_effect_entrance";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("shoot_way", "creation_id", "content_source", "content_type", "is_editor_pro", "effect_entrance_position");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }
        }, new C07T8() { // from class: X.07Sa
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "click_prop_entrance";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("shoot_way", "creation_id", "from_group_id", "enter_from", "icon_type");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                if (C07T3.LIZJ(map)) {
                    C01CY.LIZ("click_prop_entrance", C13LQ.LJJLL(new String[]{"prop_id", "resource_id"}), map);
                }
            }
        }, new C07T8() { // from class: X.07SU
            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "effect_click";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("shoot_way", "creation_id", "content_source", "content_type", "index", "effect_entrance_position");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                if (Intrinsics.LJFF(map.get("is_edit_prop"), "1")) {
                    C1866507St.LJ = true;
                }
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                String str = map.get("effect_id");
                String str2 = map.get("prop_id");
                if (str == null || str.length() == 0) {
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                }
                return str;
            }
        }, new C07T8() { // from class: X.07SR
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "effect_confirm";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("shoot_way", "creation_id", "content_source", "content_type", "is_edit_prop", "effect_entrance_position");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }
        }, new C07T8() { // from class: X.07SV
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "effect_show";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("shoot_way", "creation_id", "content_source", "content_type", "index", "is_editor_pro", "is_edit_prop", "effect_entrance_position");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                String str = map.get("effect_id");
                String str2 = map.get("prop_id");
                if (str == null || str.length() == 0) {
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                }
                return str;
            }
        }, new C07T8() { // from class: X.07Sq
            @Override // X.C07T8
            public final long LIZJ() {
                return 0L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "prop_apply";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                String str;
                String str2 = map.get("prop_id");
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                C1866707Sv c1866707Sv = C1866507St.LIZIZ;
                C1867007Sy c1867007Sy = c1866707Sv.LIZJ;
                if (c1867007Sy != null) {
                    str = c1867007Sy.LIZ;
                } else {
                    str = null;
                }
                if (!Intrinsics.LJFF(str2, str)) {
                    String str4 = map.get("prop_id");
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = map.get("enter_from");
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str6 = map.get("tab_name");
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str7 = map.get("tab_key");
                    if (str7 == null) {
                        str7 = "";
                    }
                    String str8 = map.get("impr_position");
                    if (str8 == null) {
                        str8 = "";
                    }
                    String str9 = map.get("resource_id");
                    if (str9 == null) {
                        str9 = "";
                    }
                    String str10 = map.get("effect_source");
                    if (str10 == null) {
                        str10 = "";
                    }
                    String str11 = map.get("is_default_prop");
                    if (str11 == null) {
                        str11 = "";
                    }
                    String str12 = map.get("is_auto_applied");
                    if (str12 != null) {
                        str3 = str12;
                    }
                    c1866707Sv.LIZ(new C1867007Sy(str4, str5, str6, str7, str8, str9, str10, str11, str3, "", true));
                }
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                String str = map.get("prop_id");
                if (str == null) {
                    return "";
                }
                return str;
            }
        }, new C1866007So() { // from class: X.07Sp
            @Override // X.C1866007So, X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C1866007So, X.C07T8
            public final String getEventName() {
                return "prop_auto_click";
            }

            @Override // X.C1866007So, X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C1866007So, X.C07T8
            public final void LIZ(Map<String, String> map) {
                String str;
                String str2 = map.get("prop_id");
                C1867007Sy c1867007Sy = C1866507St.LIZIZ.LIZJ;
                if (c1867007Sy != null) {
                    str = c1867007Sy.LIZ;
                } else {
                    str = null;
                }
                if (!Intrinsics.LJFF(str, str2) || (c1867007Sy != null && c1867007Sy.LJIIJ)) {
                    C1866007So.LJI(map);
                }
            }
        }, new C1866007So(), new C07T8() { // from class: X.07Sw
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "prop_click_time";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("shoot_way", "creation_id", "enter_from", "prop_id", "duration");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                String str = map.get("prop_id");
                if (str == null) {
                    return "";
                }
                return str;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                C1867007Sy c1867007Sy;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C1867107Sz c1867107Sz = C1866507St.LIZ.LIZ;
                linkedHashMap.put("shoot_way", c1867107Sz.LIZ);
                linkedHashMap.put("from_prop_id", c1867107Sz.LIZLLL);
                if (c1867107Sz.LJ.length() > 0) {
                    linkedHashMap.put("from_prop_resource_id", c1867107Sz.LJ);
                }
                String str = map.get("prop_id");
                if (str == null || str.length() == 0 || (c1867007Sy = C1866507St.LIZIZ.LJ.get(str)) == null) {
                    c1867007Sy = new C1867007Sy((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047);
                }
                linkedHashMap.put("enter_from", c1867007Sy.LIZIZ);
                linkedHashMap.put("prop_id", c1867007Sy.LIZ);
                linkedHashMap.put("resource_id", c1867007Sy.LJFF);
                linkedHashMap.put("tab_name", c1867007Sy.LIZJ);
                if (!C13LP.LJJJJ(map.get("tab_key"), C1697810uHb.LJIIJJI("trending", "hot", "popular", "tr")) || !Intrinsics.LJFF(c1867007Sy.LIZLLL, "trending")) {
                    linkedHashMap.put("tab_key", c1867007Sy.LIZLLL);
                }
                linkedHashMap.put("impr_position", c1867007Sy.LJ);
                linkedHashMap.put("is_default_prop", c1867007Sy.LJII);
                C07T3.LIZ("prop_click_time", "prop_click", map, linkedHashMap);
            }
        }, new C07T8() { // from class: X.07SX
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "prop_discover_prop_click";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("shoot_way", "creation_id", "enter_from", "prop_id", "group_id", "impr_position");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                C07T3.LIZIZ("prop_discover_prop_click", map);
            }
        }, new C07T8() { // from class: X.07SY
            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "prop_discover_prop_show";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("shoot_way", "creation_id", "enter_from", "prop_id", "group_id", "impr_position");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                C1866507St.LJI = false;
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                String str = map.get("prop_id");
                if (str == null) {
                    return "";
                }
                return str;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                C07T3.LIZIZ("prop_discover_prop_show", map);
            }
        }, new C07T8() { // from class: X.07Sr
            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "prop_remove";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("shoot_way", "creation_id", "enter_from", "prop_id", "tab_name", "tab_key", "impr_position");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                C1866507St.LIZIZ.LIZ(null);
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("shoot_way", C1866507St.LIZ.LIZ.LIZ);
                C1867007Sy c1867007Sy = C1866507St.LIZIZ.LIZJ;
                if (c1867007Sy == null) {
                    c1867007Sy = new C1867007Sy((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047);
                }
                linkedHashMap.put("enter_from", c1867007Sy.LIZIZ);
                linkedHashMap.put("prop_id", c1867007Sy.LIZ);
                linkedHashMap.put("resource_id", c1867007Sy.LJFF);
                linkedHashMap.put("impr_position", c1867007Sy.LJ);
                C07T3.LIZ("prop_remove", "prop_click", map, linkedHashMap);
            }
        }, new C07T8() { // from class: X.07Ss
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "prop_save";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("shoot_way", "creation_id", "enter_from", "prop_id", "tab_name");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                String str = map.get("prop_id");
                if (str == null) {
                    return "";
                }
                return str;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                if (!Intrinsics.LJFF(map.get("enter_from"), "editor_pro_page")) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("shoot_way", C1866507St.LIZ.LIZ.LIZ);
                    C1867007Sy c1867007Sy = C1866507St.LIZIZ.LIZJ;
                    if (c1867007Sy == null) {
                        c1867007Sy = new C1867007Sy((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047);
                    }
                    linkedHashMap.put("enter_from", c1867007Sy.LIZIZ);
                    linkedHashMap.put("prop_id", c1867007Sy.LIZ);
                    linkedHashMap.put("resource_id", c1867007Sy.LJFF);
                    linkedHashMap.put("impr_position", c1867007Sy.LJ);
                    C07T3.LIZ("prop_save", "prop_click", map, linkedHashMap);
                }
            }
        }, new C07T8() { // from class: X.07SZ
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 0L;
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "prop_show";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("shoot_way", "creation_id", "enter_from", "prop_id", "tab_name", "tab_key", "impr_position", "effect_source");
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                String str = map.get("prop_id");
                if (str == null) {
                    return "";
                }
                return str;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
                C07T3.LIZIZ("prop_show", map);
            }
        }, new C07T8() { // from class: X.07SE
            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 0L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "select_auto_edit_mix_material";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
                if (Intrinsics.LJFF(map.get("is_edit_prop"), "1")) {
                    C1866507St.LJ = true;
                }
            }
        }));
        C07SL.LIZ(C1697810uHb.LJIIJJI(new C07T8() { // from class: X.07Qb
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "download";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }
        }, new C07T8() { // from class: X.07Qc
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "enter_multi_anchor_detail";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }
        }, new C07T8() { // from class: X.07Qd
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "favourite_video";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }
        }, new C07T8() { // from class: X.01iG
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 50L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "like";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }
        }, new C07T8() { // from class: X.07Qe
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "multi_anchor_entrance_click";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }
        }, new C07T8() { // from class: X.07Qf
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "multi_anchor_entrance_show";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }
        }, new C07T8() { // from class: X.07Qg
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "post_comment";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }
        }, new C07T8() { // from class: X.07Qh
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "share_video";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }
        }));
        C07SL.LIZ(Collections.singletonList(new C07T8() { // from class: X.07Qa
            @Override // X.C07T8
            public final void LIZ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String LIZIZ(Map<String, String> map) {
                return "";
            }

            @Override // X.C07T8
            public final long LIZJ() {
                return 100L;
            }

            @Override // X.C07T8
            public final void LJ(Map<String, String> map) {
            }

            @Override // X.C07T8
            public final String getEventName() {
                return "click_upload_entrance";
            }

            @Override // X.C07T8
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.C07T8
            public final C13BV LJFF() {
                return C13BV.INSTANCE;
            }
        }));
        C20684815ws.LIZ(new InterfaceC20685415wy() { // from class: X.07T7
            @Override // X.InterfaceC20685415wy
            public void onEvent(String str) {
            }

            @Override // X.InterfaceC20685415wy
            public final void onEvent(String str, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC20685415wy
            public final void LIZ(String str, Map<String, String> map) {
                C07T8 c07t8;
                String strLIZIZ;
                if (str != null && (c07t8 = C07SL.LIZ.get(str)) != null && map != null && !C13LP.LJJJJ(map.get("shoot_way"), C07SL.LIZJ)) {
                    C07SN c07sn = C07SL.LIZIZ;
                    C07T8 c07t82 = c07sn.LIZ.get(str);
                    if (c07t82 != null) {
                        long jLIZJ = c07t82.LIZJ();
                        if (jLIZJ > 0) {
                            String strLIZIZ2 = c07t82.LIZIZ(map);
                            if (!Intrinsics.LJFF(strLIZIZ2, "skip")) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(str);
                                sbLIZ.append('+');
                                sbLIZ.append(strLIZIZ2);
                                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ);
                                Long l = c07sn.LIZIZ.get(strLIZIZ3);
                                if (l != null && SystemClock.elapsedRealtime() - l.longValue() < jLIZJ) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("Detected that there are duplicate reports of event tracking within ");
                                    sbLIZ2.append(c07t82.LIZJ());
                                    sbLIZ2.append(" milliseconds");
                                    C01CY.LIZJ(str, map, Collections.singletonList("shoot_way"), null, C2188811AlT.LIZIZ(sbLIZ2));
                                } else {
                                    c07sn.LIZIZ.put(strLIZIZ3, Long.valueOf(SystemClock.elapsedRealtime()));
                                }
                            }
                        }
                    }
                    List<String> listLIZLLL = c07t8.LIZLLL();
                    C13BV c13bvLJFF = c07t8.LJFF();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str2 : listLIZLLL) {
                        if (!map.containsKey(str2)) {
                            arrayList.add(str2);
                        } else {
                            String str3 = map.get(str2);
                            if (!c13bvLJFF.contains(str2) && TextUtils.isEmpty(str3)) {
                                arrayList2.add(str2);
                            }
                        }
                    }
                    c07t8.LJ(map);
                    c07t8.LIZ(map);
                    if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                        return;
                    }
                    String strLIZIZ4 = "";
                    if (arrayList.isEmpty()) {
                        strLIZIZ = "";
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("These event params loss: ");
                        sbLIZ3.append(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
                        sbLIZ3.append(". ");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    if (!arrayList2.isEmpty()) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("These event params should not be empty: ");
                        sbLIZ4.append(C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62));
                        sbLIZ4.append(". ");
                        strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(strLIZIZ);
                    sbLIZ5.append('\n');
                    sbLIZ5.append(strLIZIZ4);
                    C01CY.LIZJ(str, null, null, null, C2188811AlT.LIZIZ(sbLIZ5));
                }
            }
        });
    }
}
