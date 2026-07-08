package com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget;

import X.C098200Yq;
import X.C09JN;
import X.C0IJT;
import X.C0J1N;
import X.C0PEM;
import X.C1006820cJ6;
import X.C1119920fFW;
import X.C1120710fGn;
import X.C1121450fHz;
import X.C1123320fL0;
import X.C1124170fMN;
import X.C1124200fMQ;
import X.C1126800fQc;
import X.C1127330fRT;
import X.C1128630fTZ;
import X.C1130100fVw;
import X.C1133940fc8;
import X.C1143680frq;
import X.C1161920gLG;
import X.C11RD;
import X.C1295960jpS;
import X.C189200o6;
import X.C1CC2;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C474500IjA;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C817503Hh;
import X.C930940aKi;
import X.EnumC1121470fI1;
import X.EnumC993270bxF;
import X.InterfaceC1094160eZy;
import X.InterfaceC1133710fbl;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import Y.ACListenerS152S0100000_17;
import Y.ALAdapterS0S0300000_5;
import Y.ALAdapterS12S0200000_17;
import Y.ALAdapterS2S0100000_5;
import Y.ALAdapterS2S0200000_5;
import Y.ALAdapterS7S0300000_17;
import Y.AUListenerS266S0100000_17;
import Y.AfS186S0100000_17;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextPaint;
import android.util.Property;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.gift.ShowRechargeDialogEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.livesdk.ExclusiveShowRedDotEvent;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.wallet.HideChargeIconForUserSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveNewGiftBottomWidget extends LiveWidget {
    public C1124200fMQ LL;
    public RecyclerView LLILLJJLI;
    public TextView LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public ImageView LLIZLLLIL;
    public ImageView LLJ;
    public long LLJI;
    public List<? extends GiftPage> LLJIJIL;
    public String LLJILJIL = "";
    public TextView LLJILJILJ;
    public TextView LLJILLL;
    public C1295960jpS LLJJ;
    public C1295960jpS LLJJI;
    public C1295960jpS LLJJIII;
    public C1295960jpS LLJJIJI;
    public TextView LLJJIJIIJIL;
    public TextView LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public C1128630fTZ LLJJJJ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hz9;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void A1() {
        C1295960jpS c1295960jpS;
        Map<String, String> map;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        View view = this.LLIZ;
        if (view == null) {
            view = null;
        }
        if (C500260Jjc.LJJJJIZL(view)) {
            InterfaceC1094160eZy.J0.LJFF(Boolean.FALSE);
            View view2 = this.LLIZ;
            if (view2 == null) {
                view2 = null;
            }
            C500260Jjc.LJIILIIL(view2);
        }
        if (C1006820cJ6.LIZ(EnumC993270bxF.RECHARGE_DIALOG)) {
            HashMap map2 = new HashMap(11);
            InterfaceC1133710fbl.LIZ.getClass();
            C1120710fGn.LIZ();
            boolean zLJIIJJI = C1133940fc8.LJIIJJI();
            C1295960jpS c1295960jpS2 = this.LLJJ;
            boolean z = false;
            if ((c1295960jpS2 != null && c1295960jpS2.getVisibility() == 0) || ((c1295960jpS = this.LLJJI) != null && c1295960jpS.getVisibility() == 0)) {
                z = true;
            }
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                String idStr = room.getIdStr();
                if (idStr == null) {
                    idStr = String.valueOf(room.getId());
                }
                map2.put("room_id", idStr);
                map2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            UserService userService = UserService.getInstance();
            if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
                map2.put("user_id", String.valueOf(currentUser.getId()));
            }
            map2.put("gift_enter_from", C1130100fVw.LIZ.LIZJ);
            map2.put("is_first_recharge", zLJIIJJI ? "1" : CardStruct.IStatusCode.DEFAULT);
            map2.put("button_type", z ? "retention_task" : "coin");
            if (this.LLJJJIL) {
                C1126800fQc.LIZ.GN();
                C1123320fL0 c1123320fL0LIZIZ = C1121450fHz.LIZIZ(EnumC1121470fI1.RECHARGE_BANNER_TP.getType());
                if (c1123320fL0LIZIZ != null && (map = c1123320fL0LIZIZ.LIZ) != null) {
                    map2.putAll(map);
                }
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_panel_recharge_button_click");
            c474500IjALIZ.LJJIIZI(map2);
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
            C1CC2.LIZLLL("ttlive_gift_panel_recharge_button_click", map2, new HashMap(), new HashMap());
            DataChannel dataChannel = this.dataChannel;
            C1127330fRT c1127330fRT = new C1127330fRT("click", 0L, "normal", this.LLJILJIL, null);
            c1127330fRT.LJI = true;
            dataChannel.LC0(ShowRechargeDialogEvent.class, c1127330fRT);
            InterfaceC1094160eZy.j2.LJFF(Boolean.FALSE);
        }
    }

    public final void E1() {
        BalanceStruct balanceStructG52;
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        C1128630fTZ c1128630fTZ = this.LLJJJJ;
        if (c1128630fTZ == null || (mutableLiveData = c1128630fTZ.LIZIZ) == null || (value = mutableLiveData.getValue()) == null || value.intValue() != 5) {
            if (GiftManager.inst().hideBottomBar() || HideChargeIconForUserSetting.INSTANCE.getValue()) {
                if (this.LLJI > 0) {
                    View view = this.LLILZLL;
                    if (view == null) {
                        view = null;
                    }
                    C786410Ut5.LJLLLLLL(8, view);
                    View view2 = this.LLILZ;
                    C786410Ut5.LJLLLLLL(0, view2 != null ? view2 : null);
                    return;
                }
                return;
            }
            if (InterfaceC1094160eZy.J0.LIZIZ().booleanValue() && (balanceStructG52 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().g52()) != null && balanceStructG52.validUser) {
                View view3 = this.LLIZ;
                if (view3 == null) {
                    view3 = null;
                }
                C786410Ut5.LJLLLLLL(0, view3);
            }
            if (this.LLJI > 0) {
                View view4 = this.LLILZLL;
                if (view4 == null) {
                    view4 = null;
                }
                C786410Ut5.LJLLLLLL(8, view4);
                View view5 = this.LLILZ;
                C786410Ut5.LJLLLLLL(0, view5 != null ? view5 : null);
                return;
            }
            View view6 = this.LLILZLL;
            if (view6 == null) {
                view6 = null;
            }
            C786410Ut5.LJLLLLLL(0, view6);
            View view7 = this.LLILZ;
            C786410Ut5.LJLLLLLL(8, view7 != null ? view7 : null);
        }
    }

    public final AnimatorSet x1() {
        TextView textView;
        float fMeasureText;
        float fMeasureText2;
        String string;
        String string2;
        View view = this.LLILZLL;
        if (view == null) {
            view = null;
        }
        if (view.getVisibility() == 0) {
            textView = this.LLJJIJIL;
        } else {
            textView = this.LLILLL;
            if (textView == null) {
                textView = null;
            }
        }
        View view2 = this.LLILZLL;
        TextView textView2 = (view2 != null ? view2 : null).getVisibility() == 0 ? this.LLJILLL : this.LLJILJILJ;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f);
        String str = "";
        if (textView2 != null) {
            TextPaint paint = textView2.getPaint();
            CharSequence text = textView2.getText();
            if (text == null || (string2 = text.toString()) == null) {
                string2 = "";
            }
            fMeasureText = paint.measureText(string2);
        } else {
            fMeasureText = 0.0f;
        }
        if (textView != null) {
            TextPaint paint2 = textView.getPaint();
            CharSequence text2 = textView.getText();
            if (text2 != null && (string = text2.toString()) != null) {
                str = string;
            }
            fMeasureText2 = paint2.measureText(str);
        } else {
            fMeasureText2 = 0.0f;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fMeasureText2, fMeasureText);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(textView2, 12));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fMeasureText, fMeasureText2);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS266S0100000_17(textView2, 11));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(1000L);
        animatorSet.addListener(new ALAdapterS2S0100000_5(textView, 1));
        animatorSet.playTogether(objectAnimatorOfFloat4);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(1000L);
        animatorSet2.addListener(new ALAdapterS2S0200000_5(animatorSet, textView2, 0));
        animatorSet2.playTogether(objectAnimatorOfFloat3, valueAnimatorOfFloat2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setDuration(1000L);
        animatorSet3.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f));
        animatorSet3.addListener(new ALAdapterS7S0300000_17(animatorSet2, textView2, this, 0));
        animatorSet3.playTogether(objectAnimatorOfFloat2, valueAnimatorOfFloat);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setDuration(1000L);
        animatorSet4.setStartDelay(500L);
        animatorSet4.addListener(new ALAdapterS0S0300000_5(animatorSet3, textView, this, 0));
        animatorSet4.playTogether(objectAnimatorOfFloat);
        return animatorSet4;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        MutableLiveData<Integer> mutableLiveData2;
        super.onCreate();
        this.LLILLL = (TextView) findViewById(R.id.bqj);
        this.LLILZLL = findViewById(R.id.p_2);
        this.LLIZLLLIL = (ImageView) findViewById(R.id.e3l);
        this.LLJ = (ImageView) findViewById(R.id.p_3);
        this.LLILZ = findViewById(R.id.sw0);
        this.LLILZIL = findViewById(R.id.olo);
        this.LLIZ = findViewById(R.id.swm);
        this.LLJJ = (C1295960jpS) findViewById(R.id.wa3);
        this.LLJJI = (C1295960jpS) findViewById(R.id.p_4);
        this.LLJJIII = (C1295960jpS) findViewById(R.id.sm2);
        this.LLJJIJI = (C1295960jpS) findViewById(R.id.sm0);
        this.LLJJIJIIJIL = (TextView) findViewById(R.id.sm1);
        this.LLJILJILJ = (TextView) findViewById(R.id.wa1);
        this.LLJILLL = (TextView) findViewById(R.id.wa2);
        this.LLJJIJIL = (TextView) findViewById(R.id.swo);
        C1128630fTZ c1128630fTZ = this.LLJJJJ;
        if (((c1128630fTZ == null || (mutableLiveData2 = c1128630fTZ.LIZIZ) == null) ? null : mutableLiveData2.getValue()) != null) {
            C1128630fTZ c1128630fTZ2 = this.LLJJJJ;
            if (c1128630fTZ2 == null || (mutableLiveData = c1128630fTZ2.LIZIZ) == null || (value = mutableLiveData.getValue()) == null || value.intValue() != 5) {
                E1();
                C817503Hh c817503Hh = C817503Hh.LL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C1124170fMN(this, null), 2);
            } else {
                View view = this.LLILZIL;
                if (view == null) {
                    view = null;
                }
                C500260Jjc.LJIILIIL(view);
                View view2 = this.LLILZ;
                if (view2 == null) {
                    view2 = null;
                }
                C500260Jjc.LJIILIIL(view2);
            }
            View view3 = this.LLILZLL;
            if (view3 == null) {
                view3 = null;
            }
            C786410Ut5.I7(new ACListenerS152S0100000_17(this, 197), view3);
            View view4 = this.LLILZ;
            if (view4 == null) {
                view4 = null;
            }
            C786410Ut5.I7(new ACListenerS152S0100000_17(this, 198), view4);
            View view5 = this.LLILZIL;
            if (view5 == null) {
                view5 = null;
            }
            C786410Ut5.I7(new ACListenerS152S0100000_17(this, 199), view5);
            TextView textView = (TextView) findViewById(R.id.swo);
            TextView textView2 = (TextView) findViewById(R.id.e6q);
            textView.setTypeface(C1119920fFW.LIZJ(textView.getTextSize(), 500, getContext()));
            textView2.setTypeface(C1119920fFW.LIZJ(textView2.getTextSize(), 500, getContext()));
        }
        y1(null);
        B1(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0());
        ((C0J1N) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().l22().LIZJ(C11RD.LJ(this))).LIZ(new AfS186S0100000_17(this, 202), new C09JN() { // from class: X.00qP
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LiveNewGiftBottomWidget@e9ff.initWalletInfo$2");
                C20441214yg.LJI("live_new_gift_bottom_widget", (Throwable) obj);
                C1C7U.LIZIZ("LiveNewGiftBottomWidget@e9ff.initWalletInfo$2");
            }
        });
        this.LLILLJJLI = (RecyclerView) findViewById(R.id.p8c);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        RecyclerView recyclerView = this.LLILLJJLI;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        C1124200fMQ c1124200fMQ = new C1124200fMQ();
        c1124200fMQ.LLILLJJLI = this.LLJJJJ;
        c1124200fMQ.LLILLL = this;
        this.LL = c1124200fMQ;
        RecyclerView recyclerView2 = this.LLILLJJLI;
        (recyclerView2 != null ? recyclerView2 : null).setAdapter(c1124200fMQ);
        this.dataChannel.CQ2(ExclusiveShowRedDotEvent.class, this, new AwS596S0100000_17(this, 722));
    }

    public final void B1(long j) {
        String strValueOf;
        Object c098200Yq;
        boolean z;
        boolean z2;
        boolean z3;
        ImageView imageView;
        ImageView imageView2;
        boolean z4;
        int iDoubleValue;
        boolean z5;
        TextView textView = this.LLILLL;
        View view = null;
        if (textView == null) {
            textView = null;
        }
        if (UserService.getInstance().user().isLogin()) {
            if (10000 <= j && j < 1000000) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                double d = j / ((double) LSPassThroughRecordSizeConfig.DEFAULT);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C786410Ut5.k4(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)));
                sbLIZ.append('K');
                strValueOf = C2188811AlT.LIZIZ(sbLIZ);
            } else if (j >= 1000000) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C786410Ut5.k4(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(j / ((double) 1000000))}, 1)));
                sbLIZ2.append('M');
                strValueOf = C2188811AlT.LIZIZ(sbLIZ2);
            } else if (j >= 1000) {
                StringBuffer stringBuffer = new StringBuffer(String.valueOf(j));
                stringBuffer.insert(1, ',');
                strValueOf = stringBuffer.toString();
            } else {
                strValueOf = String.valueOf(j);
            }
        } else {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        }
        textView.setText(strValueOf);
        this.LLJI = j;
        E1();
        try {
            Double dLIZ = InterfaceC1094160eZy.F1.LIZ();
            if (dLIZ != null) {
                iDoubleValue = (int) dLIZ.doubleValue();
            } else {
                iDoubleValue = 0;
            }
            c098200Yq = Integer.valueOf(iDoubleValue);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = 0;
        }
        int iIntValue = ((Number) c098200Yq).intValue();
        InterfaceC1133710fbl.LIZ.getClass();
        C1133940fc8 c1133940fc8 = (C1133940fc8) C1120710fGn.LIZ();
        if (!C1133940fc8.LJIIJJI() && !c1133940fc8.kb()) {
            z = false;
        } else {
            z = true;
        }
        boolean zLIZIZ = c1133940fc8.LIZIZ();
        if (iIntValue > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!zLIZIZ && z && z2) {
            if (!this.LLJJJ) {
                this.LLJJJ = true;
                View view2 = this.LLILZ;
                if (view2 == null) {
                    view2 = null;
                }
                if (view2.getVisibility() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    C1143680frq.LIZLLL(this.LLIZLLLIL, "tiktok_live_revenue_normal_1", "ttlive_fast_welcome_pack_icon.png");
                }
                View view3 = this.LLILZLL;
                if (view3 != null) {
                    view = view3;
                }
                if (view.getVisibility() == 0) {
                    C1143680frq.LIZLLL(this.LLJ, "tiktok_live_revenue_normal_1", "ttlive_fast_welcome_pack_icon.png");
                    return;
                }
                return;
            }
            return;
        }
        if (!this.LLJJJ) {
            return;
        }
        this.LLJJJ = false;
        View view4 = this.LLILZ;
        if (view4 == null) {
            view4 = null;
        }
        if (view4.getVisibility() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && (imageView2 = this.LLIZLLLIL) != null) {
            imageView2.setImageResource(R.drawable.el0);
        }
        View view5 = this.LLILZLL;
        if (view5 != null) {
            view = view5;
        }
        if (view.getVisibility() != 0 || (imageView = this.LLJ) == null) {
            return;
        }
        imageView.setImageResource(R.drawable.el0);
    }

    public final void D1(boolean z) {
        View view = null;
        if (z) {
            View view2 = this.LLILZIL;
            if (view2 != null) {
                view = view2;
            }
            C786410Ut5.LJLLLLLL(8, view);
            E1();
            return;
        }
        View view3 = this.LLILZ;
        if (view3 == null) {
            view3 = null;
        }
        C786410Ut5.LJLLLLLL(8, view3);
        View view4 = this.LLILZLL;
        if (view4 != null) {
            view = view4;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    public final void F1(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('+');
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        TextView textView = (TextView) findViewById(R.id.acj);
        textView.setText(strLIZIZ);
        C786410Ut5.LLIL(textView, 0);
        ObjectAnimator duration = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(400L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(350L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration);
        animatorSet.play(duration2).after(700L);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, 0.0f, -35.0f).setDuration(300L);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -35.0f, -40.0f).setDuration(700L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(duration3);
        animatorSet2.play(duration4).after(300L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(animatorSet, animatorSet2);
        animatorSet3.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y1(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftBottomWidget.y1(java.lang.String):void");
    }

    public final void z1(Function0<Unit> function0) {
        boolean z;
        C1295960jpS c1295960jpS = this.LLJJI;
        View view = null;
        if (c1295960jpS != null) {
            c1295960jpS.setAnimation((Animation) null);
        }
        C1295960jpS c1295960jpS2 = this.LLJJ;
        if (c1295960jpS2 != null) {
            c1295960jpS2.setAnimation((Animation) null);
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            view = view2;
        }
        if (view.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1295960jpS c1295960jpS3 = this.LLJJI;
            if (c1295960jpS3 != null) {
                c1295960jpS3.addAnimatorListener(new ALAdapterS12S0200000_17(this, function0, 3));
            }
            ImageView imageView = this.LLJ;
            if (imageView != null) {
                C786410Ut5.LJZI(8, imageView);
            }
            C1295960jpS c1295960jpS4 = this.LLJJI;
            if (c1295960jpS4 != null) {
                C786410Ut5.LLD(0, c1295960jpS4);
            }
            C1143680frq.LJIILJJIL(this.LLJJI, "tiktok_live_revenue_normal_1", "strategy_recharge_lottie.zip", true);
            return;
        }
        C1295960jpS c1295960jpS5 = this.LLJJ;
        if (c1295960jpS5 != null) {
            c1295960jpS5.addAnimatorListener(new ALAdapterS12S0200000_17(this, function0, 4));
        }
        C1295960jpS c1295960jpS6 = this.LLJJ;
        if (c1295960jpS6 != null) {
            C786410Ut5.LLD(0, c1295960jpS6);
        }
        C1143680frq.LJIILJJIL(this.LLJJ, "tiktok_live_revenue_normal_1", "strategy_recharge_lottie.zip", true);
    }

    public final void C1(String str, Map<String, String> map) {
        String str2;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        HashMap map2 = new HashMap();
        C1126800fQc.LIZ.M92();
        boolean zLJIIJJI = C1133940fc8.LJIIJJI();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            map2.put("room_id", idStr);
            map2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        UserService userService = UserService.getInstance();
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            map2.put("user_id", String.valueOf(currentUser.getId()));
        }
        map2.put("gift_enter_from", C1130100fVw.LIZ.LIZJ);
        if (zLJIIJJI) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_first_recharge", str2);
        if (map != null) {
            map2.putAll(map);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_panel_recharge_button_show");
        c474500IjALIZ.LJJII(str, "task_type");
        c474500IjALIZ.LJJIIZI(map2);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        C1CC2.LIZLLL("ttlive_gift_panel_recharge_button_show", map2, new HashMap(), new HashMap());
    }
}
