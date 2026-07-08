package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.badge;

import X.C1115150f7p;
import X.C1145100fu8;
import X.C1602160rnK;
import X.C16F5;
import X.C1888560zFG;
import X.C1888580zFI;
import X.C1888600zFK;
import X.C1888630zFN;
import X.C19YU;
import X.C389001fE;
import X.C497740JfY;
import X.C500980Jkm;
import X.C786410Ut5;
import X.C823050WQl;
import X.EnumC1783080wV8;
import X.InterfaceC1888610zFL;
import X.InterfaceC19323110ij;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.base.model.emoji.BadgeIcon;
import com.bytedance.android.live.base.model.emoji.BadgeIconTab;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.api.subscription.api.emoji.ILiveSubscribeEmojiInputDialog;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.badge.LiveSubscribeEmojiInputDialog;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveSubscribeEmojiInputDialog extends ILiveSubscribeEmojiInputDialog implements InterfaceC19323110ij, InterfaceC1888610zFL {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2HELIOSExPTYlJyogO2s8LD04O2suKCs0LWsAIDk2GzAuOiwhIScpDCI8IiwFJz8mPAElKCM8Lw==";
    public MeasureLinearLayout LL;
    public C1888580zFI LLILLL;
    public InterfaceC1888610zFL LLILZIL;
    public C1888600zFK LLILZLL;
    public boolean LLIZ;
    public Map<String, ? extends Object> LLIZLLLIL;
    public boolean LLJ;
    public long LLJI;
    public EnumC1783080wV8 LLILLJJLI = EnumC1783080wV8.PANEL;
    public final C1888630zFN LLILZ = new C1888630zFN(this);

    @Override // com.bytedance.android.livesdk.comp.api.subscription.api.emoji.ILiveSubscribeEmojiInputDialog
    public final void NR() {
        this.LLIZ = true;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.api.emoji.ILiveSubscribeEmojiInputDialog
    public final void MR() {
        EditText editText;
        MeasureLinearLayout measureLinearLayout = this.LL;
        if (measureLinearLayout != null) {
            C786410Ut5.LLJILLL(measureLinearLayout, 8);
        }
        this.LLILLJJLI = EnumC1783080wV8.CLOSE;
        View view = getView();
        if (view != null && (editText = (EditText) view.findViewById(R.id.krn)) != null) {
            KeyBoardUtil.LIZJ(getContext(), editText);
        }
        try {
            dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1888610zFL
    public final void bn() {
        InterfaceC1888610zFL interfaceC1888610zFL = this.LLILZIL;
        if (interfaceC1888610zFL != null) {
            interfaceC1888610zFL.bn();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gjk);
        c500980Jkm.LIZJ = R.style.akk;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // X.InterfaceC1888610zFL
    public final void fa() {
        InterfaceC1888610zFL interfaceC1888610zFL = this.LLILZIL;
        if (interfaceC1888610zFL != null) {
            interfaceC1888610zFL.fa();
        }
    }

    public final void SR() {
        final C1888600zFK c1888600zFK;
        if (getView() == null || (c1888600zFK = this.LLILZLL) == null) {
            return;
        }
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new Runnable() { // from class: X.0zFH
                public final void LIZ() {
                    C1888650zFP c1888650zFPLJIIJ;
                    TextView textView;
                    C1888580zFI c1888580zFI = this.LL.LLILLL;
                    if (c1888580zFI != null) {
                        List<BadgeIconTab> list = c1888600zFK.LIZ;
                        if (!Intrinsics.LJFF(c1888580zFI.LIZIZ, list)) {
                            ((ArrayList) c1888580zFI.LIZIZ).clear();
                            ((ArrayList) c1888580zFI.LIZIZ).addAll(list);
                            c1888580zFI.LIZ.LJIIL();
                            int i = 0;
                            for (Object obj : (ArrayList) c1888580zFI.LIZIZ) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                                BadgeIconTab badgeIconTab = (BadgeIconTab) obj;
                                if (badgeIconTab.tabPreview.iconType == 2) {
                                    c1888650zFPLJIIJ = c1888580zFI.LIZ.LJIIJ();
                                    c1888650zFPLJIIJ.LJFF = false;
                                    c1888650zFPLJIIJ.LIZIZ(R.layout.h53);
                                    C1324610kZf url = C1819620xS4.LIZ().setUrl(badgeIconTab.tabPreview.iconUrl);
                                    View view2 = c1888650zFPLJIIJ.LJ;
                                    url.LJJI(view2 != null ? view2.findViewById(R.id.lkw) : null);
                                    c1888650zFPLJIIJ.LIZ = badgeIconTab;
                                } else {
                                    c1888650zFPLJIIJ = c1888580zFI.LIZ.LJIIJ();
                                    c1888650zFPLJIIJ.LJFF = false;
                                    c1888650zFPLJIIJ.LIZIZ(R.layout.h51);
                                    View view3 = c1888650zFPLJIIJ.LJ;
                                    if (view3 != null && (textView = (TextView) view3.findViewById(R.id.unicode_emoji)) != null) {
                                        textView.setText(badgeIconTab.tabPreview.iconStr);
                                    }
                                    c1888650zFPLJIIJ.LIZ = badgeIconTab;
                                }
                                if (i == c1888580zFI.LIZJ) {
                                    C19YU c19yu = c1888580zFI.LIZ;
                                    c1888580zFI.LIZ(c1888650zFPLJIIJ);
                                    c19yu.LIZJ(c1888650zFPLJIIJ, i, true);
                                } else {
                                    C19YU c19yu2 = c1888580zFI.LIZ;
                                    View view4 = c1888650zFPLJIIJ.LJ;
                                    if (view4 != null) {
                                        view4.setBackground(null);
                                    }
                                    c19yu2.LIZJ(c1888650zFPLJIIJ, i, false);
                                }
                                i = i2;
                            }
                        }
                    }
                    C1888580zFI c1888580zFI2 = this.LL.LLILLL;
                    if (c1888580zFI2 != null) {
                        c1888580zFI2.LIZJ = 0;
                        C1888650zFP c1888650zFPLJIIIZ = c1888580zFI2.LIZ.LJIIIZ(0);
                        if (c1888650zFPLJIIIZ != null) {
                            c1888650zFPLJIIIZ.LIZ(false);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveSubscribeEmojiInputDialog@90c4.loadEmojiWhenViewCreated$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveSubscribeEmojiInputDialog@90c4.loadEmojiWhenViewCreated$1");
                }
            });
        }
        View view2 = getView();
        if (view2 != null) {
            HandlerHook.viewPost(view2, new Runnable() { // from class: X.0zFM
                public final void LIZ() {
                    ViewPager viewPager;
                    C1888630zFN c1888630zFN = this.LL.LLILZ;
                    List<BadgeIconTab> list = c1888600zFK.LIZ;
                    ((ArrayList) c1888630zFN.LLILLL).clear();
                    ((ArrayList) c1888630zFN.LLILLL).addAll(list);
                    c1888630zFN.notifyDataSetChanged();
                    View view3 = this.LL.getView();
                    if (view3 == null || (viewPager = (ViewPager) view3.findViewById(R.id.h0t)) == null) {
                        return;
                    }
                    viewPager.setCurrentItem(0);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveSubscribeEmojiInputDialog@90c4.loadEmojiWhenViewCreated$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveSubscribeEmojiInputDialog@90c4.loadEmojiWhenViewCreated$2");
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        super.dismiss();
        C389001fE.LIZ("subscription_badge_keyboard_close_success", null, System.currentTimeMillis(), false);
    }

    @Override // X.InterfaceC1888760zFa
    public final void Ba(C1888600zFK c1888600zFK) {
        this.LLILZLL = c1888600zFK;
        SR();
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.api.emoji.ILiveSubscribeEmojiInputDialog
    public final void OR(C1888560zFG c1888560zFG) {
        this.LLILZIL = c1888560zFG;
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.api.emoji.ILiveSubscribeEmojiInputDialog
    public final void PR(Map<String, ? extends Object> map) {
        this.LLIZLLLIL = map;
        C1888580zFI c1888580zFI = this.LLILLL;
        if (c1888580zFI != null) {
            c1888580zFI.LIZLLL = map;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void onDialogCreated(Dialog dialog) {
        super.onDialogCreated(dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(19);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.addFlags(32);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.api.emoji.ILiveSubscribeEmojiInputDialog
    public final void RR(long j, boolean z) {
        this.LLJ = z;
        this.LLJI = j;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        TextView textView;
        Window window;
        super.onViewCreated(view, bundle);
        MeasureLinearLayout measureLinearLayout = (MeasureLinearLayout) view.findViewById(R.id.eqx);
        this.LL = measureLinearLayout;
        if (measureLinearLayout != null) {
            measureLinearLayout.setWindowInsetsEnable(true);
        }
        MeasureLinearLayout measureLinearLayout2 = this.LL;
        if (measureLinearLayout2 != null) {
            measureLinearLayout2.setWindowInsetsKeyboardObserver(this);
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            C1145100fu8.LIZ(window);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(-1);
        }
        C19YU c19yu = (C19YU) view.findViewById(R.id.wxk);
        view.findViewById(R.id.h0t);
        C1888580zFI c1888580zFI = new C1888580zFI(c19yu, this);
        this.LLILLL = c1888580zFI;
        Map<String, ? extends Object> map = this.LLIZLLLIL;
        if (map != null) {
            c1888580zFI.LIZLLL = map;
        }
        ((C19YU) view.findViewById(R.id.wxk)).LJIILLIIL((ViewPager) view.findViewById(R.id.h0t), false, false);
        ((ViewPager) view.findViewById(R.id.h0t)).setAdapter(this.LLILZ);
        ((ViewPager) view.findViewById(R.id.h0t)).setOffscreenPageLimit(3);
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.ks7), new View.OnClickListener() { // from class: X.0x05
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LiveIconView liveIconView;
                View viewFindViewById;
                View viewFindViewById2;
                LiveIconView liveIconView2;
                View viewFindViewById3;
                final LiveSubscribeEmojiInputDialog liveSubscribeEmojiInputDialog = this.LL;
                EnumC1783080wV8 enumC1783080wV8 = liveSubscribeEmojiInputDialog.LLILLJJLI;
                EnumC1783080wV8 enumC1783080wV82 = EnumC1783080wV8.PANEL;
                View viewFindViewById4 = null;
                if (enumC1783080wV8 == enumC1783080wV82) {
                    liveSubscribeEmojiInputDialog.LLILLJJLI = EnumC1783080wV8.KEYBOARD;
                    View view3 = liveSubscribeEmojiInputDialog.getView();
                    if (view3 != null) {
                        viewFindViewById4 = view3.findViewById(R.id.wxk);
                    }
                    if (viewFindViewById4 != null) {
                        int visibility = viewFindViewById4.getVisibility();
                        viewFindViewById4.setVisibility(8);
                        C1602160rnK.LIZIZ(visibility, 8, viewFindViewById4);
                    }
                    View view4 = liveSubscribeEmojiInputDialog.getView();
                    if (view4 != null && (viewFindViewById3 = view4.findViewById(R.id.wxg)) != null) {
                        C786410Ut5.LJLLLLLL(8, viewFindViewById3);
                    }
                    View view5 = liveSubscribeEmojiInputDialog.getView();
                    if (view5 != null && (liveIconView2 = (LiveIconView) view5.findViewById(R.id.ks7)) != null) {
                        liveIconView2.setIcon(R.drawable.eug);
                    }
                } else {
                    liveSubscribeEmojiInputDialog.LLILLJJLI = enumC1783080wV82;
                    View view6 = liveSubscribeEmojiInputDialog.getView();
                    if (view6 != null) {
                        viewFindViewById4 = view6.findViewById(R.id.wxk);
                    }
                    if (viewFindViewById4 != null) {
                        int visibility2 = viewFindViewById4.getVisibility();
                        viewFindViewById4.setVisibility(0);
                        C1602160rnK.LIZIZ(visibility2, 0, viewFindViewById4);
                    }
                    View view7 = liveSubscribeEmojiInputDialog.getView();
                    if (view7 != null && (viewFindViewById = view7.findViewById(R.id.wxg)) != null) {
                        C786410Ut5.LJLLLLLL(0, viewFindViewById);
                    }
                    View view8 = liveSubscribeEmojiInputDialog.getView();
                    if (view8 != null && (liveIconView = (LiveIconView) view8.findViewById(R.id.ks7)) != null) {
                        liveIconView.setIconAttr(R.attr.dwe);
                    }
                }
                final EnumC1783080wV8 enumC1783080wV83 = liveSubscribeEmojiInputDialog.LLILLJJLI;
                View view9 = liveSubscribeEmojiInputDialog.getView();
                if (view9 != null && (viewFindViewById2 = view9.findViewById(R.id.kqv)) != null) {
                    HandlerHook.viewPost(viewFindViewById2, new Runnable() { // from class: X.0x04
                        public final void LIZ() {
                            EditText editText;
                            View viewFindViewById5;
                            if (enumC1783080wV83 != EnumC1783080wV8.KEYBOARD) {
                                LiveSubscribeEmojiInputDialog liveSubscribeEmojiInputDialog2 = liveSubscribeEmojiInputDialog;
                                View view10 = liveSubscribeEmojiInputDialog2.getView();
                                if (view10 == null || (editText = (EditText) view10.findViewById(R.id.krn)) == null) {
                                    return;
                                }
                                KeyBoardUtil.LIZJ(liveSubscribeEmojiInputDialog2.getContext(), editText);
                                return;
                            }
                            View view11 = liveSubscribeEmojiInputDialog.getView();
                            if (view11 != null && (viewFindViewById5 = view11.findViewById(R.id.krn)) != null) {
                                viewFindViewById5.requestFocus();
                            }
                            Context context = liveSubscribeEmojiInputDialog.getContext();
                            View view12 = liveSubscribeEmojiInputDialog.getView();
                            KeyBoardUtil.LIZLLL(context, view12 != null ? (EditText) view12.findViewById(R.id.krn) : null);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LiveSubscribeEmojiInputDialog@90c4.openKeyboard$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LiveSubscribeEmojiInputDialog@90c4.openKeyboard$1");
                        }
                    });
                }
            }
        });
        C786410Ut5.y8((C1115150f7p) view.findViewById(R.id.view_shadow), new View.OnClickListener() { // from class: X.0zFR
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.LL.MR();
            }
        });
        if (this.LLJI > 1 && this.LLJ && (textView = (TextView) view.findViewById(R.id.gzk)) != null) {
            textView.setText("Next");
        }
        C786410Ut5.l8((C16F5) view.findViewById(R.id.gzk), new View.OnClickListener() { // from class: X.0zFQ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TextView textView2;
                LiveSubscribeEmojiInputDialog liveSubscribeEmojiInputDialog = this.LL;
                if (liveSubscribeEmojiInputDialog.LLJ) {
                    if (liveSubscribeEmojiInputDialog.LLJI > 1) {
                        liveSubscribeEmojiInputDialog.bn();
                    } else {
                        liveSubscribeEmojiInputDialog.fa();
                        this.LL.MR();
                    }
                    LiveSubscribeEmojiInputDialog liveSubscribeEmojiInputDialog2 = this.LL;
                    long j = liveSubscribeEmojiInputDialog2.LLJI - 1;
                    liveSubscribeEmojiInputDialog2.LLJI = j;
                    if (j <= 1 && (textView2 = (TextView) view.findViewById(R.id.gzk)) != null) {
                        textView2.setText(C497740JfY.LJIJI(2131844496));
                        return;
                    }
                    return;
                }
                liveSubscribeEmojiInputDialog.fa();
                this.LL.MR();
            }
        });
        ((TextView) view.findViewById(R.id.krn)).addTextChangedListener(new TextWatcher() { // from class: X.0x06
            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void afterTextChanged(android.text.Editable r4) {
                /*
                    r3 = this;
                    if (r4 == 0) goto L15
                    java.lang.String r0 = r4.toString()
                    if (r0 == 0) goto Lf
                    int r0 = r0.length()
                    if (r0 != 0) goto Lf
                    return
                Lf:
                    java.lang.String r2 = r4.toString()
                    if (r2 != 0) goto L17
                L15:
                    java.lang.String r2 = ""
                L17:
                    com.bytedance.android.livesdk.comp.impl.subscription.business.perks.badge.LiveSubscribeEmojiInputDialog r0 = r3.LL
                    android.content.Context r1 = r0.getContext()
                    if (r1 == 0) goto L24
                    com.bytedance.android.livesdk.comp.impl.subscription.business.perks.badge.LiveSubscribeEmojiInputDialog r0 = r3.LL
                    r0.rE(r1, r2)
                L24:
                    android.view.View r1 = r2
                    r0 = 2131376703(0x7f0a3a3f, float:1.837359E38)
                    android.view.View r1 = r1.findViewById(r0)
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    r0 = 0
                    r1.setText(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1802280x06.afterTextChanged(android.text.Editable):void");
            }
        });
        if (this.LLIZ) {
            final Context context = getContext();
            if (context != null) {
                C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.16De
                    /* JADX WARN: Removed duplicated region for block: B:37:0x008f A[Catch: Exception -> 0x0093, TRY_LEAVE, TryCatch #6 {Exception -> 0x0093, blocks: (B:35:0x008a, B:37:0x008f), top: B:74:0x008a }] */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea  */
                    /* JADX WARN: Removed duplicated region for block: B:61:0x011a  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ() throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 351
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC20738416De.LIZ():void");
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SubscribeEmojiUtil@54df.loadEmoji$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SubscribeEmojiUtil@54df.loadEmoji$1");
                    }
                });
                return;
            }
            return;
        }
        SR();
    }

    @Override // X.InterfaceC1888610zFL
    public final void rE(Context context, String str) {
        InterfaceC1888610zFL interfaceC1888610zFL = this.LLILZIL;
        if (interfaceC1888610zFL != null) {
            interfaceC1888610zFL.rE(context, str);
        }
    }

    @Override // X.InterfaceC19323110ij
    public final void u2(int i, boolean z) {
        LiveIconView liveIconView;
        View viewFindViewById;
        View viewFindViewById2;
        ViewGroup.LayoutParams layoutParams;
        FrameLayout frameLayout;
        LiveIconView liveIconView2;
        View viewFindViewById3;
        View viewFindViewById4;
        ViewGroup.LayoutParams layoutParams2;
        FrameLayout frameLayout2;
        View viewFindViewById5 = null;
        if (z) {
            this.LLILLJJLI = EnumC1783080wV8.KEYBOARD;
            View view = getView();
            if (view != null && (viewFindViewById4 = view.findViewById(R.id.h05)) != null && (layoutParams2 = viewFindViewById4.getLayoutParams()) != null) {
                layoutParams2.height = i;
                View view2 = getView();
                if (view2 != null && (frameLayout2 = (FrameLayout) view2.findViewById(R.id.h05)) != null) {
                    C786410Ut5.a6(frameLayout2, layoutParams2);
                }
            }
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById5 = view3.findViewById(R.id.wxk);
            }
            if (viewFindViewById5 != null) {
                int visibility = viewFindViewById5.getVisibility();
                viewFindViewById5.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, viewFindViewById5);
            }
            View view4 = getView();
            if (view4 != null && (viewFindViewById3 = view4.findViewById(R.id.wxg)) != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById3);
            }
            View view5 = getView();
            if (view5 != null && (liveIconView2 = (LiveIconView) view5.findViewById(R.id.ks7)) != null) {
                liveIconView2.setIcon(R.drawable.eug);
                return;
            }
            return;
        }
        this.LLILLJJLI = EnumC1783080wV8.PANEL;
        View view6 = getView();
        if (view6 != null && (viewFindViewById2 = view6.findViewById(R.id.h05)) != null && (layoutParams = viewFindViewById2.getLayoutParams()) != null) {
            layoutParams.height = (int) C497740JfY.LIZIZ(275.0f);
            View view7 = getView();
            if (view7 != null && (frameLayout = (FrameLayout) view7.findViewById(R.id.h05)) != null) {
                C786410Ut5.a6(frameLayout, layoutParams);
            }
        }
        View view8 = getView();
        if (view8 != null) {
            viewFindViewById5 = view8.findViewById(R.id.wxk);
        }
        if (viewFindViewById5 != null) {
            int visibility2 = viewFindViewById5.getVisibility();
            viewFindViewById5.setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, viewFindViewById5);
        }
        View view9 = getView();
        if (view9 != null && (viewFindViewById = view9.findViewById(R.id.wxg)) != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        View view10 = getView();
        if (view10 == null || (liveIconView = (LiveIconView) view10.findViewById(R.id.ks7)) == null) {
            return;
        }
        liveIconView.setIconAttr(R.attr.dwe);
    }

    @Override // X.InterfaceC1888610zFL
    public final void eG(Context context, BadgeIcon badgeIcon, BadgeIconTab badgeIconTab) {
        InterfaceC1888610zFL interfaceC1888610zFL = this.LLILZIL;
        if (interfaceC1888610zFL != null) {
            interfaceC1888610zFL.eG(context, badgeIcon, badgeIconTab);
        }
    }
}
