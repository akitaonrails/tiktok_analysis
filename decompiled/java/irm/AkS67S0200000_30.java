package irm;

import X.AbstractC848400XPy;
import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0T1R;
import X.C0XQ7;
import X.C1389300mG0;
import X.C14EG;
import X.C1858660yT2;
import X.C1861640yXq;
import X.C1862330yYx;
import X.C19EG;
import X.C20269114Sr;
import X.C2189821An6;
import X.C631370Opb;
import X.C724240Sb0;
import X.C736680Sv4;
import X.EnumC1783090wV9;
import X.EnumC1864410ycJ;
import X.InterfaceC1682240tsU;
import X.InterfaceC739770T0d;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.flexible.FlexibleSheetAssem;
import com.ss.android.ugc.aweme.feed.flexible.ui.FlexibleBottomSheetBehavior;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoTopBarAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.novel.choice.TakoNovelChoiceAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNovelChoiceSelect;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS80S1000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public class AkS67S0200000_30 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS67S0200000_30 akS67S0200000_30, View view) {
        Aweme awemeLJIIIIZZ;
        String takoVideoSessionId;
        Long lValueOf;
        String processId;
        String aid;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        InterfaceC739770T0d interfaceC739770T0dP2;
        DetailNavArgModel navArgModel;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ2;
        DetailNavArgModel navArgModel2;
        TakoAIVideoTopBarAssem takoAIVideoTopBarAssem = (TakoAIVideoTopBarAssem) akS67S0200000_30.l0;
        takoAIVideoTopBarAssem.getClass();
        C1862330yYx.LJJIFFI(C1862330yYx.LIZ, takoAIVideoTopBarAssem.Lo(), (String) takoAIVideoTopBarAssem.LLJILJILJ.getValue(), takoAIVideoTopBarAssem.No(), takoAIVideoTopBarAssem.So(), takoAIVideoTopBarAssem.Oo(), "chat");
        TakoAIVideoTopBarAssem takoAIVideoTopBarAssem2 = (TakoAIVideoTopBarAssem) akS67S0200000_30.l0;
        InterfaceC1682240tsU interfaceC1682240tsUGo = takoAIVideoTopBarAssem2.LLJJJIL;
        if (interfaceC1682240tsUGo == null) {
            synchronized (takoAIVideoTopBarAssem2) {
                interfaceC1682240tsUGo = takoAIVideoTopBarAssem2.LLJJJIL;
                if (interfaceC1682240tsUGo == null) {
                    interfaceC1682240tsUGo = takoAIVideoTopBarAssem2.Go();
                    takoAIVideoTopBarAssem2.LLJJJIL = interfaceC1682240tsUGo;
                }
            }
        }
        interfaceC1682240tsUGo.h7("click_chat");
        C2189821An6 c2189821An6 = ((TakoAIVideoTopBarAssem) akS67S0200000_30.l0).getPanelContext().LIZJ;
        if (c2189821An6 != null && (navArgModel2 = c2189821An6.getNavArgModel()) != null && Intrinsics.LJFF(navArgModel2.getTakoVideoFromInner(), Boolean.TRUE)) {
            C19EG c19egLIZ = C724240Sb0.LIZ((TakoAIVideoTopBarAssem) akS67S0200000_30.l0);
            if (c19egLIZ != null) {
                c19egLIZ.finish();
                return;
            }
            return;
        }
        TakoAIVideoTopBarAssem takoAIVideoTopBarAssem3 = (TakoAIVideoTopBarAssem) akS67S0200000_30.l0;
        TuxTextView tuxTextView = (TuxTextView) akS67S0200000_30.l1;
        Fragment fragment = takoAIVideoTopBarAssem3.getPanelContext().LJ;
        if (fragment != null && (iFeedPanelPlatformAbilityLIZJ2 = C0T1R.LIZJ(fragment)) != null) {
            awemeLJIIIIZZ = iFeedPanelPlatformAbilityLIZJ2.LJIIIIZZ();
        } else {
            awemeLJIIIIZZ = null;
        }
        C2189821An6 c2189821An62 = takoAIVideoTopBarAssem3.getPanelContext().LIZJ;
        if (c2189821An62 != null && (navArgModel = c2189821An62.getNavArgModel()) != null) {
            takoVideoSessionId = navArgModel.getTakoVideoSessionId();
        } else {
            takoVideoSessionId = null;
        }
        C20269114Sr c20269114Sr = C20269114Sr.LIZ;
        Context context = tuxTextView.getContext();
        C2189821An6 c2189821An63 = takoAIVideoTopBarAssem3.getPanelContext().LIZJ;
        if (awemeLJIIIIZZ != null && (aid = awemeLJIIIIZZ.getAid()) != null && fragment != null && (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragment)) != null && (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbilityLIZJ.x32()) != null && (interfaceC739770T0dP2 = iPlayerComponentAbilityX32.P2()) != null) {
            lValueOf = Long.valueOf(interfaceC739770T0dP2.LJLJJI(aid));
        } else {
            lValueOf = null;
        }
        String strLIZ = C1389300mG0.LIZ(takoAIVideoTopBarAssem3.getPanelContext());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_feed", "1");
        linkedHashMap.put("session_source", "tako_video");
        if (takoVideoSessionId != null && takoVideoSessionId.length() > 0) {
            linkedHashMap.put("video_session_id", takoVideoSessionId);
        }
        EnumC1864410ycJ enumC1864410ycJ = EnumC1864410ycJ.FULL_SCREEN;
        if (context != null) {
            C14EG c14egLIZ = C20269114Sr.LIZ(c20269114Sr, awemeLJIIIIZZ, c2189821An63, "click_icon", lValueOf, strLIZ, null, null, null, enumC1864410ycJ, null, null, null, null, linkedHashMap, null, null, null, null, 507360);
            if (c2189821An63 != null && (processId = c2189821An63.getProcessId()) != null && processId.length() > 0) {
                c14egLIZ.LIZIZ = processId;
            }
            c14egLIZ.LJI.setOpenBySAF(Boolean.TRUE);
            c14egLIZ.LJII(context);
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ((TakoAIVideoTopBarAssem) akS67S0200000_30.l0);
        if (c19egLIZ2 == null) {
            return;
        }
        c19egLIZ2.finish();
    }

    public static final void LIZ$1(AkS67S0200000_30 akS67S0200000_30, View view) {
        if (((FlexibleSheetAssem) akS67S0200000_30.l0).No().getState().LLILLJJLI == EnumC1783090wV9.PANEL && ((FlexibleBottomSheetBehavior) akS67S0200000_30.l1).getState() != 2) {
            ((FlexibleSheetAssem) akS67S0200000_30.l0).No().setStateImmediate(new AwS80S1000000_30("close_backdrop", 3));
        }
    }

    public static final void LIZ$2(AkS67S0200000_30 akS67S0200000_30, View view) {
        TakoNovelChoiceSelect takoNovelChoiceSelect;
        if (((TakoNovelChoiceAssem) akS67S0200000_30.l0).Xr().LL) {
            Object tag = ((TuxTextView) akS67S0200000_30.l1).getTag();
            if (tag instanceof TakoNovelChoiceSelect) {
                takoNovelChoiceSelect = (TakoNovelChoiceSelect) tag;
            } else {
                takoNovelChoiceSelect = null;
            }
            C736680Sv4.LJIJJ(((TakoNovelChoiceAssem) akS67S0200000_30.l0).Xr(), new AwS396S0200000_30((TakoNovelChoiceAssem) akS67S0200000_30.l0, takoNovelChoiceSelect, 22));
            String strValueOf = String.valueOf(((C1858660yT2) C631370Opb.LIZ((TakoNovelChoiceAssem) akS67S0200000_30.l0)).LLILZIL);
            String strKs = ((TakoNovelChoiceAssem) akS67S0200000_30.l0).ks(takoNovelChoiceSelect);
            C1861640yXq.LIZ.getClass();
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            Map<String, Map<String, String>> map = C1861640yXq.LIZIZ;
            if (!map.containsKey(curUserId)) {
                map.put(curUserId, new LinkedHashMap());
            }
            Map map2 = (Map) ((LinkedHashMap) map).get(curUserId);
            if (map2 != null) {
                map2.put(strValueOf, strKs);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS67S0200000_30(TakoAIVideoTopBarAssem takoAIVideoTopBarAssem, TuxTextView tuxTextView, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = takoAIVideoTopBarAssem;
        this.l1 = tuxTextView;
    }

    public AkS67S0200000_30(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
