package com.ss.android.ugc.aweme.comment.widgets;

import X.C01GW;
import X.C09R3;
import X.C0RD4;
import X.C1017070cZd;
import X.C1019030ccn;
import X.C1021860chM;
import X.C1022030chd;
import X.C1022820ciu;
import X.C12ES;
import X.C1324840ka2;
import X.C13LE;
import X.C1AF0;
import X.C2184171Adz;
import X.C2201701BEy;
import X.C2217381BqS;
import X.C341940Daq;
import X.C421750GgH;
import X.C452501pT;
import X.C786410Ut5;
import X.C990200bsI;
import X.EnumC1342450l2R;
import X.EnumC452301pR;
import X.InterfaceC1021920chS;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class NewCommentAdWidget extends BaseCommentWidget implements View.OnClickListener {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final Function0<Unit> LLJI;
    public boolean LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C990200bsI LLJIJIL = new C990200bsI(R.id.e_2);
    public final C990200bsI LLJILJIL = new C990200bsI(R.id.e_1);
    public final C990200bsI LLJILJILJ = new C990200bsI(R.id.e9z);
    public final C990200bsI LLJILLL = new C990200bsI(R.id.e_4);
    public final C990200bsI LLJJ = new C990200bsI(R.id.e9y);
    public final C01GW LLJJI = C452501pT.LIZ(EnumC452301pR.NONE, AFwS204S0000000_16.get$arr$(399));
    public boolean LLJJIII = true;
    public final Map<EnumC1342450l2R, Integer> LLJJJ = new LinkedHashMap();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NewCommentAdWidget.class, "mCommentAdLayout", "getMCommentAdLayout()Landroid/widget/LinearLayout;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(NewCommentAdWidget.class, "mCommentAdSourceTv", "getMCommentAdSourceTv()Landroid/widget/TextView;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(NewCommentAdWidget.class, "mCommentAdDesTv", "getMCommentAdDesTv()Landroid/widget/TextView;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(NewCommentAdWidget.class, "mCommentAdUserIv", "getMCommentAdUserIv()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(NewCommentAdWidget.class, "mCommentAdCloseBtn", "getMCommentAdCloseBtn()Landroid/view/View;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final int LJIIJ() {
        return R.layout.ibh;
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final LinearLayout LJIL() {
        C990200bsI c990200bsI = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (LinearLayout) c990200bsI.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget
    public final void LJIILLIIL() {
        C786410Ut5.R7(LJIL(), this);
        C990200bsI c990200bsI = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        C786410Ut5.I7(this, c990200bsI.LIZ(this));
        C786410Ut5.T4(this.LLJJ.LIZ(this), 0.5f);
    }

    public final void LJIJI() {
        if (LJIIZILJ() && C1017070cZd.LJJLJLI(LJIILL()) && !C1017070cZd.LLJLILLLLZIIL(LJIILL()) && !this.LLJJIJI) {
            this.LLJJIJI = true;
        }
    }

    public final void LJJ() {
        if (LJIIZILJ() && C1017070cZd.LJJLJLI(LJIILL()) && LJIILL().getAwemeRawAd() != null && this.LLJJIJI) {
            this.LLJJIJI = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        DataCenter dataCenter = this.LLILZ;
        dataCenter.yQ2("comment_ad_struct", this, true);
        dataCenter.yQ2("comment_ad_view_state", this, true);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        super.onPause();
        LJJ();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        super.onResume();
        LJIJI();
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
    }

    public NewCommentAdWidget(AFwS204S0000000_16 aFwS204S0000000_16) {
        this.LLJI = aFwS204S0000000_16;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget
    /* JADX INFO: renamed from: LJIJ */
    public final void onChanged(C0RD4 c0rd4) {
        int iIntValue;
        Aweme aweme;
        super.onChanged(c0rd4);
        String str = c0rd4.LIZ;
        boolean zIsCommentAreaSwitch = false;
        Object obj = null;
        switch (str.hashCode()) {
            case -1106422991:
                if (str.equals("comment_shown")) {
                    Object obj2 = c0rd4.LIZIZ;
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    Pair pair = (Pair) obj2;
                    if (pair != null && ((Number) pair.getFirst()).intValue() == 0) {
                        Object second = pair.getSecond();
                        if (second == null) {
                            second = EnumC1342450l2R.DEFAULT_SORT;
                        }
                        if (this.LLJJIJIIJIL > 0 && this.LLJJIJIL) {
                            Integer num = (Integer) ((LinkedHashMap) this.LLJJJ).get(second);
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            Collection collectionValues = ((LinkedHashMap) this.LLJJJ).values();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : collectionValues) {
                                if (((Number) obj3).intValue() >= this.LLJJIJIIJIL) {
                                    arrayList.add(obj3);
                                }
                            }
                            if (!(!arrayList.isEmpty()) && iIntValue < this.LLJJIJIIJIL) {
                                int i = iIntValue + 1;
                                this.LLJJJ.put((EnumC1342450l2R) second, Integer.valueOf(i));
                                if (i == this.LLJJIJIIJIL && this.LLJJIII) {
                                    LJIJJLI(LJIL(), C341940Daq.LIZ(16.0d), DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 566175283:
                if (str.equals("comment_ad_view_state")) {
                    Object obj4 = c0rd4.LIZIZ;
                    if (obj4 == null) {
                        obj4 = Boolean.FALSE;
                    }
                    if (Intrinsics.LJFF(obj4, 0)) {
                        LJIJJLI(LJIL(), this.LL.getResources().getDimensionPixelOffset(R.dimen.e8), 0, false);
                    } else if (Intrinsics.LJFF(obj4, 1)) {
                        LJIJJLI(LJIL(), this.LL.getResources().getDimensionPixelOffset(R.dimen.e8), DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, false);
                    }
                }
                break;
            case 584899985:
                if (str.equals("comment_ad_struct")) {
                    Object obj5 = c0rd4.LIZIZ;
                    if (obj5 != null) {
                        obj = obj5;
                    }
                    CommentStruct commentStruct = (CommentStruct) obj;
                    if (commentStruct != null) {
                        int showButtonNumber = commentStruct.getShowButtonNumber();
                        if (showButtonNumber == 0) {
                            if (this.LLJJIJIIJIL != 0) {
                                this.LLILZ.BQ2("comment_shown", this);
                            }
                        } else if (showButtonNumber > 0) {
                            this.LLILZ.yQ2("comment_shown", this, true);
                        }
                        this.LLJJIJIIJIL = showButtonNumber;
                        C990200bsI c990200bsI = this.LLJILJIL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
                        ((TextView) c990200bsI.LIZ(this)).setText(commentStruct.getSource());
                        ((TextView) this.LLJILJILJ.LIZ(this)).setText(commentStruct.getTitle());
                        C1324840ka2.LJFF((RemoteImageView) this.LLJILLL.LIZ(this), commentStruct.getAvatarIcon());
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(C12ES.LIZJ(4.0f, this.LL));
                        gradientDrawable.setColor(C1022030chd.LJI(this.LL, LJIILL()));
                        LJIL().setBackground(gradientDrawable);
                        break;
                    }
                }
                break;
            case 2016314694:
                if (str.equals("comment_aweme_and_params")) {
                    this.LLJJIII = true;
                    ((LinkedHashMap) this.LLJJJ).clear();
                    if (this.LLJJIJIIJIL != 0) {
                        this.LLILZ.BQ2("comment_shown", this);
                    }
                    this.LLJJIJIIJIL = 0;
                    LJIJJLI(LJIL(), this.LL.getResources().getDimensionPixelOffset(R.dimen.e8), 0, false);
                    Object obj6 = c0rd4.LIZIZ;
                    if (obj6 != null) {
                        obj = obj6;
                    }
                    Pair pair2 = (Pair) obj;
                    if (pair2 != null && (aweme = (Aweme) pair2.getFirst()) != null) {
                        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                        if (awemeRawAd != null) {
                            zIsCommentAreaSwitch = awemeRawAd.isCommentAreaSwitch();
                        }
                        this.LLJJIJIL = zIsCommentAreaSwitch;
                        LJJ();
                        LJIJI();
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(C0RD4 c0rd4) {
        onChanged(c0rd4);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        AwemeRawAd awemeRawAd;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || marginLayoutParams.bottomMargin < 0 || !LJIIZILJ() || (awemeRawAd = LJIILL().getAwemeRawAd()) == null) {
            return;
        }
        int id = view.getId();
        boolean z = true;
        if (id == R.id.e_2) {
            String type = awemeRawAd.getType();
            if (type != null && type.length() != 0) {
                Aweme awemeLJIILL = LJIILL();
                List<String> list = C1019030ccn.LIZ;
                if (AwemeExtKt.isAdTraffic(awemeLJIILL)) {
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("comment_end_ad", "click", awemeLJIILL.getAwemeRawAd());
                    c1022820ciuLIZLLL.LIZJ("button", "refer");
                    c1022820ciuLIZLLL.LIZIZ(C1019030ccn.LJI(awemeLJIILL), "anchor_id");
                    c1022820ciuLIZLLL.LIZIZ(C1019030ccn.LJIIZILJ(awemeLJIILL), "room_id");
                    c1022820ciuLIZLLL.LJII();
                    AwemeRawAd awemeRawAd2 = awemeLJIILL.getAwemeRawAd();
                    if (awemeRawAd2 != null) {
                        C2201701BEy c2201701BEy = C2201701BEy.LIZ;
                        UrlModel clickTrackUrlList = awemeRawAd2.getClickTrackUrlList();
                        Long creativeId = awemeRawAd2.getCreativeId();
                        String logExtra = awemeRawAd2.getLogExtra();
                        c2201701BEy.getClass();
                        C2201701BEy.LIZ("click", clickTrackUrlList, creativeId, logExtra);
                    }
                }
                if (C1021860chM.LJJJI(this.LL, LJIILL(), 6, (InterfaceC1021920chS) this.LLJJI.getValue())) {
                    this.LLJI.invoke();
                    return;
                }
                return;
            }
            return;
        }
        if (id != R.id.e9y) {
            return;
        }
        this.LLJJIII = false;
        Context context = this.LL;
        JSONObject jSONObjectLJIIL = C1019030ccn.LJIIL(context, awemeRawAd, true, null);
        if (!TextUtils.isEmpty("button")) {
            try {
                jSONObjectLJIIL.put("refer", "button");
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        if (context == null) {
            z = false;
        }
        if (z) {
            C1019030ccn.LJJJJJ(context, awemeRawAd, "comment_end_ad", "close", jSONObjectLJIIL);
        }
        C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("comment_end_ad", "close", awemeRawAd);
        c1022820ciuLIZLLL2.LIZJ("button", "refer");
        c1022820ciuLIZLLL2.LJIIIIZZ();
        LJIJJLI(LJIL(), this.LL.getResources().getDimensionPixelOffset(R.dimen.e8), DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, false);
    }

    public final void LJIJJLI(View view, int i, int i2, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z2;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int i3 = marginLayoutParams.bottomMargin;
            boolean z3 = true;
            if (i3 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                if (!z2) {
                    Context context = this.LL;
                    AwemeRawAd awemeRawAd = LJIILL().getAwemeRawAd();
                    JSONObject jSONObjectLJIIL = C1019030ccn.LJIIL(context, awemeRawAd, false, null);
                    if (context == null || awemeRawAd == null) {
                        z3 = false;
                    }
                    if (z3) {
                        C1019030ccn.LJJJJJ(context, awemeRawAd, "comment_end_ad", "othershow", jSONObjectLJIIL);
                    }
                    C2184171Adz.LIZLLL("comment_end_ad", "othershow", LJIILL().getAwemeRawAd()).LJIIIIZZ();
                    C421750GgH.LIZIZ(view, i3, i, i2).start();
                    return;
                }
                return;
            }
            if (!z2) {
                return;
            }
            C421750GgH.LIZIZ(view, i3, i, i2).start();
        }
    }
}
