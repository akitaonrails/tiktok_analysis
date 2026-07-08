package com.ss.android.ugc.aweme.service;

import X.C0BOO;
import X.C0BTT;
import X.C1344390l5Z;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C1475700oVM;
import X.C15438062q;
import X.C19719912Dl;
import X.C20698815z8;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2206931BZb;
import X.C2206941BZc;
import X.C2209031Bcz;
import X.C2209051Bd1;
import X.C2209081Bd4;
import X.C2209101Bd6;
import X.C2209121Bd8;
import X.C2209131Bd9;
import X.C2209141BdA;
import X.C2252321DDq;
import X.C283160B7y;
import X.C294300BgC;
import X.C603820NmG;
import X.C708900RrM;
import X.EnumC2209071Bd3;
import X.EnumC993880byE;
import X.EnumC995540c0u;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.assem.CaptionMainActivityAssem;
import com.ss.android.ugc.aweme.setting.serverpush.model.ClaCombineSettings;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes35.dex */
public final class CaptionKevaServiceImpl implements ICaptionKevaService {
    public final String LIZ = "";

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final C19719912Dl LJIILL() {
        return C13LE.LIZ(CaptionMainActivityAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LIZ() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZIZ.getBoolean("user_has_interacted_with_guided_caption_tooltips", false);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LIZIZ() {
        C2209051Bd1.LIZ.getClass();
        Boolean bool = (Boolean) C2209051Bd1.LJIILJJIL.getValue();
        return bool != null ? bool.booleanValue() : C2209051Bd1.LJIIIIZZ().isOn();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final int LIZLLL() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZIZ.getInt(C2209051Bd1.LIZ("key_auto_dubbing_authorization_visit_personal_detail_count"), 0);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final long LJ() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZIZ.getLong("key_last_shown_always_translate_bottom_toast_time", 0L);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJFF() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZIZ.getBoolean("hide_caption", true);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJI() {
        C2209051Bd1.LIZ.getClass();
        Boolean bool = (Boolean) C2209051Bd1.LJIIIZ.getValue();
        return bool != null ? bool.booleanValue() : C2209051Bd1.LIZIZ().isOn();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final C2252321DDq LJIIIIZZ() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LJIJ;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final int LJIIIZ() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZIZ.getInt("key_always_translate_bottom_toast_show_count", 0);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final int LJIIJJI() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZIZ.getInt("search_video_card_caption_switch", 1);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final int LJIILIIL() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZIZ.getInt("user_guided_caption_tooltip_shown_count", 0);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJIJ() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZIZ.getBoolean(C2209051Bd1.LIZ("key_close_hint_comment_translation_cta_banner_showed"), false);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final C2252321DDq LJIJI() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LJIIL;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJIJJ() {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZIZ.storeBoolean(C2209051Bd1.LIZ("key_auto_dubbing_authorization_panel_showed"), true);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final C2252321DDq LJIJJLI() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LJIJI;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final C2252321DDq LJJ() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LJI;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJIFFI() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZIZ.getBoolean(C2209051Bd1.LIZ("key_auto_dubbing_authorization_banner_turn_on"), false);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final C2252321DDq LJJIII() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LJIILJJIL;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJIIJ() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJIIZI() {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZIZ.storeBoolean(C2209051Bd1.LIZ("key_close_hint_comment_translation_cta_banner_showed"), true);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJIJIIJI() {
        C2209051Bd1.LIZ.getClass();
        C708900RrM c708900RrM = (C708900RrM) C2209051Bd1.LJIIJJI.getValue();
        if (c708900RrM != null) {
            return c708900RrM.LIZ;
        }
        Keva keva = C2209051Bd1.LIZIZ;
        return (keva.contains("key_is_dm_translation_toggle_on") ? keva.getBoolean("key_is_dm_translation_toggle_on", false) ? EnumC2209071Bd3.MANUALLY_ON : EnumC2209071Bd3.MANUALLY_OFF : EnumC2209071Bd3.DEFAULT_OFF).isOn();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final int LJJIJL() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZIZ.getInt("key_do_not_translate_bottom_toast_show_count", 0);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJIJLIJ() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZIZ.getBoolean(C2209051Bd1.LIZ("key_auto_dubbing_authorization_panel_showed"), false);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final long LJJIZ() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZIZ.getLong("key_last_shown_do_not_translate_bottom_toast_time", 0L);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJJ() {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZIZ.storeStringArray("key_autogenerated_caption_toggle_pending_list", new String[0]);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final C2252321DDq LJJJIL() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LJIILIIL;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final EnumC2209071Bd3 LJJJJ() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LJ();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJJJI() {
        C2209051Bd1.LIZ.getClass();
        Boolean bool = (Boolean) C2209051Bd1.LJII.getValue();
        return bool != null ? bool.booleanValue() : C2209051Bd1.LJIIIZ().isOn();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJJJJL() {
        C2209051Bd1.LIZ.getClass();
        Boolean bool = (Boolean) C2209051Bd1.LJIIIIZZ.getValue();
        return bool != null ? bool.booleanValue() : C2209051Bd1.LIZJ().isOn();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJJJL() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZIZ.getBoolean(C2209051Bd1.LIZ("key_open_hint_comment_translation_cta_banner_showed"), false);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final String[] LJJJJLL() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZIZ.getStringArray("realtime_caption_disk_lru_cache", null);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJJJZ() {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZIZ.storeBoolean("key_has_shown_do_not_translate_toggle_prompt", false);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJJLIIL() {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZIZ.storeBoolean(C2209051Bd1.LIZ("key_auto_dubbing_authorization_banner_turn_on"), true);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJJLZIJ() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJL() {
        C2209051Bd1 c2209051Bd1 = C2209051Bd1.LIZ;
        Keva keva = C2209051Bd1.LIZIZ;
        c2209051Bd1.getClass();
        if (keva.contains(C2209051Bd1.LIZ("key_comment_translation_on_by_trigger_timestamp"))) {
            return System.currentTimeMillis() - keva.getLong(C2209051Bd1.LIZ("key_comment_translation_on_by_trigger_timestamp"), System.currentTimeMillis()) >= 86400000;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJLIIIIJ() {
        C2209051Bd1.LIZ.getClass();
        if (((Boolean) C0BOO.LIZ.getValue()).booleanValue() && ((Number) C283160B7y.LIZ.getValue()).intValue() == 2) {
            String strLIZ = C2209051Bd1.LIZ("key_auto_dubbing_authorization_panel_showed");
            Keva keva = C2209051Bd1.LIZIZ;
            if (!keva.getBoolean(strLIZ, false) && !keva.getBoolean(C2209051Bd1.LIZ("key_auto_dubbing_authorization_banner_showed"), false)) {
                String strLIZ2 = C2209051Bd1.LIZ("key_auto_dubbing_authorization_check_banner_timestamp");
                long j = keva.getLong(strLIZ2, 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (j == 0) {
                    keva.storeLong(strLIZ2, jCurrentTimeMillis);
                } else {
                    EnumC2209071Bd3 enumC2209071Bd3LIZIZ = C2209051Bd1.LIZIZ();
                    EnumC2209071Bd3 enumC2209071Bd3 = EnumC2209071Bd3.MANUALLY_OFF;
                    if (enumC2209071Bd3LIZIZ != enumC2209071Bd3 && C2209051Bd1.LIZJ() != enumC2209071Bd3 && jCurrentTimeMillis - j >= 604800000 && !keva.getBoolean(C2209051Bd1.LIZ("key_auto_dubbing_authorization_enter_personal_detail"), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJLIIIJ() {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZIZ.storeBoolean(C2209051Bd1.LIZ("key_open_hint_comment_translation_cta_banner_showed"), true);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final EnumC2209071Bd3 LJJLIIIJILLIZJL() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final EnumC2209071Bd3 LJJLIIIJJI() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJLIIIJJIZ() {
        C2209051Bd1.LIZ.getClass();
        String strLIZ = C2209051Bd1.LIZ("key_auto_dubbing_authorization_visit_personal_detail_count");
        String strLIZ2 = C2209051Bd1.LIZ("key_auto_dubbing_authorization_visit_personal_detail_count");
        Keva keva = C2209051Bd1.LIZIZ;
        keva.storeInt(strLIZ, keva.getInt(strLIZ2, 0) + 1);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJLIIIJL() {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZIZ.storeBoolean(C2209051Bd1.LIZ("key_is_auto_dubbing_consumption_tag_clicked"), true);
        C2252321DDq c2252321DDq = C2209051Bd1.LJIIJ;
        c2252321DDq.setValue(Long.valueOf(((Number) c2252321DDq.getValue()).longValue() + 1));
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final long LJJLIIIJLLLLLLLZ() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZIZ.getLong("user_last_shown_guided_caption_tooltip_time", 0L);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final C2252321DDq LJJLIL() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LJIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final C2252321DDq LJJLJ() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LJIIZILJ;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJLL() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZIZ.getBoolean(C2209051Bd1.LIZ("key_is_auto_dubbing_consumption_tag_clicked"), false);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJZZIII() {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZIZ.storeBoolean(C2209051Bd1.LIZ("key_auto_dubbing_authorization_enter_personal_detail"), true);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJL() {
        C2209051Bd1.LIZ.getClass();
        Boolean bool = (Boolean) C2209051Bd1.LJIIL.getValue();
        return bool != null ? bool.booleanValue() : C2209051Bd1.LJFF().isOn();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final C2252321DDq LJLIIIL() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LJIIJJI;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJLILLLLZI() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LJI();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final C2252321DDq LJLJJI() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJLJJL() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZIZ.getBoolean("key_has_shown_do_not_translate_toggle_prompt", false);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final Map<String, String> LJLJLLL() {
        C2209051Bd1.LIZ.getClass();
        String[] stringArray = C2209051Bd1.LIZIZ.getStringArray(C2209051Bd1.LJFF, new String[0]);
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(stringArray.length);
        for (String str : stringArray) {
            Object objLJJJLL = C13LP.LJJJLL(a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6));
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(1, a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6));
            if (objLJJJLL != null && objLJJJLZIJ != null) {
                map.put(objLJJJLL, objLJJJLZIJ);
            }
            arrayList.add(Unit.LIZ);
        }
        return map;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final EnumC2209071Bd3 LJLLI() {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJLLILLLL() {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZIZ.storeBoolean(C2209051Bd1.LIZ("key_auto_dubbing_authorization_banner_showed"), true);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final String LJIIZILJ() {
        return this.LIZ;
    }

    public static int LJLLL(boolean z) {
        EnumC2209071Bd3 enumC2209071Bd3;
        EnumC2209071Bd3.Companion.getClass();
        if (z) {
            enumC2209071Bd3 = EnumC2209071Bd3.MANUALLY_ON;
        } else {
            enumC2209071Bd3 = EnumC2209071Bd3.MANUALLY_OFF;
        }
        return enumC2209071Bd3.getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LIZJ(int i) {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZIZ.storeInt("key_do_not_translate_bottom_toast_show_count", i);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJIIJ(boolean z) {
        if (!C0BTT.LIZ()) {
            C1475700oVM.LIZ().LJIIZILJ(z);
        }
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LJIILJJIL.setValue(Boolean.valueOf(z));
        C2209051Bd1.LIZIZ.storeBoolean("key_is_caption_on_for_native_lang", z);
        C20698815z8.LIZ().LIZ(new ClaCombineSettings(null, null, null, Integer.valueOf(LJLLL(z)), null, null, null));
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJIIL(String str) {
        C2209051Bd1.LIZ.getClass();
        return C2209051Bd1.LJ.contains(str);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJIILJJIL(String str) {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZIZ.storeString("key_selected_cec_edit_language", str);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJIILLIIL(boolean z) {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZIZ.storeBoolean("user_has_interacted_with_guided_caption_tooltips", z);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJI(boolean z) {
        EnumC2209071Bd3 enumC2209071Bd3;
        EnumC2209071Bd3 enumC2209071Bd32;
        C2209051Bd1 c2209051Bd1 = C2209051Bd1.LIZ;
        if (z) {
            enumC2209071Bd3 = EnumC2209071Bd3.MANUALLY_ON;
        } else {
            enumC2209071Bd3 = EnumC2209071Bd3.MANUALLY_OFF;
        }
        int value = enumC2209071Bd3.getValue();
        c2209051Bd1.getClass();
        C2209051Bd1.LJIILIIL(value);
        if (z) {
            enumC2209071Bd32 = EnumC2209071Bd3.MANUALLY_ON;
        } else {
            enumC2209071Bd32 = EnumC2209071Bd3.MANUALLY_OFF;
        }
        C20698815z8.LIZ().LIZ(new ClaCombineSettings(null, null, null, null, null, Integer.valueOf(enumC2209071Bd32.getValue()), null));
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJII(long j) {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZIZ.storeLong("user_last_shown_guided_caption_tooltip_time", j);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJIIJZLJL(String str) {
        C2209051Bd1.LIZ.getClass();
        if (C2209051Bd1.LJIJJ.LIZJ(str) != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJIJ(String str) {
        C2209051Bd1 c2209051Bd1 = C2209051Bd1.LIZ;
        Keva keva = C2209051Bd1.LIZJ;
        c2209051Bd1.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show_edit_caption_hint_count_");
        sbLIZ.append(str);
        if (keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0) > 2) {
            return false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("exhaust_edit_caption_hint_");
        sbLIZ2.append(str);
        if (keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ2), false)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJIJIL(List<String> list) {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZIZ.storeStringArray("realtime_caption_disk_lru_cache", (String[]) list.toArray(new String[0]));
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJIL(String str) {
        C2209051Bd1.LIZ.getClass();
        if (str == null || C13LQ.LJJIJIIJI(str, C2209051Bd1.LIZIZ.getStringArray("key_autogenerated_caption_toggle_pending_list", new String[0])) < 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJJI(boolean z) {
        if (!C0BTT.LIZ()) {
            C1475700oVM.LIZ().LJIIZILJ(z);
        }
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LJIIL.setValue(Boolean.valueOf(z));
        C2209051Bd1.LIZIZ.storeBoolean("key_is_caption_on_for_foreign_lang", z);
        C20698815z8.LIZ().LIZ(new ClaCombineSettings(null, null, Integer.valueOf(LJLLL(z)), null, null, null, null));
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJJJIZL(Map<String, String> map) {
        C2209051Bd1.LIZ.getClass();
        Keva keva = C2209051Bd1.LIZIZ;
        String str = C2209051Bd1.LJFF;
        HashMap map2 = (HashMap) map;
        Set<String> setKeySet = map2.keySet();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setKeySet, 10));
        for (String str2 : setKeySet) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(',');
            sbLIZ.append((String) map2.get(str2));
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        keva.storeStringArray(str, (String[]) arrayList.toArray(new String[0]));
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJJJJ(int i) {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZIZ.storeInt("key_always_translate_bottom_toast_show_count", i);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJJJLI(PushSettings pushSettings) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        boolean zLJI = MethodIDManager.LJI(202464);
        ClaCombineSettings claCombineSettings = pushSettings.claCombineSettings;
        int iIntValue7 = 0;
        if (claCombineSettings != null && (num7 = claCombineSettings.enableMasterTranslation) != null) {
            iIntValue = num7.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        C2209051Bd1.LIZ.getClass();
        Integer numLIZ = C2209101Bd6.LIZ(numValueOf, C2209051Bd1.LJII(), new C2209131Bd9());
        ClaCombineSettings claCombineSettings2 = pushSettings.claCombineSettings;
        if (claCombineSettings2 != null && (num6 = claCombineSettings2.enableStickerTranslation) != null) {
            iIntValue2 = num6.intValue();
        } else {
            iIntValue2 = 0;
        }
        Integer numLIZ2 = C2209101Bd6.LIZ(Integer.valueOf(iIntValue2), C2209051Bd1.LJIIIZ(), new C2209081Bd4(pushSettings));
        ClaCombineSettings claCombineSettings3 = pushSettings.claCombineSettings;
        if (claCombineSettings3 != null && (num5 = claCombineSettings3.enableForeignCaption) != null) {
            iIntValue3 = num5.intValue();
        } else {
            iIntValue3 = 0;
        }
        Integer numLIZ3 = C2209101Bd6.LIZ(Integer.valueOf(iIntValue3), C2209051Bd1.LJFF(), new C2206931BZb());
        ClaCombineSettings claCombineSettings4 = pushSettings.claCombineSettings;
        if (claCombineSettings4 != null && (num4 = claCombineSettings4.enableNativeCaption) != null) {
            iIntValue4 = num4.intValue();
        } else {
            iIntValue4 = 0;
        }
        Integer numLIZ4 = C2209101Bd6.LIZ(Integer.valueOf(iIntValue4), C2209051Bd1.LJIIIIZZ(), new C2206941BZc());
        ClaCombineSettings claCombineSettings5 = pushSettings.claCombineSettings;
        if (claCombineSettings5 != null && (num3 = claCombineSettings5.enableAutoDubbing) != null) {
            iIntValue5 = num3.intValue();
        } else {
            iIntValue5 = 0;
        }
        Integer numLIZ5 = C2209101Bd6.LIZ(Integer.valueOf(iIntValue5), C2209051Bd1.LIZJ(), new C2209031Bcz());
        ClaCombineSettings claCombineSettings6 = pushSettings.claCombineSettings;
        if (claCombineSettings6 != null && (num2 = claCombineSettings6.enableAutoDubbingConsumption) != null) {
            iIntValue6 = num2.intValue();
        } else {
            iIntValue6 = 0;
        }
        Integer numLIZIZ = C2209101Bd6.LIZIZ(Integer.valueOf(iIntValue6), C2209051Bd1.LIZIZ(), new C2209121Bd8(pushSettings));
        ClaCombineSettings claCombineSettings7 = pushSettings.claCombineSettings;
        if (claCombineSettings7 != null && (num = claCombineSettings7.enableCommentAutoTranslation) != null) {
            iIntValue7 = num.intValue();
        }
        ClaCombineSettings claCombineSettings8 = new ClaCombineSettings(numLIZ, numLIZ2, numLIZ3, numLIZ4, numLIZ5, numLIZIZ, C2209101Bd6.LIZIZ(Integer.valueOf(iIntValue7), C2209051Bd1.LJ(), new AwS578S0100000_34(pushSettings, 130)));
        if (claCombineSettings8.enableMasterTranslation != null || claCombineSettings8.enableStickerTranslation != null || claCombineSettings8.enableNativeCaption != null || claCombineSettings8.enableForeignCaption != null || claCombineSettings8.enableAutoDubbing != null || claCombineSettings8.enableAutoDubbingConsumption != null || claCombineSettings8.enableCommentAutoTranslation != null) {
            C20698815z8.LIZ().LIZ(claCombineSettings8);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJJLL(int i) {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZIZ.storeInt("user_guided_caption_tooltip_shown_count", i);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJLI(String str) {
        C2209051Bd1.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show_edit_caption_hint_count_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Keva keva = C2209051Bd1.LIZJ;
        keva.storeInt(strLIZIZ, keva.getInt(strLIZIZ, 0) + 1);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJLIIIJLJLI(String str) {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LJIJJLI.LJ(str);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJLIIJ(String str) {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LJ.add(str);
        C2209051Bd1.LIZIZ.storeStringSet("tap_to_edit_encountered_aweme_ids", C2209051Bd1.LJ);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJLJLI(String str) {
        C2209051Bd1 c2209051Bd1 = C2209051Bd1.LIZ;
        Keva keva = C2209051Bd1.LIZJ;
        c2209051Bd1.getClass();
        if (keva.getInt(C2209051Bd1.LJIILL(str), 0) > 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJZ(long j) {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZIZ.storeLong("key_last_shown_always_translate_bottom_toast_time", j);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJZZI(long j) {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZLLL.add(Long.valueOf(j));
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJLIIL(int i) {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZIZ.storeInt("search_video_card_caption_switch", i);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJLJI(boolean z) {
        EnumC2209071Bd3 enumC2209071Bd3;
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LJII.setValue(Boolean.valueOf(z));
        C2209051Bd1.LIZIZ.storeBoolean("key_is_sticker_translation_toggle_on", z);
        if (z) {
            enumC2209071Bd3 = EnumC2209071Bd3.MANUALLY_ON;
        } else {
            enumC2209071Bd3 = EnumC2209071Bd3.MANUALLY_OFF;
        }
        C20698815z8.LIZ().LIZ(new ClaCombineSettings(null, Integer.valueOf(enumC2209071Bd3.getValue()), null, null, null, null, null));
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJLJJLL(String str) {
        C2209051Bd1.LIZ.getClass();
        Keva keva = C2209051Bd1.LIZIZ;
        List listLJLI = C13LQ.LJLI(keva.getStringArray("key_autogenerated_caption_toggle_pending_list", new String[0]));
        ((ArrayList) listLJLI).remove(str);
        keva.storeStringArray("key_autogenerated_caption_toggle_pending_list", (String[]) ((ArrayList) listLJLI).toArray(new String[0]));
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJLJL(String str) {
        C2209051Bd1 c2209051Bd1 = C2209051Bd1.LIZ;
        Keva keva = C2209051Bd1.LIZJ;
        c2209051Bd1.getClass();
        keva.storeInt(C2209051Bd1.LJIILL(str), keva.getInt(C2209051Bd1.LJIILL(str), 0) + 1);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJLJLJ(long j) {
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LIZIZ.storeLong("key_last_shown_do_not_translate_bottom_toast_time", j);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJII(Function0 function0, boolean z) {
        EnumC2209071Bd3 enumC2209071Bd3;
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LJIIIIZZ.setValue(Boolean.valueOf(z));
        C2209051Bd1.LIZIZ.storeBoolean(C2209051Bd1.LIZ("key_is_auto_dubbing_toggle_on"), z);
        if (z) {
            enumC2209071Bd3 = EnumC2209071Bd3.MANUALLY_ON;
        } else {
            enumC2209071Bd3 = EnumC2209071Bd3.MANUALLY_OFF;
        }
        C20698815z8.LIZ().LIZ(new ClaCombineSettings(null, null, null, null, Integer.valueOf(enumC2209071Bd3.getValue()), null, null));
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final Long LJIL(String str, String str2) {
        boolean z;
        C2209141BdA c2209141BdA;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || str2 == null || str2.length() == 0) {
            return null;
        }
        C2209051Bd1.LIZ.getClass();
        Map<String, C2209141BdA> mapLIZJ = C2209051Bd1.LJIJJLI.LIZJ(str);
        if (mapLIZJ == null || (c2209141BdA = mapLIZJ.get(str2)) == null) {
            return null;
        }
        return c2209141BdA.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJIIZ(String str, String str2) {
        C2209141BdA c2209141BdA;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return false;
        }
        C2209051Bd1.LIZ.getClass();
        Map<String, C2209141BdA> mapLIZJ = C2209051Bd1.LJIJJLI.LIZJ(str);
        if (mapLIZJ != null && (c2209141BdA = mapLIZJ.get(str2)) != null && c2209141BdA.LIZ != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJIJIIJIL(String str, String str2) {
        C2209141BdA c2209141BdA;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return false;
        }
        C2209051Bd1.LIZ.getClass();
        Map<String, C2209141BdA> mapLIZJ = C2209051Bd1.LJIJJLI.LIZJ(str);
        EnumC995540c0u enumC995540c0u = null;
        if (mapLIZJ != null && (c2209141BdA = mapLIZJ.get(str2)) != null) {
            enumC995540c0u = c2209141BdA.LIZ;
        }
        if (enumC995540c0u == EnumC995540c0u.LLILLJJLI) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJJJZI(String str, String str2) {
        EnumC995540c0u enumC995540c0u;
        long jCurrentTimeMillis;
        Long l;
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            C2209051Bd1.LIZ.getClass();
            C603820NmG<String, Map<String, C2209141BdA>> c603820NmG = C2209051Bd1.LJIJJLI;
            Map<String, C2209141BdA> mapLIZJ = c603820NmG.LIZJ(str);
            if (mapLIZJ != null) {
                C2209141BdA c2209141BdA = mapLIZJ.get(str2);
                if (c2209141BdA != null) {
                    enumC995540c0u = c2209141BdA.LIZ;
                } else {
                    enumC995540c0u = null;
                }
                EnumC995540c0u enumC995540c0u2 = EnumC995540c0u.LLILLJJLI;
                if (enumC995540c0u != enumC995540c0u2) {
                    if (c2209141BdA != null && (l = c2209141BdA.LIZIZ) != null) {
                        jCurrentTimeMillis = l.longValue();
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    mapLIZJ.put(str2, new C2209141BdA(enumC995540c0u2, null, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
                    return;
                }
                return;
            }
            c603820NmG.LIZLLL(str, C2097608Jq.LJIIJ(new Pair(str2, new C2209141BdA(EnumC995540c0u.LLILLJJLI, null, 0L))));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJJZ(String str, boolean z) {
        if (!C0BTT.LIZ()) {
            C1475700oVM.LIZ().LJJJLIIL(z);
        }
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LJIILJJIL(str, z);
        C20698815z8.LIZ().LIZ(new ClaCombineSettings(Integer.valueOf(LJLLL(z)), null, null, null, null, null, null));
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJLI(String str, boolean z) {
        C2209051Bd1.LIZ.getClass();
        if (z) {
            C2209051Bd1.LJIJJ.LIZLLL(str, Unit.LIZ);
            C2209051Bd1.LJIJI.setValue(str);
        } else {
            C2209051Bd1.LJIJJ.LJ(str);
            C2209051Bd1.LJIJI.setValue("");
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJLIL(Boolean bool, C1344390l5Z c1344390l5Z) {
        EnumC993880byE enumC993880byE;
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LJIIL(bool, c1344390l5Z);
        if (C294300BgC.LIZ()) {
            EnumC993880byE enumC993880byE2 = null;
            if (c1344390l5Z != null) {
                enumC993880byE = c1344390l5Z.LIZ;
            } else {
                enumC993880byE = null;
            }
            if (enumC993880byE != EnumC993880byE.CLICK_COMMENT_TRANSLATION_TOGGLE) {
                if (c1344390l5Z != null) {
                    enumC993880byE2 = c1344390l5Z.LIZ;
                }
                if (enumC993880byE2 != EnumC993880byE.TRIGGER_BY_CLICK_SEE_TRANSLATION_SOMETIMES) {
                    return;
                }
            }
            C20698815z8.LIZ().LIZ(new ClaCombineSettings(null, null, null, null, null, null, Integer.valueOf(LJJJJ().getValue())));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJLL(String str, boolean z) {
        if (!C0BTT.LIZ()) {
            C1475700oVM.LIZ().LJJJLIIL(z);
        }
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LJIIJJI.setValue(new C708900RrM(z, str));
        C2209051Bd1.LIZIZ.storeBoolean("key_is_dm_translation_toggle_on", z);
        C20698815z8.LIZ().LIZ(new ClaCombineSettings(Integer.valueOf(LJLLL(z)), null, null, null, null, null, null));
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJLLJ(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            C2209051Bd1.LIZ.getClass();
            C603820NmG<String, Map<String, C2209141BdA>> c603820NmG = C2209051Bd1.LJIJJLI;
            Map<String, C2209141BdA> mapLIZJ = c603820NmG.LIZJ(str);
            if (mapLIZJ != null) {
                if (mapLIZJ.get(str2) == null) {
                    mapLIZJ.put(str2, new C2209141BdA(EnumC995540c0u.LL, Long.valueOf(System.currentTimeMillis()), null));
                    return;
                }
                return;
            }
            c603820NmG.LIZLLL(str, C2097608Jq.LJIIJ(new Pair(str2, new C2209141BdA(EnumC995540c0u.LL, Long.valueOf(System.currentTimeMillis()), null))));
        }
    }
}
