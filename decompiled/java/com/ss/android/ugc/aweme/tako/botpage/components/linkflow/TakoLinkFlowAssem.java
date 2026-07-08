package com.ss.android.ugc.aweme.tako.botpage.components.linkflow;

import X.C05PU;
import X.C093Y;
import X.C0DSB;
import X.C123100dR;
import X.C13LC;
import X.C1554610qYd;
import X.C1558520qew;
import X.C15X3;
import X.C15X5;
import X.C15X6;
import X.C1697810uHb;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C19EG;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC689400R2k;
import X.InterfaceC712990Rxx;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoLinkItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoLinkFlowAssem extends ReusedUISlotAssem<TakoLinkFlowAssem> implements InterfaceC712990Rxx<InterfaceC689400R2k>, ITakoHighLightAnimProtocol, C15X5 {
    public C15X3 LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final int Lm0() {
        return 100;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fky;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final boolean isClosed() {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final C05PU dz(int i) {
        C15X3 c15x3 = this.LLJJLIIIJLLLLLLLZ;
        if (c15x3 != null) {
            return new C15X6(c15x3, i);
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C15X3 c15x3 = (C15X3) view.findViewById(R.id.mr7);
        this.LLJJLIIIJLLLLLLLZ = c15x3;
        if (c15x3 != null) {
            c15x3.setItemAction(this);
        }
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ITakoHighLightAnimProtocol.class, C1697810uHb.LJIILJJIL(this));
        C15X3 c15x32 = this.LLJJLIIIJLLLLLLLZ;
        if (c15x32 != null) {
            c15x32.setPaddingRelative(c15x32.getPaddingStart(), c15x32.getPaddingTop(), c15x32.getPaddingEnd(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC689400R2k interfaceC689400R2k) {
        InterfaceC689400R2k interfaceC689400R2k2 = interfaceC689400R2k;
        List<TakoLinkItem> listLLFFF = interfaceC689400R2k2.LLFFF();
        if (listLLFFF != null && !listLLFFF.isEmpty()) {
            C0DSB.LIZJ(LJJIJL());
            C15X3 c15x3 = this.LLJJLIIIJLLLLLLLZ;
            if (c15x3 != null) {
                c15x3.LIZ(interfaceC689400R2k2.LLFFF(), false);
                return;
            }
            return;
        }
        C0DSB.LIZIZ(LJJIJL());
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC689400R2k interfaceC689400R2k) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC689400R2k interfaceC689400R2k) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final boolean wv1(Message message, int i) {
        if (message != null) {
            TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
            if (takoMixFeedLJIIIZ != null && takoMixFeedLJIIIZ.cardType == 2) {
                return true;
            }
            TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
            if (takoMixFeedLJIIIZ2 != null && takoMixFeedLJIIIZ2.cardType == 12) {
                return true;
            }
            TakoMixFeed takoMixFeedLJIIIZ3 = message.LJIIIZ();
            if (takoMixFeedLJIIIZ3 != null && takoMixFeedLJIIIZ3.cardType == 43) {
                return true;
            }
            TakoMixFeed takoMixFeedLJIIIZ4 = message.LJIIIZ();
            if (takoMixFeedLJIIIZ4 != null && takoMixFeedLJIIIZ4.cardType == 202) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C15X5
    public final void xj(int i, String str, String str2) throws JSONException {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        Object obj;
        Object obj2;
        Object obj3;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        String str3 = "";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("business_event_keys_stay_time", "tikbot_webpage_stay_time");
        jSONObject.put("business_event_keys_button_click", "tikbot_webpage_button_click");
        jSONObject.put("business_event_keys_close", "tikbot_webpage_close");
        JSONObject jSONObject2 = new JSONObject();
        Object obj9 = null;
        try {
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
            if (iTakoContextAbility != null && (c13lcT712 = iTakoContextAbility.T71()) != null && (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) != null) {
                String str4 = c1863850ybP2.LL;
                if (str4 == null) {
                    str4 = "";
                }
                jSONObject2.put("enter_from", str4);
                String str5 = c1863850ybP2.LLILLJJLI;
                if (str5 == null) {
                    str5 = "";
                }
                jSONObject2.put("enter_method", str5);
                String str6 = c1863850ybP2.LLILZIL;
                if (str6 == null) {
                    str6 = "";
                }
                jSONObject2.put("process_id", str6);
                String str7 = c1863850ybP2.LLILZLL;
                if (str7 == null) {
                    str7 = "";
                }
                jSONObject2.put("tako_session_id", str7);
                String str8 = c1863850ybP2.LLIZ;
                if (str8 == null) {
                    str8 = "";
                }
                jSONObject2.put("tako_chat_id", str8);
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj4 = c724270Sb3.LL;
                } else {
                    obj4 = null;
                }
                jSONObject2.put("message_id", ((InterfaceC689400R2k) obj4).getMessageId());
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj5 = c724270Sb32.LL;
                } else {
                    obj5 = null;
                }
                jSONObject2.put("bot_id", String.valueOf(((InterfaceC689400R2k) obj5).LLJJ()));
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj6 = c724270Sb33.LL;
                } else {
                    obj6 = null;
                }
                Long lValueOf = Long.valueOf(((InterfaceC689400R2k) obj6).LLJJJJJIL());
                if (lValueOf.longValue() > 0) {
                    lValueOf.longValue();
                    C724270Sb3 c724270Sb34 = this.LLJI;
                    if (c724270Sb34 != null) {
                        obj8 = c724270Sb34.LL;
                    } else {
                        obj8 = null;
                    }
                    jSONObject2.put("action_item_id", ((InterfaceC689400R2k) obj8).LLJJJJJIL());
                }
                C724270Sb3 c724270Sb35 = this.LLJI;
                if (c724270Sb35 != null) {
                    obj7 = c724270Sb35.LL;
                } else {
                    obj7 = null;
                }
                String strLLFII = ((InterfaceC689400R2k) obj7).LLFII();
                if (C123100dR.LIZ(strLLFII) && strLLFII != null) {
                    jSONObject2.put("sub_process_id", strLLFII);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://search_third_party/?url=");
        sbLIZ.append(str2);
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)).buildUpon().appendQueryParameter("business_event_tracking", C786410Ut5.J3(jSONObject2)).appendQueryParameter("business_event_keys", C786410Ut5.J3(jSONObject)).appendQueryParameter("click_time", String.valueOf(System.currentTimeMillis()));
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            SmartRouter.buildRoute(c19egLIZ, builderAppendQueryParameter.build().toString()).open();
        }
        ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        if (iTakoContextAbility2 != null && (c13lcT71 = iTakoContextAbility2.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str9 = c1863850ybP.LL;
            if (str9 == null) {
                str9 = "";
            }
            String str10 = c1863850ybP.LLILLJJLI;
            if (str10 == null) {
                str10 = "";
            }
            String str11 = c1863850ybP.LLILZIL;
            if (str11 == null) {
                str11 = "";
            }
            C724270Sb3 c724270Sb36 = this.LLJI;
            if (c724270Sb36 != null) {
                obj = c724270Sb36.LL;
            } else {
                obj = null;
            }
            String strLLFII2 = ((InterfaceC689400R2k) obj).LLFII();
            C724270Sb3 c724270Sb37 = this.LLJI;
            if (c724270Sb37 != null) {
                obj2 = c724270Sb37.LL;
            } else {
                obj2 = null;
            }
            Long lValueOf2 = Long.valueOf(((InterfaceC689400R2k) obj2).LLJJJJJIL());
            C724270Sb3 c724270Sb38 = this.LLJI;
            if (c724270Sb38 != null) {
                obj3 = c724270Sb38.LL;
            } else {
                obj3 = null;
            }
            String strValueOf = String.valueOf(((InterfaceC689400R2k) obj3).LLJJ());
            C724270Sb3 c724270Sb39 = this.LLJI;
            if (c724270Sb39 != null) {
                obj9 = c724270Sb39.LL;
            }
            String messageId = ((InterfaceC689400R2k) obj9).getMessageId();
            String strValueOf2 = String.valueOf(i);
            String str12 = c1863850ybP.LLILLL;
            if (str12 == null) {
                str12 = "";
            }
            String str13 = c1863850ybP.LLILZLL;
            if (str13 != null) {
                str3 = str13;
            }
            C1862330yYx.LLFZ(c1862330yYx, str9, str10, str11, strLLFII2, lValueOf2, strValueOf, messageId, str, str2, strValueOf2, str12, null, str3, c1863850ybP.LLIZ, 18432);
        }
    }

    @Override // X.C15X5
    public final void g9(int i, String str, String str2, String str3) {
        Object obj;
        Lifecycle lifecycle;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        Object obj2;
        Object obj3;
        Object obj4;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C724270Sb3 c724270Sb3 = this.LLJI;
            Object obj5 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            sbLIZ.append(((InterfaceC689400R2k) obj).getMessageId());
            sbLIZ.append('_');
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            sbLIZ.append('_');
            sbLIZ.append(str3);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            c1862330yYx.getClass();
            Map<Integer, Set<String>> map = C1862330yYx.LIZIZ;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Set set = (Set) linkedHashMap.get(Integer.valueOf(c19egLIZ.hashCode()));
            if (set != null && set.contains(strLIZIZ)) {
                return;
            }
            Set set2 = (Set) linkedHashMap.get(Integer.valueOf(c19egLIZ.hashCode()));
            if (set2 != null) {
                set2.add(strLIZIZ);
            } else {
                map.put(Integer.valueOf(c19egLIZ.hashCode()), C093Y.LJ(strLIZIZ));
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                if (fragmentLJI != null && (lifecycle = fragmentLJI.getLifecycle()) != null) {
                    lifecycle.addObserver(new TakoLinkFlowAssem$mobWeblinkShow$1$1(c19egLIZ));
                }
            }
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
            if (iTakoContextAbility == null || (c13lcT71 = iTakoContextAbility.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null) {
                return;
            }
            String str4 = c1863850ybP.LL;
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            String str6 = c1863850ybP.LLILLJJLI;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = c1863850ybP.LLILZIL;
            if (str7 == null) {
                str7 = "";
            }
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            String strLLFII = ((InterfaceC689400R2k) obj2).LLFII();
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            } else {
                obj3 = null;
            }
            long jLLJJJJJIL = ((InterfaceC689400R2k) obj3).LLJJJJJIL();
            C724270Sb3 c724270Sb34 = this.LLJI;
            if (c724270Sb34 != null) {
                obj4 = c724270Sb34.LL;
            } else {
                obj4 = null;
            }
            String messageId = ((InterfaceC689400R2k) obj4).getMessageId();
            C724270Sb3 c724270Sb35 = this.LLJI;
            if (c724270Sb35 != null) {
                obj5 = c724270Sb35.LL;
            }
            String strValueOf = String.valueOf(((InterfaceC689400R2k) obj5).LLJJ());
            String strValueOf2 = String.valueOf(i);
            String str8 = c1863850ybP.LLILLL;
            if (str8 == null) {
                str8 = "";
            }
            String str9 = c1863850ybP.LLILZLL;
            if (str9 != null) {
                str5 = str9;
            }
            C1862330yYx.LLI(c1862330yYx, str4, str6, str7, strLLFII, Long.valueOf(jLLJJJJJIL), strValueOf, messageId, str, str2, strValueOf2, null, str3, str8, str5, c1863850ybP.LLIZ, 33792);
        }
    }
}
