package com.ss.android.ugc.aweme.tako.botpage.bottombox.skilllabel;

import X.C1227904rF;
import X.C13BV;
import X.C1852690yJP;
import X.C1852820yJc;
import X.C1853740yL6;
import X.C1854130yLj;
import X.C1854260yLw;
import X.C1854490yMJ;
import X.C1854520yMM;
import X.C1854530yMN;
import X.C1854540yMO;
import X.C1854560yMQ;
import X.C1855110yNJ;
import X.C1855670yOD;
import X.C1862330yYx;
import X.EnumC1854550yMP;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyle;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.NewActionBarItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoStandardRatio;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.router.model.TakoTemplateInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoInputSkillLabelViewModel extends AssemViewModel<C1854530yMN> {
    public static final /* synthetic */ int LLIZ = 0;
    public String LLILLL;
    public long LLILZ;
    public TakoTemplateInfo LLILZIL;
    public final C1227904rF LL = C1227904rF.LIZ;
    public final List<C1854540yMO> LLILLJJLI = new ArrayList();
    public final Map<String, String> LLILZLL = new LinkedHashMap();

    public final void DQ2() {
        C1854530yMN state = getState();
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str = (String) ((LinkedHashMap) this.LLILZLL).get("enter_from");
        String str2 = (String) ((LinkedHashMap) this.LLILZLL).get("enter_method");
        String str3 = (String) ((LinkedHashMap) this.LLILZLL).get("process_id");
        String str4 = this.LLILLL;
        String skillModeType = state.LL.LIZ.getSkillModeType();
        String strLIZJ = C1853740yL6.LIZJ(xQ2());
        String str5 = (String) ((LinkedHashMap) this.LLILZLL).get("tako_session_id");
        if (str5 == null) {
            str5 = "";
        }
        C1862330yYx.LJLJI(c1862330yYx, str, str2, str3, "ratio_selection", null, null, null, null, null, str4, skillModeType, strLIZJ, null, str5, (String) ((LinkedHashMap) this.LLILZLL).get("tako_chat_id"), 37360);
    }

    public final void EQ2() {
        EnumC1854550yMP enumC1854550yMP = getState().LL.LIZ;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str = (String) ((LinkedHashMap) this.LLILZLL).get("enter_from");
        String str2 = (String) ((LinkedHashMap) this.LLILZLL).get("enter_method");
        String str3 = (String) ((LinkedHashMap) this.LLILZLL).get("process_id");
        String str4 = (String) ((LinkedHashMap) this.LLILZLL).get("tako_session_id");
        if (str4 == null) {
            str4 = "";
        }
        C1862330yYx.LJLI(c1862330yYx, str, str2, str3, str4, (String) ((LinkedHashMap) this.LLILZLL).get("tako_chat_id"), "off", C1854490yMJ.LJIIIIZZ(enumC1854550yMP), null, null, null, this.LLILLL, "base", 4992);
    }

    public final void FQ2() {
        EnumC1854550yMP enumC1854550yMP = getState().LL.LIZ;
        if (enumC1854550yMP == EnumC1854550yMP.NONE) {
            return;
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str = (String) ((LinkedHashMap) this.LLILZLL).get("enter_from");
        String str2 = (String) ((LinkedHashMap) this.LLILZLL).get("enter_method");
        String str3 = (String) ((LinkedHashMap) this.LLILZLL).get("process_id");
        String str4 = (String) ((LinkedHashMap) this.LLILZLL).get("tako_session_id");
        if (str4 == null) {
            str4 = "";
        }
        C1862330yYx.LJLIIIL(c1862330yYx, str, str2, str3, str4, (String) ((LinkedHashMap) this.LLILZLL).get("tako_chat_id"), "on", C1854490yMJ.LJIIIIZZ(enumC1854550yMP), null, null, this.LLILLL, "base", 2432);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1854530yMN(0);
    }

    public final Integer xQ2() {
        Integer num;
        TakoTemplateInfo takoTemplateInfo = this.LLILZIL;
        if (takoTemplateInfo != null && (num = takoTemplateInfo.generateType) != null) {
            return num;
        }
        int i = C1854560yMQ.LIZ[getState().LL.LIZ.ordinal()];
        if (i != 1) {
            return i == 2 ? 1 : null;
        }
        return 2;
    }

    public final Map<String, String> yQ2() {
        C1855670yOD.LIZ.getClass();
        if (!C1855670yOD.LIZ()) {
            return null;
        }
        C1854530yMN state = getState();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("skill_mode", state.LL.LIZ.getSkillModeType());
        linkedHashMap.put("mode_source", this.LLILLL);
        ConvertStyleItem convertStyleItem = state.LLILLL;
        linkedHashMap.put("style_name", convertStyleItem != null ? convertStyleItem.nameStarling : null);
        TakoStandardRatio takoStandardRatio = state.LLILLJJLI;
        linkedHashMap.put("ratio", takoStandardRatio != null ? Integer.valueOf(takoStandardRatio.stdSize).toString() : null);
        linkedHashMap.put("generate_type", C1853740yL6.LIZJ(xQ2()));
        TakoTemplateInfo takoTemplateInfo = this.LLILZIL;
        linkedHashMap.put("template_id", takoTemplateInfo != null ? takoTemplateInfo.templateId : null);
        TakoTemplateInfo takoTemplateInfo2 = this.LLILZIL;
        linkedHashMap.put("tab_id", takoTemplateInfo2 != null ? takoTemplateInfo2.tabId : null);
        TakoTemplateInfo takoTemplateInfo3 = this.LLILZIL;
        linkedHashMap.put("template_tab", takoTemplateInfo3 != null ? takoTemplateInfo3.tabName : null);
        return linkedHashMap;
    }

    public final void BQ2() {
        Integer numLIZ;
        if (getState().LL.LIZ == EnumC1854550yMP.DEEP_THINK || (numLIZ = C1854130yLj.LIZ()) == null || numLIZ.intValue() != 1 || C1854130yLj.LIZ <= 0) {
            return;
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str = (String) ((LinkedHashMap) this.LLILZLL).get("enter_from");
        String str2 = (String) ((LinkedHashMap) this.LLILZLL).get("enter_method");
        String str3 = (String) ((LinkedHashMap) this.LLILZLL).get("process_id");
        long jCurrentTimeMillis = System.currentTimeMillis() - C1854130yLj.LIZ;
        String str4 = (String) ((LinkedHashMap) this.LLILZLL).get("tako_session_id");
        if (str4 == null) {
            str4 = "";
        }
        C1862330yYx.LJL(544, jCurrentTimeMillis, c1862330yYx, str, str2, str3, "deep_thinking", null, "deep_thinking", str4, (String) ((LinkedHashMap) this.LLILZLL).get("tako_chat_id"));
    }

    public final void GQ2() {
        EnumC1854550yMP enumC1854550yMP = getState().LL.LIZ;
        if (enumC1854550yMP == EnumC1854550yMP.NONE) {
            return;
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str = (String) ((LinkedHashMap) this.LLILZLL).get("enter_from");
        String str2 = (String) ((LinkedHashMap) this.LLILZLL).get("enter_method");
        String str3 = (String) ((LinkedHashMap) this.LLILZLL).get("process_id");
        String strLJIIIIZZ = C1854490yMJ.LJIIIIZZ(enumC1854550yMP);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZ;
        String str4 = this.LLILLL;
        String str5 = (String) ((LinkedHashMap) this.LLILZLL).get("tako_session_id");
        if (str5 == null) {
            str5 = "";
        }
        C1862330yYx.LJL(544, jCurrentTimeMillis, c1862330yYx, str, str2, str3, strLJIIIIZZ, null, str4, str5, (String) ((LinkedHashMap) this.LLILZLL).get("tako_chat_id"));
    }

    public static int wQ2(BaseImage baseImage) {
        if (baseImage != null) {
            C1854260yLw c1854260yLw = C1854260yLw.LIZ;
            Float fValueOf = Float.valueOf(baseImage.width);
            Float fValueOf2 = Float.valueOf(baseImage.height);
            c1854260yLw.getClass();
            return C1854260yLw.LIZLLL(fValueOf, fValueOf2);
        }
        C1855110yNJ.LIZ.getClass();
        if (C1855110yNJ.LIZ()) {
            return 2;
        }
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[PHI: r1
      0x00b1: PHI (r1v4 com.ss.android.ugc.aweme.tako.router.model.TakoCreativeTaskInfo) = 
      (r1v3 com.ss.android.ugc.aweme.tako.router.model.TakoCreativeTaskInfo)
      (r1v3 com.ss.android.ugc.aweme.tako.router.model.TakoCreativeTaskInfo)
      (r1v9 com.ss.android.ugc.aweme.tako.router.model.TakoCreativeTaskInfo)
     binds: [B:39:0x009d, B:50:0x00ca, B:43:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> vQ2(boolean r5) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.bottombox.skilllabel.TakoInputSkillLabelViewModel.vQ2(boolean):java.util.Map");
    }

    public final void CQ2(Integer num, String str) {
        String string;
        C1854530yMN state = getState();
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str2 = (String) ((LinkedHashMap) this.LLILZLL).get("enter_from");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = (String) ((LinkedHashMap) this.LLILZLL).get("enter_method");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = (String) ((LinkedHashMap) this.LLILZLL).get("process_id");
        if (str5 == null) {
            str5 = "";
        }
        String str6 = this.LLILLL;
        String skillModeType = state.LL.LIZ.getSkillModeType();
        String strLIZJ = C1853740yL6.LIZJ(xQ2());
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        String str7 = (String) ((LinkedHashMap) this.LLILZLL).get("tako_session_id");
        if (str7 == null) {
            str7 = "";
        }
        String str8 = (String) ((LinkedHashMap) this.LLILZLL).get("tako_chat_id");
        if (str8 != null) {
            str3 = str8;
        }
        C1862330yYx.LJIIZILJ(c1862330yYx, str2, str4, str5, "ratio_selection", str, null, null, str6, skillModeType, strLIZJ, string, str7, str3, 8288);
    }

    public final void zQ2(C1852820yJc c1852820yJc, Map<String, String> map) {
        NewActionBarItem next;
        List list;
        List<NewActionBarItem> list2 = c1852820yJc.LIZIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<NewActionBarItem> it2 = list2.iterator();
        while (it2.hasNext()) {
            EnumC1854550yMP enumC1854550yMPLJFF = C1854490yMJ.LJFF(Integer.valueOf(it2.next().type));
            Iterator<NewActionBarItem> it3 = c1852820yJc.LIZIZ.iterator();
            do {
                next = null;
                if (!it3.hasNext()) {
                    break;
                } else {
                    next = it3.next();
                }
            } while (next.type != C1854490yMJ.LIZIZ(enumC1854550yMPLJFF));
            NewActionBarItem newActionBarItem = next;
            if (newActionBarItem != null) {
                String str = newActionBarItem.skillNameText;
                if (str == null) {
                    str = "";
                }
                String str2 = newActionBarItem.skillDescription;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = newActionBarItem.skillDefaultPrompt;
                if (str3 == null) {
                    str3 = "";
                }
                List<Integer> list3 = newActionBarItem.subSkills;
                ConvertStyle convertStyle = c1852820yJc.LJ;
                if (convertStyle == null || (list = convertStyle.styleList) == null) {
                    list = C13BV.INSTANCE;
                }
                List list4 = newActionBarItem.standardRatio;
                if (list4 == null) {
                    list4 = C13BV.INSTANCE;
                }
                arrayList.add(new C1854540yMO(enumC1854550yMPLJFF, str, str2, str3, list3, list, list4, C1852690yJP.LJI(newActionBarItem), c1852820yJc.LIZ, newActionBarItem.skillDescriptions, 512));
            }
        }
        ((ArrayList) this.LLILLJJLI).addAll(arrayList);
        this.LLILZLL.putAll(map);
    }

    public final void AQ2(EnumC1854550yMP enumC1854550yMP, String str, String str2, Integer num, TakoTemplateInfo takoTemplateInfo, boolean z) {
        Object next;
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C1854540yMO) next).LIZ == enumC1854550yMP) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1854540yMO c1854540yMO = (C1854540yMO) next;
        if (c1854540yMO == null) {
            c1854540yMO = new C1854540yMO(enumC1854550yMP, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (TakoSug) null, (String) null, (List) null, 2046);
        }
        setStateImmediate(new C1854520yMM(this, str, takoTemplateInfo, enumC1854550yMP, new C1854540yMO(c1854540yMO.LIZ, c1854540yMO.LIZIZ, c1854540yMO.LIZJ, c1854540yMO.LIZLLL, c1854540yMO.LJ, c1854540yMO.LJFF, c1854540yMO.LJI, c1854540yMO.LJII, c1854540yMO.LJIIIIZZ, z, c1854540yMO.LJIIJ), num, str2));
    }
}
