package kotlin.jvm.internal;

import X.C09AY;
import X.C123100dR;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1556220qbE;
import X.C16GX;
import X.C1805210x4p;
import X.C1805370x55;
import X.C1805470x5F;
import X.C1833450xoN;
import X.C1833460xoO;
import X.C1838770xwx;
import X.C1840300xzQ;
import X.C1840310xzR;
import X.C1840320xzS;
import X.C1840330xzT;
import X.C1840350xzV;
import X.C1840380xzY;
import X.C1853070yK1;
import X.C1861040yWs;
import X.C1861520yXe;
import X.C1863340yaa;
import X.C19319810iC;
import X.C2188811AlT;
import X.C2476309n7;
import X.C291001Au;
import X.C326880Cre;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1861450yXX;
import X.InterfaceC1844880y6o;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplaySettingsTab;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplaySettingsTabInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.explore.assem.ExploreViewPagerComponent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowViewModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import defpackage.w2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS78S0210000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS78S0210000_27 awS78S0210000_27, Object obj) {
        C1861040yWs c1861040yWs = (C1861040yWs) obj;
        MessageViewModel messageViewModel = (MessageViewModel) awS78S0210000_27.l0;
        ArrayList arrayList = new ArrayList();
        w2 w2Var = (w2) awS78S0210000_27.l1;
        arrayList.addAll(c1861040yWs.LL.LIZ);
        List<Message> list = w2Var.LIZIZ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Message> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C326880Cre(null, it2.next(), null, 27));
        }
        arrayList.addAll(arrayList2);
        C291001Au c291001Au = new C291001Au(arrayList);
        ((MessageViewModel) awS78S0210000_27.l0).lR2(arrayList, EnumC1861450yXX.CARRY_AND_ASK, new C1861520yXe(null, false, false, false, null, null, null, null, null, null, false, 2047));
        return messageViewModel.WQ2(C1861040yWs.LIZ(c1861040yWs, c291001Au, false, awS78S0210000_27.z2, null, null, false, false, null, null, false, 0L, false, null, null, null, null, null, null, false, null, false, null, 0L, null, null, null, null, null, 1073741818));
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS78S0210000_27 awS78S0210000_27, Object obj) {
        InterfaceC1844880y6o interfaceC1844880y6o = (InterfaceC1844880y6o) obj;
        if (awS78S0210000_27.z2) {
            C16GX c16gx = (C16GX) awS78S0210000_27.l0;
            float f = -(((ExploreViewPagerComponent) awS78S0210000_27.l1).LLJLLIL * (1 - interfaceC1844880y6o.getProgress()));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16gx);
            c16gx.setTranslationY(f);
        } else {
            C16GX c16gx2 = (C16GX) awS78S0210000_27.l0;
            ExploreViewPagerComponent exploreViewPagerComponent = (ExploreViewPagerComponent) awS78S0210000_27.l1;
            ViewGroup.LayoutParams layoutParams = c16gx2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = exploreViewPagerComponent.LLJLLIL - ((int) (interfaceC1844880y6o.getProgress() * exploreViewPagerComponent.LLJLLIL));
                C786410Ut5.W5(c16gx2, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS78S0210000_27 awS78S0210000_27, Object obj) {
        if (!awS78S0210000_27.z2) {
            ((ExploreViewPagerComponent) awS78S0210000_27.l0).cp(false);
            ExploreViewPagerComponent exploreViewPagerComponent = (ExploreViewPagerComponent) awS78S0210000_27.l0;
            C16GX c16gx = (C16GX) awS78S0210000_27.l1;
            exploreViewPagerComponent.getClass();
            ViewGroup.LayoutParams layoutParams = c16gx.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = exploreViewPagerComponent.LLJLLIL;
                C786410Ut5.W5(c16gx, layoutParams);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16gx);
                c16gx.setAlpha(1.0f);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16gx);
                c16gx.setTranslationY(0.0f);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        } else {
            AwS74S0100100_27 awS74S0100100_27 = ((ExploreViewPagerComponent) awS78S0210000_27.l0).LLJL;
            if (awS74S0100100_27 != null) {
                awS74S0100100_27.invoke();
            }
            ((ExploreViewPagerComponent) awS78S0210000_27.l0).LLJL = null;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c2  */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r25v0, types: [X.0yXH] */
    /* JADX WARN: Type inference failed for: r25v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v2, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.TakoLynx] */
    /* JADX WARN: Type inference failed for: r28v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r31v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r32v1, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo] */
    /* JADX WARN: Type inference failed for: r35v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r38v1, types: [k9] */
    /* JADX WARN: Type inference failed for: r39v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r44v0, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.Message] */
    /* JADX WARN: Type inference failed for: r50v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r54v1, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS78S0210000_27 r54, java.lang.Object r55) {
        /*
            Method dump skipped, instruction units count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS78S0210000_27.invoke$3(kotlin.jvm.internal.AwS78S0210000_27, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AwS78S0210000_27 awS78S0210000_27, Object obj) {
        String str;
        String str2;
        C1840320xzS c1840320xzS;
        Throwable cause = (Throwable) obj;
        if (cause instanceof CancellationException) {
            cause = cause.getCause();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invokeOnCompletion cause=");
        sbLIZ.append(cause);
        C2188811AlT.LIZIZ(sbLIZ);
        if (cause instanceof C1840330xzT) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("empty ");
            sbLIZ2.append(cause.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            C1840380xzY c1840380xzY = C1840380xzY.LIZ;
            Context context = (Context) awS78S0210000_27.l0;
            C13BV c13bv = C13BV.INSTANCE;
            c1840380xzY.getClass();
            C1840380xzY.LJ(context, c13bv, true, true);
            C1840380xzY.LJ(context, c13bv, false, true);
        } else if (cause instanceof C1840350xzV) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("default camera ");
            sbLIZ3.append(cause.getMessage());
            C2188811AlT.LIZIZ(sbLIZ3);
            C1840380xzY c1840380xzY2 = C1840380xzY.LIZ;
            Context context2 = (Context) awS78S0210000_27.l0;
            C13BV c13bv2 = C13BV.INSTANCE;
            c1840380xzY2.getClass();
            C1840380xzY.LIZLLL(context2, c13bv2, true);
            C1840380xzY.LIZLLL(context2, c13bv2, false);
        } else if (cause instanceof C1840310xzR) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("story camera ");
            sbLIZ4.append(cause.getMessage());
            C2188811AlT.LIZIZ(sbLIZ4);
            C1840380xzY c1840380xzY3 = C1840380xzY.LIZ;
            Context context3 = (Context) awS78S0210000_27.l0;
            C13BV c13bv3 = C13BV.INSTANCE;
            c1840380xzY3.getClass();
            C1840380xzY.LIZLLL(context3, c13bv3, true);
            C1840380xzY.LIZLLL(context3, c13bv3, false);
        } else if (cause instanceof C1840300xzQ) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("exception ");
            sbLIZ5.append(cause.getMessage());
            C2188811AlT.LIZIZ(sbLIZ5);
        } else {
            C1838770xwx c1838770xwx = (C1838770xwx) awS78S0210000_27.l1;
            if (c1838770xwx.LLILLJJLI != null) {
                C1840320xzS c1840320xzS2 = c1838770xwx.LL;
                String str3 = null;
                if (c1840320xzS2 != null) {
                    str = c1840320xzS2.LIZ;
                } else {
                    str = null;
                }
                if (C123100dR.LIZ(str)) {
                    C1840320xzS c1840320xzS3 = c1838770xwx.LL;
                    if (c1840320xzS3 != null) {
                        str2 = c1840320xzS3.LIZIZ;
                    } else {
                        str2 = null;
                    }
                    if (C123100dR.LIZ(str2)) {
                        C1840320xzS c1840320xzS4 = c1838770xwx.LL;
                        if (c1840320xzS4 != null) {
                            str3 = c1840320xzS4.LIZJ;
                        }
                        if (C123100dR.LIZ(str3) && (c1840320xzS = c1838770xwx.LL) != null && c1840320xzS.LIZLLL >= 0) {
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("isEffective: ");
                            sbLIZ6.append((C1838770xwx) awS78S0210000_27.l1);
                            C2188811AlT.LIZIZ(sbLIZ6);
                            C1840380xzY c1840380xzY4 = C1840380xzY.LIZ;
                            Context context4 = (Context) awS78S0210000_27.l0;
                            C1838770xwx c1838770xwx2 = (C1838770xwx) awS78S0210000_27.l1;
                            c1840380xzY4.getClass();
                            Bitmap bitmap = c1838770xwx2.LLILLJJLI;
                            if (bitmap != null) {
                                int[] iArrLIZIZ = C1840380xzY.LIZIZ(context4, true);
                                if (iArrLIZIZ.length != 0) {
                                    C1840380xzY.LJFF(context4, c1838770xwx2, iArrLIZIZ, R.layout.qz, ((C2476309n7) C1840380xzY.LIZLLL.getValue()).LIZ(context4, bitmap, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(276)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(276)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))));
                                }
                                int[] iArrLIZIZ2 = C1840380xzY.LIZIZ(context4, false);
                                if (iArrLIZIZ2.length != 0) {
                                    C1840380xzY.LJFF(context4, c1838770xwx2, iArrLIZIZ2, R.layout.r1, ((C2476309n7) C1840380xzY.LIZLLL.getValue()).LIZ(context4, bitmap, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(132)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(132)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))));
                                }
                            }
                        }
                    }
                }
            }
        }
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("end: consumeAbleForceToEmpty=");
        sbLIZ7.append(awS78S0210000_27.z2);
        C2188811AlT.LIZIZ(sbLIZ7);
        C1840380xzY.LJI = false;
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS78S0210000_27 awS78S0210000_27, Object obj) {
        C1863340yaa c1863340yaa = (C1863340yaa) obj;
        c1863340yaa.LIZ(new AwS393S0200000_27((TakoActiveBotItem) awS78S0210000_27.l0, (TakoActiveBotItem) awS78S0210000_27.l1, 91));
        AFwS274S0000000_30.get$arr$(260).invoke(c1863340yaa.LIZLLL);
        new AwS116S0110000_30((TakoActiveBotItem) awS78S0210000_27.l1, awS78S0210000_27.z2, 1).invoke(c1863340yaa.LJ);
        new AwS116S0110000_30((TakoActiveBotItem) awS78S0210000_27.l1, awS78S0210000_27.z2, 2).invoke(c1863340yaa.LIZIZ);
        c1863340yaa.LJII = 6;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS78S0210000_27 awS78S0210000_27, Object obj) {
        String str;
        C1853070yK1 c1853070yK1 = (C1853070yK1) obj;
        if (!c1853070yK1.LLILZ.contains((TikTokMediaModel) awS78S0210000_27.l0)) {
            TikTokMediaModel tikTokMediaModelLJIILLIIL = TikTokMediaModel.LJIILLIIL((TikTokMediaModel) awS78S0210000_27.l0, c1853070yK1.LLILZ.size() + 1, 7);
            List<TikTokMediaModel> list = c1853070yK1.LLILLL.LIZ;
            ArrayList arrayList = new ArrayList();
            for (TikTokMediaModel tikTokMediaModel : list) {
                if (Intrinsics.LJFF(((MediaModel) tikTokMediaModel).id, ((MediaModel) tikTokMediaModelLJIILLIIL).id)) {
                    arrayList.add(tikTokMediaModelLJIILLIIL);
                } else {
                    arrayList.add(tikTokMediaModel);
                }
            }
            ArrayList arrayList2 = new ArrayList(C13LP.LLIIII(arrayList));
            MediaModel mediaModel = (MediaModel) C13LP.LJJLIIIJL(c1853070yK1.LLILZ);
            if (mediaModel != null) {
                str = mediaModel.id;
            } else {
                str = null;
            }
            Iterator it2 = arrayList2.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(((MediaModel) it2.next()).id, str)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (awS78S0210000_27.z2) {
                ListProtector.add(arrayList2, i + 1, tikTokMediaModelLJIILLIIL);
            }
            ArrayList arrayList3 = new ArrayList(c1853070yK1.LLILZ);
            arrayList3.add(tikTokMediaModelLJIILLIIL);
            ((TakoMenuWindowViewModel) awS78S0210000_27.l1).setState(new AwS393S0200000_27(arrayList2, (List<? extends TikTokMediaModel>) arrayList3, (List<? extends TikTokMediaModel>) 105));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS78S0210000_27 awS78S0210000_27, Object obj) {
        boolean z;
        C19319810iC c19319810iC = (C19319810iC) obj;
        AnchorReplaySettingsTabInfo anchorReplaySettingsTabInfo = ((AnchorReplaySettingsTab) awS78S0210000_27.l0).info;
        if (anchorReplaySettingsTabInfo != null && anchorReplaySettingsTabInfo.f21switch == 1) {
            z = true;
        } else {
            z = false;
        }
        return C19319810iC.LJJIJL(c19319810iC, z, null, new ACListenerS161S0100000_27((C1833450xoN) awS78S0210000_27.l1, 160), true, null, false, false, false, false, null, awS78S0210000_27.z2, 65522);
    }

    public static final Object invoke$8(AwS78S0210000_27 awS78S0210000_27, Object obj) {
        boolean z;
        C19319810iC c19319810iC = (C19319810iC) obj;
        AnchorReplaySettingsTabInfo anchorReplaySettingsTabInfo = ((AnchorReplaySettingsTab) awS78S0210000_27.l0).info;
        if (anchorReplaySettingsTabInfo != null && anchorReplaySettingsTabInfo.f21switch == 1) {
            z = true;
        } else {
            z = false;
        }
        return C19319810iC.LJJIJL(c19319810iC, z, null, new ACListenerS161S0100000_27((C1833460xoO) awS78S0210000_27.l1, 161), true, null, false, false, false, false, null, awS78S0210000_27.z2, 65522);
    }

    public static final Object invoke$9(AwS78S0210000_27 awS78S0210000_27, Object obj) {
        boolean z;
        C1805470x5F c1805470x5F = (C1805470x5F) obj;
        C1805210x4p c1805210x4p = c1805470x5F.LLILLJJLI;
        if (awS78S0210000_27.z2) {
            z = false;
        } else {
            z = c1805210x4p.LIZIZ;
        }
        return C1805470x5F.LIZ(c1805470x5F, (C1556220qbE) awS78S0210000_27.l1, C1805210x4p.LIZ(c1805210x4p, null, z, false, null, null, null, false, false, null, false, null, null, (C1805370x55) awS78S0210000_27.l0, null, null, false, null, 126973), null, null, 12);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS78S0210000_27(X.C16GX r3, com.ss.android.ugc.aweme.explore.assem.ExploreViewPagerComponent r4, boolean r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 1 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.z2 = r5
            r1.l0 = r4
            r1.l1 = r3
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.z2 = r5
            r1.l0 = r3
            r1.l1 = r4
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS78S0210000_27.<init>(X.16GX, com.ss.android.ugc.aweme.explore.assem.ExploreViewPagerComponent, boolean, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS78S0210000_27(defpackage.w2 r3, com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel r4, boolean r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            if (r6 == 0) goto L10
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.z2 = r5
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r4
            r1.z2 = r5
            r1.l1 = r3
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS78S0210000_27.<init>(w2, com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS78S0210000_27(Context context, C1838770xwx c1838770xwx, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = c1838770xwx;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS78S0210000_27(AnchorReplaySettingsTab anchorReplaySettingsTab, boolean z, C1833450xoN c1833450xoN, int i) {
        super(1);
        this.$t = i;
        this.l0 = anchorReplaySettingsTab;
        this.z2 = z;
        this.l1 = c1833450xoN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS78S0210000_27(AnchorReplaySettingsTab anchorReplaySettingsTab, boolean z, C1833460xoO c1833460xoO, int i) {
        super(1);
        this.$t = i;
        this.l0 = anchorReplaySettingsTab;
        this.z2 = z;
        this.l1 = c1833460xoO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS78S0210000_27(TakoActiveBotItem takoActiveBotItem, TakoActiveBotItem takoActiveBotItem2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = takoActiveBotItem;
        this.l1 = takoActiveBotItem2;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS78S0210000_27(TikTokMediaModel tikTokMediaModel, boolean z, TakoMenuWindowViewModel takoMenuWindowViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = tikTokMediaModel;
        this.z2 = z;
        this.l1 = takoMenuWindowViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS78S0210000_27(boolean z, C1805370x55 c1805370x55, C1556220qbE c1556220qbE, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = c1805370x55;
        this.l1 = c1556220qbE;
    }
}
