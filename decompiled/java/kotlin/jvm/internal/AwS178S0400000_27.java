package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.C013C;
import X.C09AY;
import X.C13LC;
import X.C13LP;
import X.C1558520qew;
import X.C1852810yJb;
import X.C1854150yLl;
import X.C1854760yMk;
import X.C1855030yNB;
import X.C1855050yND;
import X.C1855180yNQ;
import X.C1855350yNh;
import X.C1855670yOD;
import X.C1858150ySD;
import X.C1864200yby;
import X.C259800zU;
import X.C324800CoI;
import X.C830490Whz;
import X.EnumC1858090yS7;
import X.InterfaceC1860950yWj;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.component.video.NimbleVideoListAssem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.skilllabel.TakoInputSkillLabelViewModel;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.TakoSpeechViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoStandardRatio;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.ss.android.ugc.aweme.tako.ccl.model.request.ExtraRequestInfo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.templateselect.TemplateSelectionPanel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes28.dex */
public class AwS178S0400000_27 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS178S0400000_27 awS178S0400000_27, Object obj, Object obj2) {
        ((Number) obj).intValue();
        View view = (View) obj2;
        INimbleVideoListDependAbility iNimbleVideoListDependAbilitySp = ((NimbleVideoListAssem) awS178S0400000_27.l0).sp();
        if (iNimbleVideoListDependAbilitySp != null) {
            TakoVideoItem takoVideoItem = (TakoVideoItem) awS178S0400000_27.l1;
            iNimbleVideoListDependAbilitySp.oz2(takoVideoItem.awemeId, (List) awS178S0400000_27.l2, view, takoVideoItem.LIZ, ((InterfaceC1860950yWj) awS178S0400000_27.l3).getVideoList());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS178S0400000_27 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS178S0400000_27.invoke$1(kotlin.jvm.internal.AwS178S0400000_27, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS178S0400000_27 awS178S0400000_27, Object obj, Object obj2) {
        boolean z;
        String str;
        Integer numXQ2;
        int i;
        String strL81;
        C1854150yLl activeSubModeItem;
        int i2;
        String strL812;
        C1854150yLl activeSubModeItem2;
        TakoStandardRatio takoStandardRatio;
        Integer numValueOf;
        ITakoContextAbility iTakoContextAbilityFp;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C1855180yNQ c1855180yNQ = (C1855180yNQ) obj2;
        if (c1855180yNQ.LIZIZ) {
            boolean z2 = true;
            if (c1855180yNQ.LIZ.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            TakoReferenceAskInfo takoReferenceAskInfo = null;
            if (z) {
                ((TakoSpeechViewModel) awS178S0400000_27.l0).zQ2(new C1855030yNB("no valid content"));
            } else {
                C1854760yMk c1854760yMk = (C1854760yMk) ((View) awS178S0400000_27.l1).findViewById(R.id.x_i);
                List listLLIIII = C13LP.LLIIII(c1854760yMk.getPhotoDisplayLayout().getDisplayPhotoList());
                C830490Whz c830490Whz = new C830490Whz();
                c830490Whz.put("is_resend", CardStruct.IStatusCode.DEFAULT);
                c830490Whz.put("interaction_type", "voice_input");
                c830490Whz.put("asr_request_id", c1855180yNQ.LIZJ);
                if (listLLIIII.isEmpty()) {
                    str = "text";
                } else {
                    str = "text_image";
                }
                c830490Whz.put("message_type", str);
                C324800CoI.LIZ.getClass();
                if (C324800CoI.LIZ() && (iTakoContextAbilityFp = ((BottomInputAssem) awS178S0400000_27.l2).Fp()) != null && (c13lcAp0 = iTakoContextAbilityFp.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                    c830490Whz.put("tako_session_id", c1864200yby.LL);
                    c830490Whz.put("session_source", c1864200yby.LLILLJJLI);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C1855670yOD.LIZ.getClass();
                if (C1855670yOD.LIZ()) {
                    Map<String, String> mapYQ2 = ((BottomInputAssem) awS178S0400000_27.l2).Ap().yQ2();
                    if (mapYQ2 != null) {
                        c830490Whz.putAll(mapYQ2);
                    }
                    TakoInputSkillLabelViewModel takoInputSkillLabelViewModelAp = ((BottomInputAssem) awS178S0400000_27.l2).Ap();
                    if (!(!listLLIIII.isEmpty())) {
                        z2 = false;
                    }
                    Map<String, Object> mapVQ2 = takoInputSkillLabelViewModelAp.vQ2(z2);
                    if (mapVQ2 != null) {
                        linkedHashMap.putAll(mapVQ2);
                    }
                }
                if (C1855670yOD.LIZ()) {
                    numXQ2 = ((BottomInputAssem) awS178S0400000_27.l2).Ap().xQ2();
                } else {
                    numXQ2 = null;
                }
                if (C1855670yOD.LIZ() && (takoStandardRatio = ((BottomInputAssem) awS178S0400000_27.l2).Ap().getState().LLILLJJLI) != null && (numValueOf = Integer.valueOf(takoStandardRatio.stdSize)) != null) {
                    linkedHashMap.put("aigc_std_ratio", Integer.valueOf(numValueOf.intValue()));
                }
                C1855050yND.LIZLLL(((BottomInputAssem) awS178S0400000_27.l2).LLLLZI, linkedHashMap, c830490Whz);
                if (listLLIIII.isEmpty()) {
                    IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), IMessageAbility.class, null);
                    if (iMessageAbility != null) {
                        String str2 = c1855180yNQ.LIZ;
                        EnumC1858090yS7 enumC1858090yS7 = EnumC1858090yS7.VOICE;
                        Map<String, String> commonParams = ((BottomInputAssem) awS178S0400000_27.l2).getCommonParams();
                        C1854760yMk c1854760yMk2 = ((BottomInputAssem) awS178S0400000_27.l2).LLJJJ;
                        if (c1854760yMk2 != null && (activeSubModeItem2 = c1854760yMk2.getActiveSubModeItem()) != null) {
                            i2 = activeSubModeItem2.LL;
                        } else {
                            i2 = 0;
                        }
                        IMessageAbility iMessageAbility2 = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), IMessageAbility.class, null);
                        if (iMessageAbility2 != null) {
                            strL812 = iMessageAbility2.L81();
                        } else {
                            strL812 = null;
                        }
                        int iLIZJ = C1852810yJb.LIZJ(strL812);
                        ExtraRequestInfo extraRequestInfo = new ExtraRequestInfo(null, null, null, linkedHashMap, null, null, false);
                        C1854760yMk c1854760yMk3 = ((BottomInputAssem) awS178S0400000_27.l2).LLJJJ;
                        if (c1854760yMk3 != null) {
                            takoReferenceAskInfo = c1854760yMk3.getTakoReferenceAskInfo();
                        }
                        iMessageAbility.Rl2(str2, true, enumC1858090yS7, commonParams, c830490Whz, new LinkedHashMap(), null, null, "", i2, numXQ2, iLIZJ, 201, extraRequestInfo, null, UUID.randomUUID().toString(), takoReferenceAskInfo, ((BottomInputAssem) awS178S0400000_27.l2).LLLLZI);
                    }
                } else {
                    c1854760yMk.getPhotoDisplayLayout().LIZIZ();
                    IMessageAbility iMessageAbility3 = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), IMessageAbility.class, null);
                    if (iMessageAbility3 != null) {
                        String str3 = c1855180yNQ.LIZ;
                        EnumC1858090yS7 enumC1858090yS72 = EnumC1858090yS7.VOICE;
                        C1854760yMk c1854760yMk4 = ((BottomInputAssem) awS178S0400000_27.l2).LLJJJ;
                        if (c1854760yMk4 != null && (activeSubModeItem = c1854760yMk4.getActiveSubModeItem()) != null) {
                            i = activeSubModeItem.LL;
                        } else {
                            i = 0;
                        }
                        IMessageAbility iMessageAbility4 = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), IMessageAbility.class, null);
                        if (iMessageAbility4 != null) {
                            strL81 = iMessageAbility4.L81();
                        } else {
                            strL81 = null;
                        }
                        int iLIZJ2 = C1852810yJb.LIZJ(strL81);
                        Map<String, String> commonParams2 = ((BottomInputAssem) awS178S0400000_27.l2).getCommonParams();
                        ExtraRequestInfo extraRequestInfo2 = new ExtraRequestInfo(null, null, null, linkedHashMap, null, null, false);
                        C1854760yMk c1854760yMk5 = ((BottomInputAssem) awS178S0400000_27.l2).LLJJJ;
                        if (c1854760yMk5 != null) {
                            takoReferenceAskInfo = c1854760yMk5.getTakoReferenceAskInfo();
                        }
                        C1858150ySD.LIZIZ(iMessageAbility3, str3, listLLIIII, null, true, enumC1858090yS72, i, numXQ2, iLIZJ2, null, null, commonParams2, c830490Whz, false, extraRequestInfo2, null, null, takoReferenceAskInfo, ((BottomInputAssem) awS178S0400000_27.l2).LLLLZI, 119556);
                    }
                }
                ((C1855350yNh) awS178S0400000_27.l3).LIZ(false);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS178S0400000_27(NimbleVideoListAssem nimbleVideoListAssem, NimbleVideoListAssem nimbleVideoListAssem2, TakoVideoItem takoVideoItem, List<Pair<String, Long>> list, InterfaceC1860950yWj interfaceC1860950yWj) {
        super(2);
        this.$t = interfaceC1860950yWj;
        this.l0 = nimbleVideoListAssem;
        this.l1 = nimbleVideoListAssem2;
        this.l2 = takoVideoItem;
        this.l3 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS178S0400000_27(TakoSpeechViewModel takoSpeechViewModel, View view, BottomInputAssem bottomInputAssem, C1855350yNh c1855350yNh, int i) {
        super(2);
        this.$t = i;
        this.l0 = takoSpeechViewModel;
        this.l1 = view;
        this.l2 = bottomInputAssem;
        this.l3 = c1855350yNh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS178S0400000_27(TemplateSelectionPanel templateSelectionPanel, AwS428S0200000_27 awS428S0200000_27, C259800zU c259800zU, C013C c013c, int i) {
        super(2);
        this.$t = i;
        this.l0 = templateSelectionPanel;
        this.l1 = awS428S0200000_27;
        this.l2 = c259800zU;
        this.l3 = c013c;
    }
}
