package com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog;

import X.C0IJT;
import X.C0JBN;
import X.C0KVU;
import X.C0KVZ;
import X.C0TVI;
import X.C0TZM;
import X.C1110390f09;
import X.C1116310f9h;
import X.C1116320f9i;
import X.C1116330f9j;
import X.C1116450f9v;
import X.C1116500fA0;
import X.C1127330fRT;
import X.C1144350fsv;
import X.C1151670g4j;
import X.C1161920gLG;
import X.C1324610kZf;
import X.C13LP;
import X.C14K9;
import X.C1668220tVs;
import X.C1697810uHb;
import X.C16F5;
import X.C16FS;
import X.C16FZ;
import X.C16G6;
import X.C1819620xS4;
import X.C2188811AlT;
import X.C238400w2;
import X.C416770GVv;
import X.C417260GXs;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500950Jkj;
import X.C500980Jkm;
import X.C501470JlZ;
import X.C766270U4b;
import X.C782110Um9;
import X.C786410Ut5;
import X.C800330VaR;
import X.C994850bzn;
import X.CountDownTimerC1151440g4M;
import X.EnumC1088820eRM;
import X.EnumC1110450f0F;
import X.InterfaceC1116370f9n;
import X.InterfaceC1118490fDD;
import X.InterfaceC1149850g1n;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import X.InterfaceC743640TFa;
import X.ViewOnClickListenerC751210TdP;
import Y.ACListenerS147S0100000_12;
import Y.ACListenerS152S0100000_17;
import Y.ACListenerS79S0300000_12;
import Y.AcS497S0100000_17;
import android.app.Dialog;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.gift.ShowRechargeDialogEvent;
import com.bytedance.android.live.room.LiveEndEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.OrientationChangedChannel;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentKeyboardFixSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.text.a0;
import kotlin.text.u;
import tikcast.api.star_comment.StarCommentItem;
import tikcast.api.star_comment.StarCommentPurchaseResponse;
import tikcast.api.star_comment.StarCommentQueue;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes18.dex */
public final class StarCommentPaymentDialog extends LiveDialogFragment implements InterfaceC1116370f9n {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISg8JWEhLTMpJzo2ZjY4KDHELIOS0wJyghLCEnZjUtMCI2JjEoIC4/JyJiGjsyOgYjJCI2JjEcKDY+LSs4DSYyJCor";
    public C16F5 LL;
    public C994850bzn LLILLL;
    public C1668220tVs LLILZ;
    public C1116450f9v LLILZIL;
    public List<EmoteWithIndex> LLIZ;
    public boolean LLIZLLLIL;
    public RecyclerView LLJI;
    public C1116500fA0 LLJIJIL;
    public C16FS LLJILJIL;
    public LinearLayout LLJILJILJ;
    public View LLJILLL;
    public C16FZ LLJJ;
    public C417260GXs LLJJI;
    public ImageView LLJJIII;
    public LiveEditText LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public View LLJJJ;
    public CountDownTimerC1151440g4M LLJJJIL;
    public int LLJJJJ;
    public long LLJJJJJIL;
    public C16F5 LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public long LLJLIL;
    public C16F5 LLJLILLLLZIIL;
    public boolean LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public long LLJZ;
    public int LLJZIJLIL;
    public long LLL;
    public boolean LLLF;
    public ForegroundColorSpan LLLFF;
    public C0KVZ LLLFFI;
    public C1116330f9j LLLI;
    public Context LLLII;
    public boolean LLILLJJLI = true;
    public String LLILZLL = C1116310f9h.LJFF;
    public final List<C1116450f9v> LLJ = new ArrayList();
    public int LLJJIJIL = 50;
    public String LLJJJJLIIL = "";
    public String LLLFZ = "";
    public final BPEAHandler LLLIIII = new BPEAHandler(Looper.getMainLooper(), new C1151670g4j(this, 2));

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final boolean OR() {
        String string;
        String str = this.LLILZLL;
        boolean z = (str == null || (string = a0.LJLIIIL(str).toString()) == null || string.length() <= 0) ? false : true;
        boolean z2 = this.LLJJJJ == 1;
        String str2 = this.LLILZLL;
        return z && z2 && !((str2 != null ? str2.length() : 0) > this.LLJJIJIL);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        int i;
        int i2;
        DataChannel dataChannel = this.dataChannel;
        boolean zLJJIJIL = C500260Jjc.LJJIJIL(dataChannel != null ? (Boolean) dataChannel.gg0(C0TZM.class) : null);
        this.LLILLJJLI = zLJJIJIL;
        if (zLJJIJIL) {
            i = R.style.akg;
            i2 = R.layout.gau;
        } else {
            i = R.style.ain;
            i2 = R.layout.gav;
        }
        C500980Jkm c500980Jkm = new C500980Jkm(i2);
        c500980Jkm.LIZJ = i;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJIILIIL = LiveStarCommentKeyboardFixSetting.INSTANCE.enabled() ? 32 : 48;
        c500980Jkm.LJII = 80;
        if (!this.LLILLJJLI) {
            c500980Jkm.LJIIIZ = C497740JfY.LJIIIZ(R.dimen.arw);
            c500980Jkm.LJII = 5;
        }
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final InterfaceC1118490fDD genLandscapeDialogProxy() {
        return new C500950Jkj(this.LLILLJJLI ? R.layout.gau : R.layout.gav);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        EnumC1088820eRM enumC1088820eRM;
        if (this.LLLI == null) {
            String str = this.LLILZLL;
            C1116450f9v c1116450f9v = this.LLILZIL;
            int iOrdinal = (c1116450f9v == null || (enumC1088820eRM = c1116450f9v.LJ) == null) ? 0 : enumC1088820eRM.ordinal();
            C1116310f9h.LJFF = str;
            C1116310f9h.LIZIZ = iOrdinal;
        }
        this.LLLIIII.removeMessages(1);
        CountDownTimerC1151440g4M countDownTimerC1151440g4M = this.LLJJJIL;
        if (countDownTimerC1151440g4M != null) {
            countDownTimerC1151440g4M.cancel();
        }
        int i = this.LLJLLIL;
        long j = i == 0 ? 0L : this.LLJZ / ((long) i);
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.LLJLIL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        String str2 = this.LLLFZ;
        if (str2 == null) {
            str2 = "";
        }
        int i2 = this.LLJLLIL;
        int i3 = this.LLJLLL;
        int i4 = this.LLJZIJLIL;
        boolean z = this.LLLF;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_exit");
        c474500IjALIZ.LJIL();
        C1116320f9i.LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "stay_duration");
        c474500IjALIZ.LJJII(str2, "enter_from");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "countdown_request_count");
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "countdown_success_count");
        c474500IjALIZ.LJJII(Long.valueOf(j), "countdown_avg_duration");
        c474500IjALIZ.LJJII(Integer.valueOf(i4), "countdown_not_empty_count");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "buyed");
        c474500IjALIZ.LIZ();
        super.onDestroy();
    }

    public final void ZR() {
        if (isAdded()) {
            if (OR()) {
                C16FS c16fs = this.LLJILJIL;
                if (c16fs != null) {
                    Context context = getContext();
                    c16fs.setBackground(context != null ? C800330VaR.LIZIZ(context, R.drawable.e7w) : null);
                }
                C16FS c16fs2 = this.LLJILJIL;
                if (c16fs2 != null) {
                    c16fs2.setTextColor(ColorProtector.parseColor("#191A1D"));
                    return;
                }
                return;
            }
            C16FS c16fs3 = this.LLJILJIL;
            if (c16fs3 != null) {
                Context context2 = getContext();
                c16fs3.setBackground(context2 != null ? C800330VaR.LIZIZ(context2, R.drawable.e7v) : null);
            }
            C16FS c16fs4 = this.LLJILJIL;
            if (c16fs4 != null) {
                c16fs4.setTextColor(getResources().getColor(R.color.f589aa3));
            }
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    public final void MR(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (z) {
            View view = this.LLJJJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            FrameLayout frameLayout = this.LLJJIJIIJIL;
            if (frameLayout != null) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams2.topMargin = (int) C497740JfY.LIZIZ(9.0f);
                    return;
                }
                return;
            }
            return;
        }
        View view2 = this.LLJJJ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        FrameLayout frameLayout2 = this.LLJJIJIIJIL;
        if (frameLayout2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
            return;
        }
        marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(21.0f);
    }

    public final String NR(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 3) {
            String strSubstring = str.substring(0, 4);
            if (u.LJIIZILJ(strSubstring, e3.d, false)) {
                return strSubstring.substring(0, 3);
            }
            return strSubstring;
        }
        return str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|2|(4:4|(1:6)|7|(1:9))(1:28)|10|(13:12|(1:14)|15|(1:19)|20|(1:24)|25|37|29|32|(1:34)|35|36)(1:26)|27|15|(2:17|19)|20|(2:22|24)(0)|25|37|29|32|(0)|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r7 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void SR(boolean r19) {
        /*
            r18 = this;
            r4 = 1
            r16 = r19
            r15 = r18
            if (r16 == 0) goto L53
            android.widget.LinearLayout r1 = r15.LLJILJILJ
            if (r1 == 0) goto L10
            r0 = 8
            X.C786410Ut5.LJZL(r0, r1)
        L10:
            X.16FZ r1 = r15.LLJJ
            if (r1 == 0) goto L18
            r0 = 0
            X.C786410Ut5.LLLIZZ(r1, r0)
        L18:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r15.dataChannel
            r3 = 0
            if (r1 == 0) goto L50
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r2 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r2
            if (r2 == 0) goto L51
            long r0 = r2.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L2f:
            java.lang.String r6 = java.lang.String.valueOf(r0)
            if (r2 == 0) goto L3f
            com.bytedance.android.live.base.model.user.User r0 = r2.getOwner()
            if (r0 == 0) goto L3f
            java.lang.String r3 = r0.getSecUid()
        L3f:
            java.lang.String r5 = java.lang.String.valueOf(r3)
            X.0f9v r0 = r15.LLILZIL
            if (r0 == 0) goto L4b
            java.lang.String r0 = r0.LJFF
            if (r0 != 0) goto L4d
        L4b:
            java.lang.String r0 = "0"
        L4d:
            r9 = 0
            goto L5a
        L50:
            r2 = r3
        L51:
            r0 = r3
            goto L2f
        L53:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r15.LLLIIII
            r0.removeMessages(r4)
            r4 = 2
            goto L18
        L5a:
            long r7 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L5f
            goto L65
        L5f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r7 = 0
        L65:
            X.0f9v r0 = r15.LLILZIL
            if (r0 == 0) goto L6b
            long r9 = r0.LIZ
        L6b:
            long r13 = java.lang.System.currentTimeMillis()
            X.0Ism r1 = X.C480460Ism.LIZ()
            java.lang.Class<com.bytedance.android.livesdk.impl.revenue.starcomment.api.StarCommentApi> r0 = com.bytedance.android.livesdk.impl.revenue.starcomment.api.StarCommentApi.class
            r1.getClass()
            java.lang.Object r3 = X.C480460Ism.LIZLLL(r0)
            com.bytedance.android.livesdk.impl.revenue.starcomment.api.StarCommentApi r3 = (com.bytedance.android.livesdk.impl.revenue.starcomment.api.StarCommentApi) r3
            long r11 = r15.LLL
            X.11NZ r1 = r3.getPurchasePageWithParameter(r4, r5, r6, r7, r9, r11)
            X.0UO0 r0 = new X.0UO0
            r0.<init>()
            X.11NZ r1 = r1.LJIILIIL(r0)
            X.0xx0 r0 = X.C0J1R.LIZIZ(r15)
            X.11NZ r1 = r1.LJIILIIL(r0)
            Y.AfS2S0110100_17 r12 = new Y.AfS2S0110100_17
            r17 = 0
            r12.<init>(r13, r15, r16, r17)
            Y.AfS2S0110100_17 r0 = new Y.AfS2S0110100_17
            r7 = 1
            r2 = r0
            r3 = r13
            r5 = r15
            r6 = r16
            r2.<init>(r3, r5, r6, r7)
            r1.LJJLL(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog.SR(boolean):void");
    }

    public final void UR(long j) {
        if (j >= 0) {
            CountDownTimerC1151440g4M countDownTimerC1151440g4M = this.LLJJJIL;
            if (countDownTimerC1151440g4M != null) {
                countDownTimerC1151440g4M.cancel();
            }
            CountDownTimerC1151440g4M countDownTimerC1151440g4M2 = new CountDownTimerC1151440g4M(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT), this, 0);
            this.LLJJJIL = countDownTimerC1151440g4M2;
            countDownTimerC1151440g4M2.start();
        }
    }

    public final void WR(String str) {
        int i;
        String strValueOf;
        try {
            i = CastIntegerProtector.parseInt(str);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            i = 2;
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        long j = i;
        if (j >= 1000000) {
            long j2 = 1 * j;
            if (j > 999000000) {
                j2 = 999000000;
            }
            String strJ4 = C786410Ut5.j4("%.3f", Arrays.copyOf(new Object[]{Double.valueOf((j2 * 1.0d) / ((double) 1000000))}, 1));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(NR(strJ4));
            sbLIZ.append('M');
            strValueOf = C2188811AlT.LIZIZ(sbLIZ);
        } else if (j >= 1000) {
            String strJ42 = C786410Ut5.j4("%.3f", Arrays.copyOf(new Object[]{Double.valueOf((j * 1.0d) / ((double) LSPassThroughRecordSizeConfig.DEFAULT))}, 1));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(NR(strJ42));
            sbLIZ2.append('K');
            strValueOf = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strValueOf = String.valueOf(j);
        }
        objArr[0] = strValueOf;
        sb.append(C497740JfY.LJIIL(2131755595, i, objArr));
        sb.append(' ');
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        Context context = getContext();
        C238400w2 c238400w2 = new C238400w2();
        C417260GXs c417260GXs = this.LLJJI;
        if (c417260GXs != null) {
            c417260GXs.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C417260GXs c417260GXs2 = this.LLJJI;
        if (c417260GXs2 != null) {
            c417260GXs2.setHighlightColor(0);
        }
        C417260GXs c417260GXs3 = this.LLJJI;
        if (c417260GXs3 != null) {
            c417260GXs3.setTextInternal$liverevenue_impl_release(spannableStringBuilder);
        }
        C500260Jjc.LLFFF(this.LLJJIII);
        ImageView imageView = this.LLJJIII;
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new ACListenerS79S0300000_12(c238400w2, this, context, 8));
        }
    }

    @Override // X.InterfaceC1116370f9n
    public final void de(StarCommentPurchaseResponse.Data data) {
        List<StarCommentItem> list;
        String str;
        String string;
        if (!isAdded()) {
            return;
        }
        this.LLJL = false;
        C16FS c16fs = this.LLJILJIL;
        if (c16fs != null) {
            c16fs.LJIIL();
        }
        int i = data.purchaseResult;
        if (i != 1) {
            if (i == 2) {
                StarCommentQueue starCommentQueue = data.queue;
                if (starCommentQueue != null) {
                    list = starCommentQueue.starCommentList;
                } else {
                    list = null;
                }
                C1116450f9v c1116450f9v = this.LLILZIL;
                String str2 = "";
                if (c1116450f9v == null || (str = c1116450f9v.LJFF) == null) {
                    str = "";
                }
                String strValueOf = String.valueOf(data.roomUserCount);
                WR(strValueOf);
                if (list != null) {
                    VR(list, null, false);
                }
                C1116450f9v c1116450f9v2 = this.LLILZIL;
                if (c1116450f9v2 != null && (string = Long.valueOf(c1116450f9v2.LIZ).toString()) != null) {
                    str2 = string;
                }
                String strLJIJJ = C497740JfY.LJIJJ(2131844139, str, strValueOf, str2);
                int iLJJJ = a0.LJJJ(strLJIJJ, "[coin_icon]", 0, false, 6);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLJIJJ);
                Drawable drawableMutate = getResources().getDrawable(R.drawable.etw).mutate();
                drawableMutate.setBounds(0, 0, (int) C497740JfY.LIZIZ(14.0f), (int) C497740JfY.LIZIZ(14.0f));
                C16G6.LIZIZ(drawableMutate, C497740JfY.LJJ() ? 1 : 0);
                C786410Ut5.q2(spannableStringBuilder, new C416770GVv(drawableMutate), iLJJJ, iLJJJ + 11, 34);
                C16F5 c16f5 = new C16F5(getContext(), null);
                C786410Ut5.y6(c16f5, new ViewGroup.LayoutParams(-2, -2));
                c16f5.setText(spannableStringBuilder);
                c16f5.LJJJI(R.style.a8z);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_send_acu_changed");
                c474500IjALIZ.LJIL();
                C1116320f9i.LIZ(c474500IjALIZ);
                c474500IjALIZ.LIZ();
                C782110Um9 c782110Um9 = new C782110Um9(getContext());
                c782110Um9.LIZJ = C497740JfY.LJIJI(2131844140);
                c782110Um9.LJIIIIZZ(c16f5);
                c782110Um9.LJIILLIIL = false;
                c782110Um9.LJIILL = false;
                c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131844105), new AcS497S0100000_17(this, 3));
                c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131844137), new InterfaceC743640TFa() { // from class: X.0f9x
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        liveDialog.dismiss();
                    }
                });
                C786410Ut5.E4(c782110Um9.LIZ());
                return;
            }
            return;
        }
        this.LLLF = true;
        this.LLILZLL = null;
        dismiss();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void onDialogCreated(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(-1);
        }
        super.onDialogCreated(dialog);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.LLLII = new ContextThemeWrapper(getActivity(), R.style.z4);
        return super.onGetLayoutInflater(bundle).cloneInContext(this.LLLII);
    }

    @Override // X.InterfaceC1116370f9n
    public final void ut(Throwable th) {
        String errorMsg;
        this.LLJL = false;
        if (!isAdded()) {
            return;
        }
        C16FS c16fs = this.LLJILJIL;
        if (c16fs != null) {
            c16fs.LJIIL();
        }
        if (th instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            if (c501470JlZ.getErrorCode() != 4038005 && c501470JlZ.getErrorCode() != 4038007) {
                if (c501470JlZ.getErrorCode() == 4038039 && (errorMsg = c501470JlZ.getErrorMsg()) != null && errorMsg.length() != 0) {
                    String errorMsg2 = c501470JlZ.getErrorMsg();
                    this.LLJJJJLIIL = errorMsg2;
                    C766270U4b.LJIIJJI(errorMsg2);
                    return;
                }
                return;
            }
            MR(true);
        }
    }

    public final void PR(long j, long j2) {
        C1127330fRT c1127330fRT = new C1127330fRT("star_comment", j, "normal", "star_comment", "star_comment");
        c1127330fRT.LJIIIIZZ = -1L;
        c1127330fRT.LJIIIZ = (int) j2;
        c1127330fRT.LJFF = true;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(ShowRechargeDialogEvent.class, c1127330fRT);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RR(int r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog.RR(int, boolean):void");
    }

    public final boolean aS(final long j, final long j2) {
        return ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJIJJLI(getContext(), new C1144350fsv(this.dataChannel, (int) j2, -1L, "star_comment", "star_comment", "single_gift", 192), new InterfaceC1149850g1n() { // from class: X.0f9w
            @Override // X.InterfaceC1149850g1n
            public final void LIZ(int i) {
            }

            @Override // X.InterfaceC1149850g1n
            public final void LJ(int i, boolean z) {
            }

            @Override // X.InterfaceC1149850g1n
            public final void onShow() {
            }

            @Override // X.InterfaceC1149850g1n
            public final void LIZJ() {
                this.LIZ.PR(j, j2);
            }

            @Override // X.InterfaceC1149850g1n
            public final void LIZLLL() {
                this.LIZ.PR(j, j2);
            }

            @Override // X.InterfaceC1149850g1n
            public final void LJFF() {
                this.LIZ.PR(j, j2);
            }

            @Override // X.InterfaceC1149850g1n
            public final void LIZIZ(int i, long j3, boolean z, boolean z2, int i2, Boolean bool) {
                this.LIZ.RR(i, z);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List urls;
        User userLJIJJLI;
        User user;
        C1116330f9j c1116330f9j;
        String str;
        View view2;
        List<EmoteWithIndex> list;
        String str2;
        String str3;
        List<EmoteWithIndex> list2;
        List<BadgeStruct> badgeList;
        C0KVZ c0kvz;
        View view3;
        super.onViewCreated(view, bundle);
        this.LLJLIL = System.currentTimeMillis();
        this.LLJILJILJ = (LinearLayout) view.findViewById(R.id.hbi);
        View viewFindViewById = view.findViewById(R.id.t59);
        this.LLJILLL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS152S0100000_17(this, 79), viewFindViewById);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0DKo
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view4, C20246014Ju c20246014Ju) {
                    view4.setPadding(view4.getPaddingLeft(), view4.getPaddingTop(), view4.getPaddingRight(), c20246014Ju.LIZ(2).LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        this.LLILLL = (C994850bzn) view.findViewById(R.id.m44);
        this.LLILZ = (C1668220tVs) view.findViewById(R.id.c9c);
        this.LLJI = (RecyclerView) view.findViewById(R.id.ul2);
        this.LLJILJIL = (C16FS) view.findViewById(R.id.up_);
        this.LLJJ = (C16FZ) view.findViewById(R.id.nnp);
        this.LLJJJ = view.findViewById(R.id.warning_hint);
        this.LLJJIJIIJIL = (FrameLayout) view.findViewById(R.id.vxj);
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.fss);
        this.LLJJL = (C16F5) view.findViewById(R.id.rey);
        this.LLJJIJI = (LiveEditText) view.findViewById(R.id.grz);
        this.LLJLILLLLZIIL = (C16F5) view.findViewById(R.id.pgt);
        this.LLJJI = (C417260GXs) view.findViewById(R.id.vxi);
        this.LLJJIII = (ImageView) view.findViewById(R.id.vxk);
        this.LLLFFI = (C0KVZ) view.findViewById(R.id.bqd);
        if (!this.LLILLJJLI && C497740JfY.LJJ() && (view3 = this.LLJJLIIIJLLLLLLLZ) != null) {
            view3.setBackgroundResource(R.drawable.e7z);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1116450f9v());
        arrayList.add(new C1116450f9v());
        this.LLJIJIL = new C1116500fA0(this.dataChannel, arrayList);
        RecyclerView recyclerView = this.LLJI;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), this.LLILLJJLI ? 1 : 0, false));
        }
        RecyclerView recyclerView2 = this.LLJI;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LLJIJIL);
        }
        if (LiveStarCommentKeyboardFixSetting.INSTANCE.enabled()) {
            LiveEditText liveEditText = this.LLJJIJI;
            if (liveEditText != null) {
                int imeOptions = liveEditText.getImeOptions();
                LiveEditText liveEditText2 = this.LLJJIJI;
                if (liveEditText2 != null) {
                    liveEditText2.setImeOptions(imeOptions | 268435456);
                }
            }
            LiveEditText liveEditText3 = this.LLJJIJI;
            if (liveEditText3 != null) {
                liveEditText3.setInputType(131073);
            }
        }
        LiveEditText liveEditText4 = this.LLJJIJI;
        if (liveEditText4 != null) {
            liveEditText4.addTextChangedListener(new TextWatcher() { // from class: X.0f9u
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    int length;
                    EnumC1088820eRM enumC1088820eRM;
                    String string;
                    if (this.LL.LLIZLLLIL) {
                        return;
                    }
                    if (editable != null) {
                        length = editable.length();
                    } else {
                        length = 0;
                    }
                    String str4 = "";
                    if (editable != null) {
                        if (a0.LJJIIZI(editable.toString(), "\n", false)) {
                            string = u.LJJIFFI(editable.toString(), "\n", " ", false);
                        } else {
                            string = editable.toString();
                        }
                        this.LL.LLILZLL = u.LJJIFFI(string, "￼", "", false);
                    }
                    StarCommentPaymentDialog starCommentPaymentDialog = this.LL;
                    String str5 = starCommentPaymentDialog.LLILZLL;
                    if (str5 != null) {
                        int length2 = str5.length();
                        List<EmoteWithIndex> list3 = starCommentPaymentDialog.LLIZ;
                        if (list3 != null) {
                            Iterator<EmoteWithIndex> it2 = list3.iterator();
                            while (it2.hasNext()) {
                                it2.next().index = length2;
                                length2++;
                            }
                        }
                    }
                    if (a0.LJJIIZI(String.valueOf(editable), "\n", false)) {
                        return;
                    }
                    StarCommentPaymentDialog starCommentPaymentDialog2 = this.LL;
                    if (length > starCommentPaymentDialog2.LLJJIJIL) {
                        Object obj = starCommentPaymentDialog2.LLLFF;
                        if (obj != null && editable != null) {
                            editable.removeSpan(obj);
                        }
                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-65536);
                        if (editable != null) {
                            editable.setSpan(foregroundColorSpan, this.LL.LLJJIJIL, length, 33);
                        }
                        this.LL.LLLFF = foregroundColorSpan;
                        if (C497740JfY.LJJ()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(this.LL.LLJJIJIL);
                            sbLIZ.append('/');
                            sbLIZ.append(length);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
                            C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, String.valueOf(this.LL.LLJJIJIL).length() + 1, String.valueOf(this.LL.LLJJIJIL).length() + String.valueOf(length).length() + 1, 33);
                            C16F5 c16f5 = this.LL.LLJLILLLLZIIL;
                            if (c16f5 != null) {
                                c16f5.setText(spannableStringBuilder);
                            }
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(length);
                            sbLIZ2.append('/');
                            sbLIZ2.append(this.LL.LLJJIJIL);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ2));
                            C786410Ut5.q2(spannableStringBuilder2, foregroundColorSpan, 0, String.valueOf(length).length(), 33);
                            C16F5 c16f52 = this.LL.LLJLILLLLZIIL;
                            if (c16f52 != null) {
                                c16f52.setText(spannableStringBuilder2);
                            }
                        }
                    } else {
                        Object obj2 = starCommentPaymentDialog2.LLLFF;
                        if (obj2 != null && editable != null) {
                            editable.removeSpan(obj2);
                        }
                        if (C497740JfY.LJJ()) {
                            C16F5 c16f53 = this.LL.LLJLILLLLZIIL;
                            if (c16f53 != null) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append(this.LL.LLJJIJIL);
                                sbLIZ3.append('/');
                                sbLIZ3.append(length);
                                c16f53.setText(C2188811AlT.LIZIZ(sbLIZ3));
                            }
                        } else {
                            C16F5 c16f54 = this.LL.LLJLILLLLZIIL;
                            if (c16f54 != null) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append(length);
                                sbLIZ4.append('/');
                                sbLIZ4.append(this.LL.LLJJIJIL);
                                c16f54.setText(C2188811AlT.LIZIZ(sbLIZ4));
                            }
                        }
                    }
                    View view4 = this.LL.LLJJJ;
                    if (view4 != null && view4.getVisibility() == 0) {
                        this.LL.MR(false);
                    }
                    if (!this.LL.LLJLL) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        StarCommentPaymentDialog starCommentPaymentDialog3 = this.LL;
                        if (jCurrentTimeMillis - starCommentPaymentDialog3.LLJLIL > Mp4ScreenVideoLoadTimeout.CONTROL) {
                            starCommentPaymentDialog3.LLJLL = true;
                            String str6 = starCommentPaymentDialog3.LLLFZ;
                            if (str6 == null) {
                                str6 = "";
                            }
                            C1116450f9v c1116450f9v = starCommentPaymentDialog3.LLILZIL;
                            if (c1116450f9v != null && (enumC1088820eRM = c1116450f9v.LJ) != null) {
                                int i = C1088830eRN.LIZ[enumC1088820eRM.ordinal()];
                                if (i != 1) {
                                    if (i == 2) {
                                        str4 = "up_grade";
                                    }
                                } else {
                                    str4 = "basic";
                                }
                            }
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_typing");
                            c474500IjALIZ.LJIL();
                            c474500IjALIZ.LJJII(str6, "enter_from");
                            c474500IjALIZ.LJJII(str4, "gear_type");
                            C1116320f9i.LIZ(c474500IjALIZ);
                            c474500IjALIZ.LIZ();
                        }
                    }
                    this.LL.ZR();
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    SpannableStringBuilder spannableStringBuilder;
                    List<EmoteWithIndex> list3;
                    if (i2 > 0 && i3 == 0) {
                        StarCommentPaymentDialog starCommentPaymentDialog = this.LL;
                        if (charSequence instanceof SpannableStringBuilder) {
                            spannableStringBuilder = (SpannableStringBuilder) charSequence;
                        } else {
                            spannableStringBuilder = null;
                        }
                        int i4 = i2 + i;
                        starCommentPaymentDialog.getClass();
                        if (spannableStringBuilder != null) {
                            while (i < i4) {
                                C416770GVv[] c416770GVvArr = (C416770GVv[]) spannableStringBuilder.getSpans(i, i, C416770GVv.class);
                                if (c416770GVvArr != null && c416770GVvArr.length != 0 && (list3 = starCommentPaymentDialog.LLIZ) != null) {
                                    C500260Jjc.LJJJLIIL(list3, new C020M(i, 1));
                                }
                                i++;
                            }
                        }
                    }
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    if (this.LL.LLIZLLLIL) {
                        return;
                    }
                    if (C500260Jjc.LJJIIZ(charSequence)) {
                        StarCommentPaymentDialog starCommentPaymentDialog = this.LL;
                        LiveEditText liveEditText5 = starCommentPaymentDialog.LLJJIJI;
                        if (liveEditText5 != null) {
                            liveEditText5.setTextAppearance(R.style.rg);
                            liveEditText5.setTextColor(C20736316Cj.LIZIZ(R.attr.zi, starCommentPaymentDialog.LLLII));
                        }
                    } else {
                        StarCommentPaymentDialog starCommentPaymentDialog2 = this.LL;
                        LiveEditText liveEditText6 = starCommentPaymentDialog2.LLJJIJI;
                        if (liveEditText6 != null) {
                            liveEditText6.setTextAppearance(R.style.rf);
                            liveEditText6.setHintTextColor(C20736316Cj.LIZIZ(R.attr.es_, starCommentPaymentDialog2.LLLII));
                        }
                    }
                    if (charSequence instanceof SpannableStringBuilder) {
                        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
                        if (a0.LJJIIZI(spannableStringBuilder.toString(), "\n", false)) {
                            for (int i4 = 0; i4 < spannableStringBuilder.length(); i4++) {
                                if (spannableStringBuilder.charAt(i4) == '\n') {
                                    spannableStringBuilder.replace(i4, i4 + 1, (CharSequence) " ");
                                }
                            }
                            LiveEditText liveEditText7 = this.LL.LLJJIJI;
                            if (liveEditText7 != null) {
                                liveEditText7.setText(charSequence);
                            }
                            LiveEditText liveEditText8 = this.LL.LLJJIJI;
                            if (liveEditText8 != null) {
                                liveEditText8.setSelection(i + i3);
                            }
                        }
                    }
                }
            });
        }
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.jp8);
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ViewOnClickListenerC751210TdP(new ACListenerS147S0100000_12(this, 287)));
        }
        LiveIconView liveIconView2 = (LiveIconView) view.findViewById(R.id.sl1);
        if (liveIconView2 != null) {
            C786410Ut5.g8(liveIconView2, new ViewOnClickListenerC751210TdP(new ACListenerS147S0100000_12(this, 288)));
        }
        ZR();
        C16FS c16fs = this.LLJILJIL;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS152S0100000_17(this, 81));
        }
        View viewFindViewById2 = view.findViewById(R.id.bh2);
        InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        ImageModel avatarThumb = currentUser.getAvatarThumb();
        ViewGroup.LayoutParams layoutParams = null;
        if (avatarThumb != null) {
            urls = avatarThumb.getUrls();
        } else {
            urls = null;
        }
        C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(urls);
        c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
        int width = viewFindViewById2.getWidth();
        int height = viewFindViewById2.getHeight();
        c1324610kZfLIZJ.LJ = width;
        c1324610kZfLIZJ.LJFF = height;
        c1324610kZfLIZJ.LJIIIZ = R.drawable.eze;
        c1324610kZfLIZJ.LJJI(viewFindViewById2);
        TextView textView = (TextView) view.findViewById(R.id.user_name);
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            userLJIJJLI = interfaceC500940JkiUser.LJIJJLI();
        } else {
            userLJIJJLI = null;
        }
        textView.setText(C0KVU.LIZ(userLJIJJLI));
        if (currentUser instanceof User) {
            user = (User) currentUser;
        } else {
            user = null;
        }
        if (user != null && (badgeList = user.getBadgeList()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (BadgeStruct badgeStruct : badgeList) {
                if (badgeStruct.badgeScene == 10) {
                    arrayList2.add(badgeStruct);
                }
            }
            Object objLJJJLL = C13LP.LJJJLL(arrayList2);
            if (objLJJJLL != null && (c0kvz = this.LLLFFI) != null) {
                c0kvz.LJ(false, C1697810uHb.LJIILJJIL(objLJJJLL), (User) currentUser, 1, new AwS561S0100000_17(this, 292), null, true);
            }
        }
        View viewFindViewById3 = view.findViewById(R.id.fy0);
        if (viewFindViewById3 != null) {
            C786410Ut5.I7(new ACListenerS152S0100000_17(this, 80), viewFindViewById3);
        }
        View view4 = this.LLJJLIIIJLLLLLLLZ;
        if (view4 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 289), view4);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.vyd);
        appCompatTextView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, appCompatTextView.getText().length() * appCompatTextView.getPaint().getTextSize(), 0.0f, ColorProtector.parseColor("#F2EAFD"), ColorProtector.parseColor("#D4FAFF"), Shader.TileMode.CLAMP));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, ChangeSelectItemEvent.class, new AwS596S0100000_17(this, 282));
            dataChannel.BQ2(this, LiveEndEvent.class, new AwS596S0100000_17(this, 283));
        }
        C1116330f9j c1116330f9j2 = this.LLLI;
        if ((c1116330f9j2 != null && (list2 = c1116330f9j2.LIZJ) != null && !list2.isEmpty()) || ((c1116330f9j = this.LLLI) != null && (str = c1116330f9j.LIZIZ) != null && str.length() != 0)) {
            C1116330f9j c1116330f9j3 = this.LLLI;
            if (c1116330f9j3 != null) {
                list = c1116330f9j3.LIZJ;
            } else {
                list = null;
            }
            this.LLIZ = list;
            if (c1116330f9j3 != null) {
                str2 = c1116330f9j3.LIZIZ;
            } else {
                str2 = null;
            }
            this.LLILZLL = str2;
            if (c1116330f9j3 == null || (str3 = c1116330f9j3.LIZIZ) == null) {
                str3 = "";
            }
            C1110390f09 c1110390f09 = C1110390f09.LIZ;
            C1110390f09.LIZ(list, EnumC1110450f0F.PUBLICSCREEN_MESSAGE_TYPE, str3, getResources(), null, null, new AwS596S0100000_17(this, 284), this, true);
        }
        SR(true);
        if (!this.LLILLJJLI && (view2 = this.LLJJLIIIJLLLLLLLZ) != null) {
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -1;
                layoutParams = layoutParams2;
            }
            C786410Ut5.W5(view2, layoutParams);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, OrientationChangedChannel.class, new AwS596S0100000_17(this, 167));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c7 A[Catch: Exception -> 0x02d9, TryCatch #1 {Exception -> 0x02d9, blocks: (B:122:0x0196, B:124:0x019a, B:126:0x019e, B:127:0x01a2, B:129:0x01a8, B:131:0x01b3, B:133:0x01b7, B:135:0x01bb, B:137:0x01bf, B:138:0x01c3, B:140:0x01c7, B:142:0x01cb, B:143:0x01cf, B:145:0x01d5, B:147:0x01e0, B:149:0x01e4, B:151:0x01e8, B:153:0x01ec, B:154:0x01f0, B:155:0x01f8, B:157:0x01fe, B:159:0x020b, B:161:0x020f, B:162:0x0211, B:163:0x0219, B:165:0x021f, B:167:0x022c, B:169:0x0230, B:170:0x0232, B:171:0x023a, B:173:0x0240, B:175:0x024d, B:177:0x0251, B:178:0x0253, B:179:0x025b, B:181:0x0261, B:194:0x028a, B:196:0x028e, B:197:0x0290, B:199:0x0294, B:200:0x029b, B:202:0x029f, B:203:0x02a9, B:205:0x02ad, B:206:0x02b7, B:208:0x02bb, B:209:0x02c9), top: B:222:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fe A[Catch: Exception -> 0x02d9, TryCatch #1 {Exception -> 0x02d9, blocks: (B:122:0x0196, B:124:0x019a, B:126:0x019e, B:127:0x01a2, B:129:0x01a8, B:131:0x01b3, B:133:0x01b7, B:135:0x01bb, B:137:0x01bf, B:138:0x01c3, B:140:0x01c7, B:142:0x01cb, B:143:0x01cf, B:145:0x01d5, B:147:0x01e0, B:149:0x01e4, B:151:0x01e8, B:153:0x01ec, B:154:0x01f0, B:155:0x01f8, B:157:0x01fe, B:159:0x020b, B:161:0x020f, B:162:0x0211, B:163:0x0219, B:165:0x021f, B:167:0x022c, B:169:0x0230, B:170:0x0232, B:171:0x023a, B:173:0x0240, B:175:0x024d, B:177:0x0251, B:178:0x0253, B:179:0x025b, B:181:0x0261, B:194:0x028a, B:196:0x028e, B:197:0x0290, B:199:0x0294, B:200:0x029b, B:202:0x029f, B:203:0x02a9, B:205:0x02ad, B:206:0x02b7, B:208:0x02bb, B:209:0x02c9), top: B:222:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x020f A[Catch: Exception -> 0x02d9, TryCatch #1 {Exception -> 0x02d9, blocks: (B:122:0x0196, B:124:0x019a, B:126:0x019e, B:127:0x01a2, B:129:0x01a8, B:131:0x01b3, B:133:0x01b7, B:135:0x01bb, B:137:0x01bf, B:138:0x01c3, B:140:0x01c7, B:142:0x01cb, B:143:0x01cf, B:145:0x01d5, B:147:0x01e0, B:149:0x01e4, B:151:0x01e8, B:153:0x01ec, B:154:0x01f0, B:155:0x01f8, B:157:0x01fe, B:159:0x020b, B:161:0x020f, B:162:0x0211, B:163:0x0219, B:165:0x021f, B:167:0x022c, B:169:0x0230, B:170:0x0232, B:171:0x023a, B:173:0x0240, B:175:0x024d, B:177:0x0251, B:178:0x0253, B:179:0x025b, B:181:0x0261, B:194:0x028a, B:196:0x028e, B:197:0x0290, B:199:0x0294, B:200:0x029b, B:202:0x029f, B:203:0x02a9, B:205:0x02ad, B:206:0x02b7, B:208:0x02bb, B:209:0x02c9), top: B:222:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021f A[Catch: Exception -> 0x02d9, TryCatch #1 {Exception -> 0x02d9, blocks: (B:122:0x0196, B:124:0x019a, B:126:0x019e, B:127:0x01a2, B:129:0x01a8, B:131:0x01b3, B:133:0x01b7, B:135:0x01bb, B:137:0x01bf, B:138:0x01c3, B:140:0x01c7, B:142:0x01cb, B:143:0x01cf, B:145:0x01d5, B:147:0x01e0, B:149:0x01e4, B:151:0x01e8, B:153:0x01ec, B:154:0x01f0, B:155:0x01f8, B:157:0x01fe, B:159:0x020b, B:161:0x020f, B:162:0x0211, B:163:0x0219, B:165:0x021f, B:167:0x022c, B:169:0x0230, B:170:0x0232, B:171:0x023a, B:173:0x0240, B:175:0x024d, B:177:0x0251, B:178:0x0253, B:179:0x025b, B:181:0x0261, B:194:0x028a, B:196:0x028e, B:197:0x0290, B:199:0x0294, B:200:0x029b, B:202:0x029f, B:203:0x02a9, B:205:0x02ad, B:206:0x02b7, B:208:0x02bb, B:209:0x02c9), top: B:222:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0230 A[Catch: Exception -> 0x02d9, TryCatch #1 {Exception -> 0x02d9, blocks: (B:122:0x0196, B:124:0x019a, B:126:0x019e, B:127:0x01a2, B:129:0x01a8, B:131:0x01b3, B:133:0x01b7, B:135:0x01bb, B:137:0x01bf, B:138:0x01c3, B:140:0x01c7, B:142:0x01cb, B:143:0x01cf, B:145:0x01d5, B:147:0x01e0, B:149:0x01e4, B:151:0x01e8, B:153:0x01ec, B:154:0x01f0, B:155:0x01f8, B:157:0x01fe, B:159:0x020b, B:161:0x020f, B:162:0x0211, B:163:0x0219, B:165:0x021f, B:167:0x022c, B:169:0x0230, B:170:0x0232, B:171:0x023a, B:173:0x0240, B:175:0x024d, B:177:0x0251, B:178:0x0253, B:179:0x025b, B:181:0x0261, B:194:0x028a, B:196:0x028e, B:197:0x0290, B:199:0x0294, B:200:0x029b, B:202:0x029f, B:203:0x02a9, B:205:0x02ad, B:206:0x02b7, B:208:0x02bb, B:209:0x02c9), top: B:222:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0240 A[Catch: Exception -> 0x02d9, TryCatch #1 {Exception -> 0x02d9, blocks: (B:122:0x0196, B:124:0x019a, B:126:0x019e, B:127:0x01a2, B:129:0x01a8, B:131:0x01b3, B:133:0x01b7, B:135:0x01bb, B:137:0x01bf, B:138:0x01c3, B:140:0x01c7, B:142:0x01cb, B:143:0x01cf, B:145:0x01d5, B:147:0x01e0, B:149:0x01e4, B:151:0x01e8, B:153:0x01ec, B:154:0x01f0, B:155:0x01f8, B:157:0x01fe, B:159:0x020b, B:161:0x020f, B:162:0x0211, B:163:0x0219, B:165:0x021f, B:167:0x022c, B:169:0x0230, B:170:0x0232, B:171:0x023a, B:173:0x0240, B:175:0x024d, B:177:0x0251, B:178:0x0253, B:179:0x025b, B:181:0x0261, B:194:0x028a, B:196:0x028e, B:197:0x0290, B:199:0x0294, B:200:0x029b, B:202:0x029f, B:203:0x02a9, B:205:0x02ad, B:206:0x02b7, B:208:0x02bb, B:209:0x02c9), top: B:222:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0251 A[Catch: Exception -> 0x02d9, TryCatch #1 {Exception -> 0x02d9, blocks: (B:122:0x0196, B:124:0x019a, B:126:0x019e, B:127:0x01a2, B:129:0x01a8, B:131:0x01b3, B:133:0x01b7, B:135:0x01bb, B:137:0x01bf, B:138:0x01c3, B:140:0x01c7, B:142:0x01cb, B:143:0x01cf, B:145:0x01d5, B:147:0x01e0, B:149:0x01e4, B:151:0x01e8, B:153:0x01ec, B:154:0x01f0, B:155:0x01f8, B:157:0x01fe, B:159:0x020b, B:161:0x020f, B:162:0x0211, B:163:0x0219, B:165:0x021f, B:167:0x022c, B:169:0x0230, B:170:0x0232, B:171:0x023a, B:173:0x0240, B:175:0x024d, B:177:0x0251, B:178:0x0253, B:179:0x025b, B:181:0x0261, B:194:0x028a, B:196:0x028e, B:197:0x0290, B:199:0x0294, B:200:0x029b, B:202:0x029f, B:203:0x02a9, B:205:0x02ad, B:206:0x02b7, B:208:0x02bb, B:209:0x02c9), top: B:222:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0261 A[Catch: Exception -> 0x02d9, TryCatch #1 {Exception -> 0x02d9, blocks: (B:122:0x0196, B:124:0x019a, B:126:0x019e, B:127:0x01a2, B:129:0x01a8, B:131:0x01b3, B:133:0x01b7, B:135:0x01bb, B:137:0x01bf, B:138:0x01c3, B:140:0x01c7, B:142:0x01cb, B:143:0x01cf, B:145:0x01d5, B:147:0x01e0, B:149:0x01e4, B:151:0x01e8, B:153:0x01ec, B:154:0x01f0, B:155:0x01f8, B:157:0x01fe, B:159:0x020b, B:161:0x020f, B:162:0x0211, B:163:0x0219, B:165:0x021f, B:167:0x022c, B:169:0x0230, B:170:0x0232, B:171:0x023a, B:173:0x0240, B:175:0x024d, B:177:0x0251, B:178:0x0253, B:179:0x025b, B:181:0x0261, B:194:0x028a, B:196:0x028e, B:197:0x0290, B:199:0x0294, B:200:0x029b, B:202:0x029f, B:203:0x02a9, B:205:0x02ad, B:206:0x02b7, B:208:0x02bb, B:209:0x02c9), top: B:222:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x028e A[Catch: Exception -> 0x02d9, TryCatch #1 {Exception -> 0x02d9, blocks: (B:122:0x0196, B:124:0x019a, B:126:0x019e, B:127:0x01a2, B:129:0x01a8, B:131:0x01b3, B:133:0x01b7, B:135:0x01bb, B:137:0x01bf, B:138:0x01c3, B:140:0x01c7, B:142:0x01cb, B:143:0x01cf, B:145:0x01d5, B:147:0x01e0, B:149:0x01e4, B:151:0x01e8, B:153:0x01ec, B:154:0x01f0, B:155:0x01f8, B:157:0x01fe, B:159:0x020b, B:161:0x020f, B:162:0x0211, B:163:0x0219, B:165:0x021f, B:167:0x022c, B:169:0x0230, B:170:0x0232, B:171:0x023a, B:173:0x0240, B:175:0x024d, B:177:0x0251, B:178:0x0253, B:179:0x025b, B:181:0x0261, B:194:0x028a, B:196:0x028e, B:197:0x0290, B:199:0x0294, B:200:0x029b, B:202:0x029f, B:203:0x02a9, B:205:0x02ad, B:206:0x02b7, B:208:0x02bb, B:209:0x02c9), top: B:222:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0294 A[Catch: Exception -> 0x02d9, TryCatch #1 {Exception -> 0x02d9, blocks: (B:122:0x0196, B:124:0x019a, B:126:0x019e, B:127:0x01a2, B:129:0x01a8, B:131:0x01b3, B:133:0x01b7, B:135:0x01bb, B:137:0x01bf, B:138:0x01c3, B:140:0x01c7, B:142:0x01cb, B:143:0x01cf, B:145:0x01d5, B:147:0x01e0, B:149:0x01e4, B:151:0x01e8, B:153:0x01ec, B:154:0x01f0, B:155:0x01f8, B:157:0x01fe, B:159:0x020b, B:161:0x020f, B:162:0x0211, B:163:0x0219, B:165:0x021f, B:167:0x022c, B:169:0x0230, B:170:0x0232, B:171:0x023a, B:173:0x0240, B:175:0x024d, B:177:0x0251, B:178:0x0253, B:179:0x025b, B:181:0x0261, B:194:0x028a, B:196:0x028e, B:197:0x0290, B:199:0x0294, B:200:0x029b, B:202:0x029f, B:203:0x02a9, B:205:0x02ad, B:206:0x02b7, B:208:0x02bb, B:209:0x02c9), top: B:222:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x029f A[Catch: Exception -> 0x02d9, TryCatch #1 {Exception -> 0x02d9, blocks: (B:122:0x0196, B:124:0x019a, B:126:0x019e, B:127:0x01a2, B:129:0x01a8, B:131:0x01b3, B:133:0x01b7, B:135:0x01bb, B:137:0x01bf, B:138:0x01c3, B:140:0x01c7, B:142:0x01cb, B:143:0x01cf, B:145:0x01d5, B:147:0x01e0, B:149:0x01e4, B:151:0x01e8, B:153:0x01ec, B:154:0x01f0, B:155:0x01f8, B:157:0x01fe, B:159:0x020b, B:161:0x020f, B:162:0x0211, B:163:0x0219, B:165:0x021f, B:167:0x022c, B:169:0x0230, B:170:0x0232, B:171:0x023a, B:173:0x0240, B:175:0x024d, B:177:0x0251, B:178:0x0253, B:179:0x025b, B:181:0x0261, B:194:0x028a, B:196:0x028e, B:197:0x0290, B:199:0x0294, B:200:0x029b, B:202:0x029f, B:203:0x02a9, B:205:0x02ad, B:206:0x02b7, B:208:0x02bb, B:209:0x02c9), top: B:222:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02ad A[Catch: Exception -> 0x02d9, TryCatch #1 {Exception -> 0x02d9, blocks: (B:122:0x0196, B:124:0x019a, B:126:0x019e, B:127:0x01a2, B:129:0x01a8, B:131:0x01b3, B:133:0x01b7, B:135:0x01bb, B:137:0x01bf, B:138:0x01c3, B:140:0x01c7, B:142:0x01cb, B:143:0x01cf, B:145:0x01d5, B:147:0x01e0, B:149:0x01e4, B:151:0x01e8, B:153:0x01ec, B:154:0x01f0, B:155:0x01f8, B:157:0x01fe, B:159:0x020b, B:161:0x020f, B:162:0x0211, B:163:0x0219, B:165:0x021f, B:167:0x022c, B:169:0x0230, B:170:0x0232, B:171:0x023a, B:173:0x0240, B:175:0x024d, B:177:0x0251, B:178:0x0253, B:179:0x025b, B:181:0x0261, B:194:0x028a, B:196:0x028e, B:197:0x0290, B:199:0x0294, B:200:0x029b, B:202:0x029f, B:203:0x02a9, B:205:0x02ad, B:206:0x02b7, B:208:0x02bb, B:209:0x02c9), top: B:222:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02bb A[Catch: Exception -> 0x02d9, TryCatch #1 {Exception -> 0x02d9, blocks: (B:122:0x0196, B:124:0x019a, B:126:0x019e, B:127:0x01a2, B:129:0x01a8, B:131:0x01b3, B:133:0x01b7, B:135:0x01bb, B:137:0x01bf, B:138:0x01c3, B:140:0x01c7, B:142:0x01cb, B:143:0x01cf, B:145:0x01d5, B:147:0x01e0, B:149:0x01e4, B:151:0x01e8, B:153:0x01ec, B:154:0x01f0, B:155:0x01f8, B:157:0x01fe, B:159:0x020b, B:161:0x020f, B:162:0x0211, B:163:0x0219, B:165:0x021f, B:167:0x022c, B:169:0x0230, B:170:0x0232, B:171:0x023a, B:173:0x0240, B:175:0x024d, B:177:0x0251, B:178:0x0253, B:179:0x025b, B:181:0x0261, B:194:0x028a, B:196:0x028e, B:197:0x0290, B:199:0x0294, B:200:0x029b, B:202:0x029f, B:203:0x02a9, B:205:0x02ad, B:206:0x02b7, B:208:0x02bb, B:209:0x02c9), top: B:222:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x026f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x028a A[EDGE_INSN: B:256:0x028a->B:194:0x028a BREAK  A[LOOP:6: B:179:0x025b->B:258:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void VR(java.util.List<tikcast.api.star_comment.StarCommentItem> r19, tikcast.api.star_comment.StarCommentPurchasePageResponse.Data r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog.VR(java.util.List, tikcast.api.star_comment.StarCommentPurchasePageResponse$Data, boolean):void");
    }
}
