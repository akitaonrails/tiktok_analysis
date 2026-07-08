package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C01GW;
import X.C0FEA;
import X.C10EU;
import X.C123100dR;
import X.C1243240iSQ;
import X.C13LE;
import X.C19719912Dl;
import X.C1A5L;
import X.C1ABT;
import X.C1ACA;
import X.C21370918kF;
import X.C21371118kH;
import X.C21371218kI;
import X.C21626919kR;
import X.C2188811AlT;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C452501pT;
import X.C497740JfY;
import X.C786410Ut5;
import X.C823050WQl;
import X.EnumC494740Jai;
import Y.ARunnableS24S1300000_32;
import android.os.Build;
import android.os.Trace;
import android.text.PrecomputedText;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.liveevent.LiveEventPreviewInfoSimplifyEnableSetting;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.NameWidget;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class NameWidget extends LiveWatchPreviewWidget {
    public final C01GW LLJ = C452501pT.LIZIZ(new C21371218kI(this));
    public SlimRoom.LinkMic LLJI;
    public final C01GW LLJIJIL;

    public NameWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJIJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new C21371118kH(c19719912DlLIZ), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public final TuxTextView N1() {
        return (TuxTextView) this.LLJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void J1() {
        final LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        final String strLIZIZ;
        List<User> list;
        C1ACA c1acaZ1;
        C1ACA c1acaZ12;
        C1ACA c1acaZ13 = z1();
        if (c1acaZ13 != null && (liveRoomStruct2 = c1acaZ13.LIZJ) != null) {
            C1ACA c1acaZ14 = z1();
            if (c1acaZ14 != null) {
                c1acaZ14.LJJLIIIIJ = null;
            }
            if (LiveEventPreviewInfoSimplifyEnableSetting.INSTANCE.enable() || (c1acaZ1 = z1()) == null || !C1ABT.LJIIJ(c1acaZ1) || ((c1acaZ12 = z1()) != null && C1ABT.LJIILIIL(c1acaZ12))) {
                C1ACA c1acaZ15 = z1();
                SlimRoom.LinkMic linkMicLJFF = c1acaZ15 != null ? C1ABT.LJFF(c1acaZ15) : null;
                this.LLJI = linkMicLJFF;
                com.ss.android.ugc.aweme.profile.model.User user = liveRoomStruct2.owner;
                if (user == null || TextUtils.isEmpty(user.getUniqueId())) {
                    strLIZIZ = C10EU.LIZIZ(liveRoomStruct2.owner, true);
                } else if (C0FEA.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('@');
                    sbLIZ.append(C1243240iSQ.LJ(C1243240iSQ.LIZ, liveRoomStruct2.owner));
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = C1243240iSQ.LJ(C1243240iSQ.LIZ, liveRoomStruct2.owner);
                }
                if (linkMicLJFF != null && (list = linkMicLJFF.followedList) != null && list.size() > 0) {
                    C1243240iSQ c1243240iSQ = C1243240iSQ.LIZ;
                    String nickName = ((User) ListProtector.get(list, 0)).getNickName();
                    String username = ((User) ListProtector.get(list, 0)).getUsername();
                    c1243240iSQ.getClass();
                    String strLIZLLL = C1243240iSQ.LIZLLL(nickName, username);
                    if (C123100dR.LIZ(strLIZLLL)) {
                        if (C0FEA.LIZ()) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append('@');
                            sbLIZ2.append(strLIZLLL);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        } else {
                            strLIZIZ = strLIZLLL;
                        }
                    }
                }
                if (C0FEA.LIZIZ()) {
                    N1().setTuxFont(32);
                } else {
                    N1().setTuxFont(42);
                }
                TuxTextView tuxTextViewN1 = N1();
                final C21370918kF textMetricsParamsCompat = tuxTextViewN1.getTextMetricsParamsCompat();
                final WeakReference weakReference = new WeakReference(tuxTextViewN1);
                C823050WQl.LIZJ().execute(new Runnable() { // from class: X.18kG
                    public final void LIZ() {
                        C21371318kJ c21371318kJ;
                        PrecomputedText.Params params;
                        AppCompatTextView appCompatTextView = weakReference.get();
                        if (appCompatTextView == null) {
                            return;
                        }
                        String str = strLIZIZ;
                        C21370918kF c21370918kF = textMetricsParamsCompat;
                        str.getClass();
                        c21370918kF.getClass();
                        try {
                            Trace.beginSection("PrecomputedText");
                            if (Build.VERSION.SDK_INT < 29 || (params = c21370918kF.LJ) == null) {
                                ArrayList arrayList = new ArrayList();
                                int length = str.length();
                                int i = 0;
                                while (i < length) {
                                    int iIndexOf = TextUtils.indexOf((CharSequence) str, '\n', i, length);
                                    i = iIndexOf < 0 ? length : iIndexOf + 1;
                                    arrayList.add(Integer.valueOf(i));
                                }
                                arrayList.size();
                                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                    ((Integer) arrayList.get(i2)).intValue();
                                }
                                StaticLayout.Builder.obtain(str, 0, str.length(), c21370918kF.LIZ, Integer.MAX_VALUE).setBreakStrategy(c21370918kF.LIZJ).setHyphenationFrequency(c21370918kF.LIZLLL).setTextDirection(c21370918kF.LIZIZ).build();
                                c21371318kJ = new C21371318kJ(str, c21370918kF);
                            } else {
                                c21371318kJ = new C21371318kJ(PrecomputedText.create(str, params), c21370918kF);
                            }
                            Trace.endSection();
                            try {
                                HandlerHook.viewPost(appCompatTextView, new ARunnableS24S1300000_32((WeakReference) weakReference, (WeakReference<AppCompatTextView>) c21371318kJ, (C21371318kJ) strLIZIZ, (String) this, (NameWidget) 0));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C20441214yg.LJFF("NameWidget", "asyncSetText,", e);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            Trace.endSection();
                            throw th;
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("NameWidget@1177.asyncSetText$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("NameWidget@1177.asyncSetText$1");
                    }
                });
            } else {
                String str = liveRoomStruct2.liveEventInfo.title;
                TuxTextView tuxTextViewN12 = N1();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (C497740JfY.LJJ()) {
                    if (C21626919kR.LIZLLL.LIZ(str.length(), str)) {
                        spannableStringBuilder.append((CharSequence) str).append((char) 8202).append((CharSequence) " ").append((char) 8204);
                    } else {
                        spannableStringBuilder.append((char) 8202).append((CharSequence) " ").append((char) 8204).append((CharSequence) str);
                    }
                } else if (C21626919kR.LIZJ.LIZ(str.length(), str)) {
                    spannableStringBuilder.append((char) 8202).append((CharSequence) " ").append((char) 8204).append((CharSequence) str);
                } else {
                    spannableStringBuilder.append((CharSequence) str).append((char) 8202).append((CharSequence) " ").append((char) 8204);
                }
                tuxTextViewN12.setText(spannableStringBuilder);
                M1(N1());
            }
        }
        C1ACA c1acaZ16 = z1();
        if (c1acaZ16 == null || (liveRoomStruct = c1acaZ16.LIZJ) == null) {
            return;
        }
        C786410Ut5.h9(N1(), new View.OnClickListener() { // from class: X.1AAf
            /* JADX WARN: Removed duplicated region for block: B:111:0x026b A[PHI: r1
              0x026b: PHI (r1v23 java.lang.String) = (r1v13 java.lang.String), (r1v24 java.lang.String) binds: [B:60:0x0169, B:58:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:68:0x017e A[PHI: r1
              0x017e: PHI (r1v21 java.lang.String) = (r1v15 java.lang.String), (r1v22 java.lang.String) binds: [B:67:0x017c, B:65:0x0179] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r16) {
                /*
                    Method dump skipped, instruction units count: 681
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC2174991AAf.onClick(android.view.View):void");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M1(androidx.appcompat.widget.AppCompatTextView r5) {
        /*
            r4 = this;
            X.0BZe r0 = X.C290240BZe.LIZ
            r0.getClass()
            X.01GW r0 = X.C290240BZe.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L49
            X.1ACA r0 = r4.z1()
            r3 = 0
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r0.LIZJ
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.profile.model.User r1 = r0.owner
            if (r1 == 0) goto L4b
            com.ss.android.ugc.aweme.feed.model.live.LiveAuthenticationInfo r0 = r1.authenticationInfo
            if (r0 == 0) goto L4b
            java.lang.String r2 = r0.getCustomVerify()
        L2a:
            com.ss.android.ugc.aweme.feed.model.live.LiveAuthenticationInfo r0 = r1.authenticationInfo
            if (r0 == 0) goto L32
            java.lang.String r3 = r0.getEnterpriseVerifyReason()
        L32:
            boolean r0 = X.C1908030zkf.LJ(r2, r3)
            if (r0 == 0) goto L44
            X.1ACA r1 = r4.z1()
            if (r1 == 0) goto L44
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.LJJLIIIIJ = r0
        L44:
            android.content.Context r0 = r4.context
            X.C1908030zkf.LJI(r0, r2, r3, r5)
        L49:
            return
        L4a:
            r1 = r3
        L4b:
            r2 = r3
            if (r1 == 0) goto L32
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.NameWidget.M1(androidx.appcompat.widget.AppCompatTextView):void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C2271391DvN.LIZ(N1(), (C1A5L) C2271381DvM.LJJJLIIL.getValue());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
    }
}
