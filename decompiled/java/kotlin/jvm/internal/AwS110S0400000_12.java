package kotlin.jvm.internal;

import X.AbstractDialogInterfaceC1397690mTX;
import X.C013C;
import X.C05P0;
import X.C05P1;
import X.C09AY;
import X.C0KPG;
import X.C0KPI;
import X.C0KQ9;
import X.C0KQW;
import X.C0TGR;
import X.C0TLF;
import X.C0TOS;
import X.C0TUL;
import X.C0UV0;
import X.C1161920gLG;
import X.C1292030jj7;
import X.C1389890mGx;
import X.C1397620mTQ;
import X.C1954807lC;
import X.C19671211xm;
import X.C1AZW;
import X.C20507115Mf;
import X.C20507215Mg;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C740100T1k;
import X.C745980TOa;
import X.C781510UlB;
import X.C786310Usv;
import X.C786320Usw;
import X.C925090aBH;
import X.EnumC1792020wjY;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.broadcast.DeleteBluetoothPermissionRequestGuestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLyraxPluginAdapt;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicVEPluginAdapt;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscribeResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.ss.android.ugc.aweme.comment.model.Strategy;
import com.ss.android.ugc.aweme.commerce.tools.music.viewmodel.CommerceMusicLegalViewModel;
import com.ss.android.ugc.aweme.utils.FeedForestFetchRequestController;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public class AwS110S0400000_12 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS110S0400000_12 awS110S0400000_12, Object obj) {
        Integer numValueOf;
        EnumC1792020wjY enumC1792020wjY;
        Integer numValueOf2;
        EnumC1792020wjY enumC1792020wjY2;
        C0KPG c0kpg = (C0KPG) obj;
        C0KPI c0kpi = c0kpg.LIZ;
        int i = 0;
        String str = null;
        if (c0kpi == C0KPI.SUCCESS) {
            C1389890mGx c1389890mGx = new C1389890mGx((Activity) awS110S0400000_12.l0);
            c1389890mGx.LJIIIZ(2131829409);
            c1389890mGx.LJIIJJI();
            C745980TOa.LIZ.storeLong("ad_free_subscription_submission_timestamp", System.currentTimeMillis());
            String contractId = ((SubscribeResponse) awS110S0400000_12.l1).getContractId();
            if (contractId != null) {
                ((SubscriptionVM) awS110S0400000_12.l3).vQ2(0, null, contractId);
            }
            ((C0TGR) awS110S0400000_12.l2).onSuccess();
        } else {
            int i2 = C0KQ9.LIZ[c0kpi.ordinal()];
            if (i2 != 1) {
                i = 2;
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                throw new C1954807lC();
                            }
                        } else {
                            i = 3;
                        }
                    }
                } else {
                    i = 1;
                }
            }
            String contractId2 = ((SubscribeResponse) awS110S0400000_12.l1).getContractId();
            if (contractId2 != null) {
                SubscriptionVM subscriptionVM = (SubscriptionVM) awS110S0400000_12.l3;
                C0KQW c0kqw = c0kpg.LIZLLL;
                if (c0kqw != null && (enumC1792020wjY2 = c0kqw.LIZ) != null) {
                    numValueOf2 = Integer.valueOf(enumC1792020wjY2.getValue());
                } else {
                    numValueOf2 = null;
                }
                subscriptionVM.vQ2(i, numValueOf2, contractId2);
            }
            ((C0TGR) awS110S0400000_12.l2).onFail();
            if (c0kpg.LIZ == C0KPI.FAILED) {
                C0TOS c0tos = C0TOS.LIZ;
                Activity activity = (Activity) awS110S0400000_12.l0;
                C0KQW c0kqw2 = c0kpg.LIZLLL;
                if (c0kqw2 != null && (enumC1792020wjY = c0kqw2.LIZ) != null) {
                    numValueOf = Integer.valueOf(enumC1792020wjY.getValue());
                } else {
                    numValueOf = null;
                }
                C0KQW c0kqw3 = c0kpg.LIZLLL;
                if (c0kqw3 != null) {
                    str = c0kqw3.LIZIZ;
                }
                c0tos.getClass();
                C0TOS.LJII(activity, numValueOf, 1, str);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS110S0400000_12 awS110S0400000_12, Object obj) {
        C1292030jj7 c1292030jj7 = (C1292030jj7) ((Function1) awS110S0400000_12.l0).invoke(obj);
        c1292030jj7.LIZIZ(new C786310Usv((C740100T1k) awS110S0400000_12.l1, (Function1) awS110S0400000_12.l2, 2));
        c1292030jj7.LIZ(new C786320Usw((FeedForestFetchRequestController) awS110S0400000_12.l3, 2));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS110S0400000_12 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS110S0400000_12.invoke$2(kotlin.jvm.internal.AwS110S0400000_12, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS110S0400000_12 awS110S0400000_12, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Object obj2 = ((Map) ((C05P1) awS110S0400000_12.l0).getValue()).get(Long.valueOf(jLongValue));
        if (obj2 != null) {
            if (((Boolean) ((C05P1) awS110S0400000_12.l1).getValue()).booleanValue()) {
                ((C05P0) awS110S0400000_12.l3).setValue(Collections.singletonList(obj2));
            } else {
                Iterable iterable = (Iterable) ((C05P1) awS110S0400000_12.l2).getValue();
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    ((C05P0) awS110S0400000_12.l3).setValue(Collections.singletonList(obj2));
                } else {
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        if (((User) it2.next()).getId() == jLongValue) {
                            break;
                        }
                    }
                    ((C05P0) awS110S0400000_12.l3).setValue(Collections.singletonList(obj2));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS110S0400000_12 awS110S0400000_12, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131821338, new AwS221S0300000_12((C013C) awS110S0400000_12.l0, (C013C) awS110S0400000_12.l1, (CommerceMusicLegalViewModel) awS110S0400000_12.l2, (Function0<Unit>) 5));
        c1397620mTQ.LJII(2131821336, new AwS368S0200000_2((C013C) awS110S0400000_12.l0, (C013C) awS110S0400000_12.l3, (Function0<Unit>) 119));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS110S0400000_12 awS110S0400000_12, Object obj) {
        IHostCreativeTool iHostCreativeTool;
        IHostCreativeTool iHostCreativeTool2;
        int iIntValue = ((Number) obj).intValue();
        if ((!LinkMicVEPluginAdapt.enable() || (iHostCreativeTool2 = (IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)) == null || iHostCreativeTool2.a72((Activity) awS110S0400000_12.l0, "voicechat_interact")) && (!LinkMicLyraxPluginAdapt.enable() || (iHostCreativeTool = (IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)) == null || iHostCreativeTool.cd((Activity) awS110S0400000_12.l0))) {
            if (DeleteBluetoothPermissionRequestGuestSetting.INSTANCE.enable()) {
                boolean z = C925090aBH.LIZ;
                C0UV0.LiveResource.checkInstall((Activity) awS110S0400000_12.l0, "interact", new C781510UlB(iIntValue, (Function0) awS110S0400000_12.l2, (Function1) awS110S0400000_12.l1));
            } else {
                boolean z2 = C925090aBH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkBluetoothPermission, multiLiveType: ");
                sbLIZ.append(iIntValue);
                sbLIZ.append('}');
                C1AZW.LJFF("VoiceChatPermissionManager", C2188811AlT.LIZIZ(sbLIZ), null, null);
                Activity activity = (Activity) awS110S0400000_12.l0;
                C19671211xm.LIZ(activity, (DataChannel) awS110S0400000_12.l3, new AwS71S0301000_12(activity, (Activity) iIntValue, (int) awS110S0400000_12.l1, (Function1<? super Integer, Unit>) awS110S0400000_12.l2, (Function0<Unit>) 5));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS110S0400000_12 awS110S0400000_12, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((Context) awS110S0400000_12.l0).getString(2131826753), new AwS100S0400000_1((View) awS110S0400000_12.l1, (View) c1397620mTQ, (C1397620mTQ) awS110S0400000_12.l2, (Function0<Boolean>) awS110S0400000_12.l3, (Function0<Unit>) 37));
        c1397620mTQ.LIZJ(1, ((Context) awS110S0400000_12.l0).getString(2131826754), AFwS245S0000000_12.get$arr$(268));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS110S0400000_12 awS110S0400000_12, Object obj) {
        if (Intrinsics.LJFF(((AbstractDialogInterfaceC1397690mTX) obj).LLIZ, 1)) {
            View view = (View) awS110S0400000_12.l0;
            final Function0 function0 = (Function0) awS110S0400000_12.l1;
            final Function2 function2 = (Function2) awS110S0400000_12.l2;
            final Function0 function02 = (Function0) awS110S0400000_12.l3;
            HandlerHook.viewPostDelay(view, new Runnable() { // from class: X.00og
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CommentMediaInputUtil@6877.showReplaceMediaDialog$2$1");
                    try {
                        C1346890l9b c1346890l9b = C1346890l9b.LIZ;
                        if (function0.invoke().booleanValue() && c1346890l9b != null) {
                            Function2<Boolean, Boolean, Unit> function22 = function2;
                            Function0<Unit> function03 = function02;
                            if (function22 != null) {
                                Boolean bool = Boolean.FALSE;
                                function22.invoke(bool, bool);
                            }
                            if (function03 != null) {
                                function03.invoke();
                            }
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CommentMediaInputUtil@6877.showReplaceMediaDialog$2$1");
                }
            }, 200L);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS110S0400000_12 awS110S0400000_12, Object obj) {
        if (((Strategy) awS110S0400000_12.l0) == Strategy.VIOLATING) {
            C0TUL c0tul = (C0TUL) awS110S0400000_12.l1;
            if (c0tul != null) {
                c0tul.LIZ();
            }
            C2344009Gk c2344009Gk = (C2344009Gk) awS110S0400000_12.l2;
            c2344009Gk.LIZJ(((C013C) awS110S0400000_12.l3).element ? 1 : 0, "if_click_cg");
            C20684815ws.LJIILLIIL("comment_rethink_delete_ck", c2344009Gk.LIZ);
        } else {
            C0TUL c0tul2 = (C0TUL) awS110S0400000_12.l1;
            if (c0tul2 != null) {
                c0tul2.LIZIZ();
            }
            C2344009Gk c2344009Gk2 = (C2344009Gk) awS110S0400000_12.l2;
            c2344009Gk2.LIZJ(((C013C) awS110S0400000_12.l3).element ? 1 : 0, "if_click_cg");
            C20684815ws.LJIILLIIL("comment_rethink_edit_ck", c2344009Gk2.LIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S0400000_12(Activity activity, AwS0S1422200_15 awS0S1422200_15, DataChannel dataChannel, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.l1 = awS0S1422200_15;
        this.l2 = null;
        this.l3 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S0400000_12(C013C c013c, CommerceMusicLegalViewModel commerceMusicLegalViewModel, C20507115Mf c20507115Mf, C20507215Mg c20507215Mg, int i) {
        super(1);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = commerceMusicLegalViewModel;
        this.l2 = c20507115Mf;
        this.l3 = c20507215Mg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S0400000_12(C05P0 c05p0, C05P0 c05p02, C05P0 c05p03, C05P0 c05p04, int i) {
        super(1);
        this.$t = i;
        this.l0 = c05p02;
        this.l1 = c05p03;
        this.l2 = c05p04;
        this.l3 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S0400000_12(C0TLF c0tlf, C740100T1k c740100T1k, Function1 function1, FeedForestFetchRequestController feedForestFetchRequestController, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0tlf;
        this.l1 = c740100T1k;
        this.l2 = function1;
        this.l3 = feedForestFetchRequestController;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S0400000_12(Activity activity, SubscribeResponse subscribeResponse, C0TGR c0tgr, SubscriptionVM subscriptionVM, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.l1 = subscribeResponse;
        this.l2 = c0tgr;
        this.l3 = subscriptionVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S0400000_12(Activity activity, Function1 function1, AwS559S0100000_15 awS559S0100000_15, DataChannel dataChannel, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.l1 = function1;
        this.l2 = awS559S0100000_15;
        this.l3 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS110S0400000_12(Context context, Context context2, View view, Function0<Boolean> function0, Function0<Unit> function02) {
        super(1);
        this.$t = function02;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = view;
        this.l3 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS110S0400000_12(View view, View view2, Function0<Boolean> function0, Function2<? super Boolean, ? super Boolean, Unit> function2, Function0<Unit> function02) {
        super(1);
        this.$t = function02;
        this.l0 = view;
        this.l1 = view2;
        this.l2 = function0;
        this.l3 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S0400000_12(Strategy strategy, C0TUL c0tul, C2344009Gk c2344009Gk, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.l0 = strategy;
        this.l1 = c0tul;
        this.l2 = c2344009Gk;
        this.l3 = c013c;
    }
}
