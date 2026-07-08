package com.ss.android.ugc.aweme.tako.botpage.cards.carry.userlanding;

import X.AbstractC848400XPy;
import X.C0HZQ;
import X.C0XQ7;
import X.C13LP;
import X.C14J2;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1848410yCV;
import X.C1857090yQV;
import X.C1857340yQu;
import X.C1857350yQv;
import X.C1857420yR2;
import X.C1860520yW2;
import X.C1862330yYx;
import X.C1905510zgb;
import X.C20235014Fo;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C341940Daq;
import X.C421120GfG;
import X.C427660Gpo;
import X.C427690Gpr;
import X.C7740030o;
import X.C786410Ut5;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnLongClickListenerC1864620yce;
import Y.ACListenerS161S0100000_27;
import Y.ACListenerS51S0201000_26;
import Y.ARunnableS31S0201000_26;
import android.view.View;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserGuideInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserGuideItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoUserLandingCardAssem extends TakoAnswerBaseAssem<C1857090yQV> {
    public C1857340yQu LLLLZLLLI;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fnq;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return (C0HZQ) LJJIJL().findViewById(R.id.umx);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    /* JADX INFO: renamed from: Vr, reason: merged with bridge method [inline-methods] */
    public final C14J2 Tp() {
        return (C14J2) LJJIJL().findViewById(R.id.ety);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        return (C427660Gpo) LJJIJL().findViewById(R.id.bh2);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Wr, reason: merged with bridge method [inline-methods] */
    public final void up(C1857090yQV c1857090yQV) throws JSONException {
        String str;
        int i;
        int size;
        TakoUserGuideItem takoUserGuideItem;
        String str2;
        String strLIZIZ;
        List<TakoUserGuideItem> list;
        List<TakoUserGuideItem> list2;
        Map<String, String> map;
        super.up(c1857090yQV);
        C1857340yQu c1857340yQu = this.LLLLZLLLI;
        if (c1857340yQu != null) {
            Message messageLJ = c1857090yQV.LL.LLILLL.LJ();
            c1857340yQu.LLILZLL = messageLJ;
            TakoMixFeed takoMixFeedLJIIIZ = messageLJ.LJIIIZ();
            if (takoMixFeedLJIIIZ != null && (map = takoMixFeedLJIIIZ.msgExt) != null) {
                str = map.get("user_guide");
            } else {
                str = null;
            }
            try {
                c1857340yQu.LLIZ = (TakoUserGuideInfo) C7740030o.LIZ().getGson().LJII(str, TakoUserGuideInfo.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            TakoUserGuideInfo takoUserGuideInfo = c1857340yQu.LLIZ;
            if (takoUserGuideInfo != null) {
                i = takoUserGuideInfo.type;
            } else {
                i = 1;
            }
            c1857340yQu.LLILZIL = i;
            ArrayList arrayList = new ArrayList();
            int size2 = c1857340yQu.LLILLJJLI.size();
            for (int i2 = 0; i2 < size2; i2++) {
                TakoUserGuideInfo takoUserGuideInfo2 = c1857340yQu.LLIZ;
                if (takoUserGuideInfo2 != null && (list2 = takoUserGuideInfo2.itemList) != null) {
                    size = list2.size();
                } else {
                    size = 0;
                }
                if (i2 >= size) {
                    break;
                }
                TakoUserGuideInfo takoUserGuideInfo3 = c1857340yQu.LLIZ;
                if (takoUserGuideInfo3 != null && (list = takoUserGuideInfo3.itemList) != null) {
                    takoUserGuideItem = (TakoUserGuideItem) ListProtector.get(list, i2);
                } else {
                    takoUserGuideItem = null;
                }
                C421120GfG c421120GfG = (C421120GfG) ListProtector.get(c1857340yQu.LLILLJJLI, i2);
                int i3 = c1857340yQu.LLILZIL;
                AwS641S0100000_27 awS641S0100000_27 = c1857340yQu.LLJILJIL;
                AwS640S0100000_26 awS640S0100000_26 = c1857340yQu.LLJILJILJ;
                c421120GfG.getClass();
                if (takoUserGuideItem != null) {
                    String str3 = takoUserGuideItem.text;
                    String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    Matcher matcher = C1905510zgb.LIZ.matcher(str3);
                    if (matcher.find()) {
                        String strGroup = matcher.group();
                        if (arrayList.contains(strGroup)) {
                            strGroup = (String) C13LP.LJJJLL(C1857350yQv.LIZ(arrayList));
                            if (strGroup == null) {
                                strGroup = "";
                            }
                            C1862330yYx.LIZ.getClass();
                            C20235014Fo c20235014Fo = C1862330yYx.LIZLLL;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("text", str3);
                            c20235014Fo.LIZIZ("tikbot_landing_card_emoji_fall_back", jSONObject);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("");
                        sbLIZ.append(strGroup);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        String str5 = (String) C13LP.LJJJLL(C1857350yQv.LIZ(arrayList));
                        if (str5 == null) {
                            str5 = "";
                        }
                        C1862330yYx.LIZ.getClass();
                        C20235014Fo c20235014Fo2 = C1862330yYx.LIZLLL;
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("text", str3);
                        c20235014Fo2.LIZIZ("tikbot_landing_card_emoji_fall_back", jSONObject2);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("");
                        sbLIZ2.append(str5);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    TuxTextView tuxTextView = c421120GfG.LLILLL;
                    if (tuxTextView != null) {
                        tuxTextView.setText(strLIZIZ);
                    }
                    arrayList.add(strLIZIZ);
                    TuxTextView tuxTextView2 = c421120GfG.LLILZ;
                    if (tuxTextView2 != null) {
                        String str6 = takoUserGuideItem.text;
                        if (str6 != null) {
                            str4 = str6;
                        }
                        tuxTextView2.setText(C1857350yQv.LIZIZ(str4));
                    }
                    if (i3 == 1) {
                        TuxTextView tuxTextView3 = c421120GfG.LLILZ;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setTuxFont(42);
                        }
                    } else {
                        TuxTextView tuxTextView4 = c421120GfG.LLILZ;
                        if (tuxTextView4 != null) {
                            tuxTextView4.setTuxFont(41);
                        }
                    }
                    View.OnClickListener aCListenerS51S0201000_26 = new ACListenerS51S0201000_26(awS641S0100000_27, i2, takoUserGuideItem, 2);
                    if (C1848410yCV.LIZ) {
                        aCListenerS51S0201000_26 = new f(aCListenerS51S0201000_26);
                    }
                    a aVar = new a(aCListenerS51S0201000_26);
                    if (C2213981Bky.LIZIZ.isOffline()) {
                        C2211941Bhg.LIZ.injectViewListener(c421120GfG);
                    }
                    c421120GfG.setOnClickListener(aVar);
                    if (!Intrinsics.LJFF(c421120GfG.LLILZIL, takoUserGuideItem.text)) {
                        HandlerHook.viewPost(c421120GfG, new ARunnableS31S0201000_26(i2, awS640S0100000_26, takoUserGuideItem, 6));
                        c421120GfG.LLILZIL = takoUserGuideItem.text;
                    }
                }
                if (c1857340yQu.LLILZIL == 2) {
                    List<String> list3 = c1857340yQu.LLJI;
                    if (takoUserGuideItem != null) {
                        str2 = takoUserGuideItem.text;
                    } else {
                        str2 = null;
                    }
                    ((ArrayList) list3).add(str2);
                }
            }
            IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558360qeg.LJ(c1857340yQu, null), IMessageAbility.class, null);
            if (iMessageAbility != null) {
                iMessageAbility.tx1(new AwS605S0100000_26(c1857340yQu, 577));
            }
            if (c1857340yQu.LLILZIL == 2) {
                C786410Ut5.LJZL(0, c1857340yQu.LLILLL);
                C427690Gpr.LJI(c1857340yQu.LLILLL, null);
                C786410Ut5.R7(c1857340yQu.LLILLL, new ACListenerS161S0100000_27(c1857340yQu, 136));
            } else {
                C786410Ut5.LJZL(8, c1857340yQu.LLILLL);
                C421120GfG c421120GfG2 = c1857340yQu.LL;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, C341940Daq.LIZ(8.0d), 0, C341940Daq.LIZ(12.0d));
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c421120GfG2);
                c421120GfG2.setLayoutParams(layoutParams);
            }
        }
        C14J2 c14j2Tp = Tp();
        if (c14j2Tp != null) {
            c14j2Tp.setOnLongClickListener(new ViewOnLongClickListenerC1864620yce(this, c1857090yQV, 3));
        }
        C1860520yW2.LIZ.getClass();
        Keva kevaLJIIL = C1860520yW2.LJIIL();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("has_showed_user_landing_card");
        sbLIZ3.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        kevaLJIIL.storeBoolean(C2188811AlT.LIZIZ(sbLIZ3), true);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLLLZLLLI = (C1857340yQu) view.findViewById(R.id.user_landing_view);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final List Wp(View view, InterfaceC665370Q7z interfaceC665370Q7z, Message message) {
        C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
        ArrayList arrayList = new ArrayList();
        C1857420yR2.LJIIIIZZ(view, interfaceC665370Q7z, message, "long_press", arrayList);
        C1857420yR2.LJ(view, interfaceC665370Q7z, message, "long_press", arrayList);
        C1857420yR2.LJIIL(arrayList, view, message, interfaceC665370Q7z, false, null, 24);
        C1857420yR2.LIZLLL(arrayList, getContext(), message, Collections.singletonList(message), interfaceC665370Q7z);
        C1857420yR2.LIZJ(interfaceC665370Q7z, arrayList);
        return arrayList;
    }
}
