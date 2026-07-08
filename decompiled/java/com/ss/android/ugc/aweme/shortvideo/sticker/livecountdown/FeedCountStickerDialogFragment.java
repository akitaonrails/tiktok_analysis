package com.ss.android.ugc.aweme.shortvideo.sticker.livecountdown;

import X.AbstractC19643411tI;
import X.AbstractC453920Hr4;
import X.C098200Yq;
import X.C0XQ7;
import X.C11NJ;
import X.C11S5;
import X.C11VU;
import X.C1308910kAL;
import X.C1440005kM;
import X.C14MI;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C1843500y4a;
import X.C189200o6;
import X.C1954807lC;
import X.C19643511tJ;
import X.C19643611tK;
import X.C19643711tL;
import X.C19643811tM;
import X.C19643911tN;
import X.C19644011tO;
import X.C19644111tP;
import X.C197039127h;
import X.C19775112Yr;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C453930Hr5;
import X.C453940Hr6;
import X.C786410Ut5;
import X.C960203pA;
import X.DialogC1389620mGW;
import X.EnumC836470Wrd;
import X.InterfaceC19643311tH;
import Y.ACListenerS148S0100000_13;
import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class FeedCountStickerDialogFragment extends BottomSheetDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiwoLCB9OzElKiQ2OmsgHELIOSIDk2Kyo5Jzs3JzIiZwk2LSEPJjo9PBY4ICw4LTcIIC4/JyIKOy40JSAiPQ==";
    public CountDownStickerStruct LL;
    public Aweme LLILLJJLI;
    public LinearLayout LLILLL;
    public C197039127h LLILZ;
    public C197039127h LLILZIL;
    public TuxTextView LLILZLL;
    public AbstractC19643411tI LLIZ = C19644011tO.LIZ;
    public final InterfaceC19643311tH LLIZLLLIL;
    public C11NJ LLJ;
    public DialogC1389620mGW LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;

    public final void OR() {
        LinearLayout linearLayout = this.LLILLL;
        if (linearLayout == null) {
            return;
        }
        C786410Ut5.LJJZZI(linearLayout, 1, linearLayout.getChildCount() - 1);
        CountDownStickerStruct countDownStickerStruct = this.LL;
        linearLayout.addView(NR(linearLayout, countDownStickerStruct != null ? countDownStickerStruct.getTitle() : null, 22, 20.0f, R.attr.a1h));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        CountDownStickerStruct countDownStickerStruct2 = this.LL;
        sbLIZ.append(countDownStickerStruct2 != null ? countDownStickerStruct2.getTextAlreadyExpired() : null);
        sbLIZ.append('\n');
        CountDownStickerStruct countDownStickerStruct3 = this.LL;
        sbLIZ.append(SR(countDownStickerStruct3 != null ? Long.valueOf(countDownStickerStruct3.getMillSecond()) : null));
        linearLayout.addView(NR(linearLayout, C2188811AlT.LIZIZ(sbLIZ), 41, 12.0f, R.attr.a1j));
        String string = linearLayout.getResources().getString(2131829565);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, linearLayout.getContext());
        C197039127h c197039127hMR = MR(linearLayout, string, numLIZJ != null ? numLIZJ.intValue() : 0, C14MI.LIZ(linearLayout.getContext(), R.drawable.alq));
        this.LLILZ = c197039127hMR;
        C786410Ut5.U8(c197039127hMR, new ACListenerS163S0100000_29(this, 82));
        linearLayout.addView(this.LLILZ);
    }

    public final void PR() {
        LinearLayout linearLayout = this.LLILLL;
        if (linearLayout == null) {
            return;
        }
        C786410Ut5.LJJZZI(linearLayout, 1, linearLayout.getChildCount() - 1);
        CountDownStickerStruct countDownStickerStruct = this.LL;
        linearLayout.addView(NR(linearLayout, countDownStickerStruct != null ? countDownStickerStruct.getTitle() : null, 22, 20.0f, R.attr.a1h));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        CountDownStickerStruct countDownStickerStruct2 = this.LL;
        sbLIZ.append(countDownStickerStruct2 != null ? countDownStickerStruct2.getTextAlreadyExpired() : null);
        sbLIZ.append('\n');
        CountDownStickerStruct countDownStickerStruct3 = this.LL;
        sbLIZ.append(SR(countDownStickerStruct3 != null ? Long.valueOf(countDownStickerStruct3.getMillSecond()) : null));
        linearLayout.addView(NR(linearLayout, C2188811AlT.LIZIZ(sbLIZ), 41, 12.0f, R.attr.a1j));
        CountDownStickerStruct countDownStickerStruct4 = this.LL;
        String strLIZIZ = C1843500y4a.LIZIZ(countDownStickerStruct4 != null ? countDownStickerStruct4.getSubscribeNum() : 0L);
        Resources resources = linearLayout.getResources();
        CountDownStickerStruct countDownStickerStruct5 = this.LL;
        String quantityString = resources.getQuantityString(2131755170, countDownStickerStruct5 != null ? (int) countDownStickerStruct5.getSubscribeNum() : 0);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("<b>");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("</b>");
        String strJ4 = C786410Ut5.j4(quantityString, Arrays.copyOf(new Object[]{C2188811AlT.LIZIZ(sbLIZ2)}, 1));
        strLIZIZ.getClass();
        TuxTextView tuxTextViewNR = NR(linearLayout, strJ4, 41, 32.0f, R.attr.a1j);
        this.LLILZLL = tuxTextViewNR;
        linearLayout.addView(tuxTextViewNR);
        C197039127h c197039127hMR = MR(linearLayout, linearLayout.getResources().getString(2131829565), C960203pA.LIZ(R.attr.a1h, linearLayout.getContext()), C14MI.LIZ(linearLayout.getContext(), R.drawable.alq));
        this.LLILZ = c197039127hMR;
        C786410Ut5.U8(c197039127hMR, new ACListenerS163S0100000_29(this, 83));
        linearLayout.addView(this.LLILZ);
    }

    public FeedCountStickerDialogFragment() {
        InterfaceC19643311tH.LIZ.getClass();
        this.LLIZLLLIL = (InterfaceC19643311tH) C19643511tJ.LIZIZ.LIZ(Api.LIZ).create(InterfaceC19643311tH.class);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        if (this.LLJ == null) {
            this.LLJ = new C11NJ();
        }
        C11NJ c11nj = this.LLJ;
        if (c11nj != null) {
            c11nj.dispose();
        }
        this.LLJ = null;
    }

    public final String SR(Long l) {
        if (l == null) {
            return "";
        }
        return DateUtils.formatDateTime(getContext(), l.longValue(), 87);
    }

    public final long UR(CountDownStickerStruct countDownStickerStruct) {
        long millSecond = 0;
        if (countDownStickerStruct != null && countDownStickerStruct.getMillSecond() - System.currentTimeMillis() > 0) {
            if (countDownStickerStruct != null) {
                millSecond = countDownStickerStruct.getMillSecond() - System.currentTimeMillis();
            }
            return millSecond / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        return -1L;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        String authorUid;
        Serializable serializable;
        CountDownStickerStruct countDownStickerStruct;
        AbstractC19643411tI abstractC19643411tI;
        String string3;
        Serializable serializable2;
        Aweme aweme;
        super.onCreate(bundle);
        setStyle(0, R.style.adu);
        String authorUid2 = null;
        if (this.LLILLJJLI == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable2 = arguments.getSerializable("countdown_sticker_aweme");
            } else {
                serializable2 = null;
            }
            if (serializable2 instanceof Aweme) {
                aweme = (Aweme) serializable2;
            } else {
                aweme = null;
            }
            this.LLILLJJLI = aweme;
        }
        Bundle arguments2 = getArguments();
        String str = "";
        if (arguments2 == null || (string = arguments2.getString("group_id")) == null) {
            string = "";
        }
        this.LLJIJIL = string;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string2 = arguments3.getString("author_id")) == null) {
            string2 = "";
        }
        this.LLJILJIL = string2;
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (string3 = arguments4.getString("enter_from")) != null) {
            str = string3;
        }
        this.LLJILJILJ = str;
        String curUserId = C0XQ7.LJFF().getCurUserId();
        Aweme aweme2 = this.LLILLJJLI;
        if (aweme2 != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme2);
        } else {
            authorUid = null;
        }
        this.LLJILLL = TextUtils.equals(curUserId, authorUid);
        if (this.LL == null) {
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                serializable = arguments5.getSerializable("countdown_sticker_data");
            } else {
                serializable = null;
            }
            if (serializable instanceof CountDownStickerStruct) {
                countDownStickerStruct = (CountDownStickerStruct) serializable;
            } else {
                countDownStickerStruct = null;
            }
            this.LL = countDownStickerStruct;
            String curUserId2 = C0XQ7.LJFF().getCurUserId();
            Aweme aweme3 = this.LLILLJJLI;
            if (aweme3 != null) {
                authorUid2 = AwemeExtKt.getAuthorUid(aweme3);
            }
            long millSecond = 0;
            if (TextUtils.equals(curUserId2, authorUid2)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                CountDownStickerStruct countDownStickerStruct2 = this.LL;
                if (countDownStickerStruct2 != null) {
                    millSecond = countDownStickerStruct2.getMillSecond();
                }
                if (jCurrentTimeMillis > millSecond) {
                    abstractC19643411tI = C19643911tN.LIZ;
                } else {
                    abstractC19643411tI = C19644011tO.LIZ;
                }
            } else {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                CountDownStickerStruct countDownStickerStruct3 = this.LL;
                if (countDownStickerStruct3 != null) {
                    millSecond = countDownStickerStruct3.getMillSecond();
                }
                if (jCurrentTimeMillis2 > millSecond) {
                    abstractC19643411tI = C19643611tK.LIZ;
                } else {
                    CountDownStickerStruct countDownStickerStruct4 = this.LL;
                    if (countDownStickerStruct4 != null && Intrinsics.LJFF(countDownStickerStruct4.getSubscribe(), Boolean.TRUE)) {
                        abstractC19643411tI = C19643811tM.LIZ;
                    } else {
                        abstractC19643411tI = C19643711tL.LIZ;
                    }
                }
            }
            this.LLIZ = abstractC19643411tI;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C1440005kM.LIZ(new C453940Hr6(false, false, (AbstractC453920Hr4) C453930Hr5.LIZ));
    }

    public final void RR(AbstractC19643411tI abstractC19643411tI, boolean z) {
        String title;
        long subscribeNum;
        int subscribeNum2;
        String title2;
        Long lValueOf;
        String title3;
        Long lValueOf2;
        if (Intrinsics.LJFF(this.LLIZ, abstractC19643411tI) && !z) {
            return;
        }
        this.LLIZ = abstractC19643411tI;
        if (Intrinsics.LJFF(abstractC19643411tI, C19643611tK.LIZ)) {
            OR();
            return;
        }
        int iIntValue = 0;
        Long lValueOf3 = null;
        String textTobeSubscribed = null;
        String textAlreadySubscribed = null;
        if (Intrinsics.LJFF(abstractC19643411tI, C19643711tL.LIZ)) {
            LinearLayout linearLayout = this.LLILLL;
            if (linearLayout == null) {
                return;
            }
            C786410Ut5.LJJZZI(linearLayout, 1, linearLayout.getChildCount() - 1);
            CountDownStickerStruct countDownStickerStruct = this.LL;
            if (countDownStickerStruct != null) {
                title3 = countDownStickerStruct.getTitle();
            } else {
                title3 = null;
            }
            linearLayout.addView(NR(linearLayout, title3, 22, 20.0f, R.attr.a1h));
            CountDownStickerStruct countDownStickerStruct2 = this.LL;
            if (countDownStickerStruct2 != null) {
                lValueOf2 = Long.valueOf(countDownStickerStruct2.getMillSecond());
            } else {
                lValueOf2 = null;
            }
            linearLayout.addView(NR(linearLayout, SR(lValueOf2), 41, 12.0f, R.attr.a1j));
            CountDownStickerStruct countDownStickerStruct3 = this.LL;
            if (countDownStickerStruct3 != null) {
                textTobeSubscribed = countDownStickerStruct3.getTextTobeSubscribed();
            }
            linearLayout.addView(NR(linearLayout, textTobeSubscribed, 41, 12.0f, R.attr.a1j));
            String string = linearLayout.getResources().getString(2131829588);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, linearLayout.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            C197039127h c197039127hMR = MR(linearLayout, string, iIntValue, C14MI.LIZ(linearLayout.getContext(), R.drawable.alp));
            this.LLILZIL = c197039127hMR;
            C786410Ut5.U8(c197039127hMR, new ACListenerS148S0100000_13(this, 0));
            linearLayout.addView(this.LLILZIL);
            return;
        }
        if (Intrinsics.LJFF(abstractC19643411tI, C19643811tM.LIZ)) {
            LinearLayout linearLayout2 = this.LLILLL;
            if (linearLayout2 == null) {
                return;
            }
            C786410Ut5.LJJZZI(linearLayout2, 1, linearLayout2.getChildCount() - 1);
            CountDownStickerStruct countDownStickerStruct4 = this.LL;
            if (countDownStickerStruct4 != null) {
                title2 = countDownStickerStruct4.getTitle();
            } else {
                title2 = null;
            }
            linearLayout2.addView(NR(linearLayout2, title2, 22, 20.0f, R.attr.a1h));
            CountDownStickerStruct countDownStickerStruct5 = this.LL;
            if (countDownStickerStruct5 != null) {
                lValueOf = Long.valueOf(countDownStickerStruct5.getMillSecond());
            } else {
                lValueOf = null;
            }
            linearLayout2.addView(NR(linearLayout2, SR(lValueOf), 41, 12.0f, R.attr.a1j));
            CountDownStickerStruct countDownStickerStruct6 = this.LL;
            if (countDownStickerStruct6 != null) {
                textAlreadySubscribed = countDownStickerStruct6.getTextAlreadySubscribed();
            }
            linearLayout2.addView(NR(linearLayout2, textAlreadySubscribed, 41, 12.0f, R.attr.a1j));
            String string2 = linearLayout2.getResources().getString(2131829572);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ub, linearLayout2.getContext());
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            }
            C197039127h c197039127hMR2 = MR(linearLayout2, string2, iIntValue, C14MI.LIZ(linearLayout2.getContext(), R.drawable.alq));
            this.LLILZIL = c197039127hMR2;
            C786410Ut5.U8(c197039127hMR2, new ACListenerS148S0100000_13(this, 1));
            linearLayout2.addView(this.LLILZIL);
            return;
        }
        if (Intrinsics.LJFF(abstractC19643411tI, C19643911tN.LIZ)) {
            PR();
            return;
        }
        if (Intrinsics.LJFF(abstractC19643411tI, C19644011tO.LIZ)) {
            LinearLayout linearLayout3 = this.LLILLL;
            if (linearLayout3 == null) {
                return;
            }
            C786410Ut5.LJJZZI(linearLayout3, 1, linearLayout3.getChildCount() - 1);
            CountDownStickerStruct countDownStickerStruct7 = this.LL;
            if (countDownStickerStruct7 != null) {
                title = countDownStickerStruct7.getTitle();
            } else {
                title = null;
            }
            linearLayout3.addView(NR(linearLayout3, title, 22, 20.0f, R.attr.a1h));
            CountDownStickerStruct countDownStickerStruct8 = this.LL;
            if (countDownStickerStruct8 != null) {
                lValueOf3 = Long.valueOf(countDownStickerStruct8.getMillSecond());
            }
            linearLayout3.addView(NR(linearLayout3, SR(lValueOf3), 41, 12.0f, R.attr.a1j));
            CountDownStickerStruct countDownStickerStruct9 = this.LL;
            if (countDownStickerStruct9 != null) {
                subscribeNum = countDownStickerStruct9.getSubscribeNum();
            } else {
                subscribeNum = 0;
            }
            String strLIZIZ = C1843500y4a.LIZIZ(subscribeNum);
            Resources resources = linearLayout3.getResources();
            CountDownStickerStruct countDownStickerStruct10 = this.LL;
            if (countDownStickerStruct10 != null) {
                subscribeNum2 = (int) countDownStickerStruct10.getSubscribeNum();
            } else {
                subscribeNum2 = 0;
            }
            String quantityString = resources.getQuantityString(2131755215, subscribeNum2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("<b>");
            sbLIZ.append(strLIZIZ);
            sbLIZ.append("</b>");
            String strJ4 = C786410Ut5.j4(quantityString, Arrays.copyOf(new Object[]{C2188811AlT.LIZIZ(sbLIZ)}, 1));
            strLIZIZ.getClass();
            TuxTextView tuxTextViewNR = NR(linearLayout3, strJ4, 41, 32.0f, R.attr.a1j);
            this.LLILZLL = tuxTextViewNR;
            linearLayout3.addView(tuxTextViewNR);
            String string3 = linearLayout3.getResources().getString(2131829565);
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, linearLayout3.getContext());
            if (numLIZJ3 != null) {
                iIntValue = numLIZJ3.intValue();
            }
            C197039127h c197039127hMR3 = MR(linearLayout3, string3, iIntValue, C14MI.LIZ(linearLayout3.getContext(), R.drawable.alq));
            this.LLILZ = c197039127hMR3;
            C786410Ut5.U8(c197039127hMR3, new ACListenerS163S0100000_29(this, 0));
            linearLayout3.addView(this.LLILZ);
            return;
        }
        if (Intrinsics.LJFF(abstractC19643411tI, C19644111tP.LIZ)) {
            if (this.LLJILLL) {
                PR();
                return;
            } else {
                OR();
                return;
            }
        }
        throw new C1954807lC();
    }

    public final void VR(Long l, String str) {
        long jLongValue;
        int iOrdinal;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC19643411tI abstractC19643411tI = this.LLIZ;
        C19643711tL c19643711tL = C19643711tL.LIZ;
        String str2 = null;
        if (Intrinsics.LJFF(abstractC19643411tI, c19643711tL)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            String str3 = this.LLJIJIL;
            if (str3 == null) {
                str3 = null;
            }
            c2344009Gk.LJIIIIZZ("group_id", str3);
            String str4 = this.LLJILJIL;
            if (str4 == null) {
                str4 = null;
            }
            c2344009Gk.LJIIIIZZ("author_id", str4);
            String str5 = this.LLJILJILJ;
            if (str5 != null) {
                str2 = str5;
            }
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            c2344009Gk.LIZLLL(UR(this.LL), "countdown_time");
            c2344009Gk.LJIIIIZZ("enter_method", "live_cd_sticker");
            C20684815ws.LJIILLIIL("livesdk_live_subscirbe", c2344009Gk.LIZ);
        } else if (Intrinsics.LJFF(this.LLIZ, C19643811tM.LIZ)) {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            String str6 = this.LLJIJIL;
            if (str6 == null) {
                str6 = null;
            }
            c2344009Gk2.LJIIIIZZ("group_id", str6);
            String str7 = this.LLJILJIL;
            if (str7 == null) {
                str7 = null;
            }
            c2344009Gk2.LJIIIIZZ("author_id", str7);
            String str8 = this.LLJILJILJ;
            if (str8 != null) {
                str2 = str8;
            }
            c2344009Gk2.LJIIIIZZ("enter_from", str2);
            c2344009Gk2.LIZLLL(UR(this.LL), "countdown_time");
            c2344009Gk2.LJIIIIZZ("enter_method", "live_cd_sticker");
            C20684815ws.LJIILLIIL("livesdk_live_unsubscirbe", c2344009Gk2.LIZ);
        }
        InterfaceC19643311tH interfaceC19643311tH = this.LLIZLLLIL;
        if (str == null) {
            str = "";
        }
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long j = jLongValue / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (Intrinsics.LJFF(this.LLIZ, c19643711tL)) {
            iOrdinal = EnumC836470Wrd.Subscribe.ordinal();
        } else {
            iOrdinal = EnumC836470Wrd.CancelSubscribe.ordinal();
        }
        interfaceC19643311tH.LIZIZ(str, j, iOrdinal).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19775112Yr(this, 1));
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void showNow(FragmentManager fragmentManager, String str) {
        long millSecond;
        String aid;
        super.showNow(fragmentManager, str);
        C1440005kM.LIZ(new C453940Hr6(true, false, (AbstractC453920Hr4) C453930Hr5.LIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        CountDownStickerStruct countDownStickerStruct = this.LL;
        if (countDownStickerStruct != null) {
            millSecond = countDownStickerStruct.getMillSecond();
        } else {
            millSecond = 0;
        }
        if (jCurrentTimeMillis > millSecond) {
            RR(C19644111tP.LIZ, false);
        }
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            this.LLIZLLLIL.LIZ(aid).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19775112Yr(this, 0));
        }
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) C786410Ut5.Td(layoutInflater, R.layout.c8a, viewGroup, false);
        this.LLILLL = linearLayout;
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.e1g);
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new ACListenerS163S0100000_29(this, 84));
        }
        RR(this.LLIZ, true);
        LinearLayout linearLayout2 = this.LLILLL;
        C19GS c19gs = null;
        if (!(linearLayout2 instanceof View)) {
            linearLayout2 = null;
        }
        if (linearLayout2 != null) {
            try {
                ViewTreeLifecycleOwner.set(linearLayout2, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(linearLayout2, this);
                linearLayout2.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return linearLayout2;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return linearLayout2;
    }

    public static C197039127h MR(LinearLayout linearLayout, String str, int i, Drawable drawable) {
        C197039127h c197039127h = new C197039127h(linearLayout.getContext(), null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        c197039127h.setText(str);
        c197039127h.setTextColor(i);
        c197039127h.setBackground(drawable);
        c197039127h.setTextSize(15.0f);
        c197039127h.setStateListAnimator(null);
        Context context = linearLayout.getContext();
        if (context != null) {
            layoutParams.topMargin = (int) C11VU.LIZIZ(36.0f, context);
            layoutParams.bottomMargin = (int) C11VU.LIZIZ(46.0f, context);
            layoutParams.leftMargin = (int) C11VU.LIZIZ(16.0f, context);
            layoutParams.rightMargin = (int) C11VU.LIZIZ(16.0f, context);
            C786410Ut5.J6(c197039127h, layoutParams);
        }
        return c197039127h;
    }

    public static TuxTextView NR(LinearLayout linearLayout, String str, int i, float f, int i2) {
        int iIntValue = 0;
        TuxTextView tuxTextView = new TuxTextView(linearLayout.getContext(), null, 6, iIntValue);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        tuxTextView.setText(Html.fromHtml(str));
        Integer numLIZJ = C1308910kAL.LIZJ(i2, linearLayout.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        tuxTextView.setTextColor(iIntValue);
        tuxTextView.setTuxFont(i);
        Context context = linearLayout.getContext();
        if (context != null) {
            layoutParams.topMargin = (int) C11VU.LIZIZ(f, context);
            layoutParams.bottomMargin = (int) C11VU.LIZIZ(0.0f, context);
            layoutParams.setMarginStart((int) C11VU.LIZIZ(24.0f, context));
            layoutParams.setMarginEnd((int) C11VU.LIZIZ(24.0f, context));
            C786410Ut5.R6(tuxTextView, layoutParams);
        }
        tuxTextView.setGravity(17);
        return tuxTextView;
    }
}
