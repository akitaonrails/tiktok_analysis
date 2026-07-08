package kotlin.jvm.internal;

import X.AbstractC1604130rqV;
import X.C05P0;
import X.C05P1;
import X.C09AY;
import X.C1688860u3A;
import X.C1688880u3C;
import X.C1909107dp;
import X.C19634511rr;
import X.C1A5S;
import X.C1AUN;
import X.C1AUR;
import X.C1AUV;
import X.C1AUW;
import X.C20248414Ks;
import X.C21658219pU;
import X.C291001Au;
import X.C587740N3k;
import X.InterfaceC1680500tpg;
import X.InterfaceC21659219pe;
import X.InterfaceC2217461Bqa;
import X.InterfaceC634840OvC;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.album.AlbumPreviewFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.permission.EcPermissionVM;
import com.ss.android.ugc.aweme.feed.flexible.FlexibleSheetAssem;
import com.ss.android.ugc.aweme.feed.flexible.ui.FlexibleBottomSheetBehavior;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.video.FriendsV3MusicTitleAssem;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.SettingsComposeRvmpFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes34.dex */
public class AwS468S0200000_33 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS468S0200000_33(C19634511rr c19634511rr, C19634511rr c19634511rr2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = c19634511rr;
        this.l1 = c19634511rr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS468S0200000_33 awS468S0200000_33, Object obj, Object obj2) {
        C20248414Ks c20248414Ks = (C20248414Ks) ((C291001Au) obj2).LIZ;
        if (c20248414Ks.LIZ) {
            String str = c20248414Ks.LIZIZ;
            if (str == null) {
                str = "close_unknown_method";
            }
            C587740N3k.LIZ.getClass();
            AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) C587740N3k.LIZIZ.getValue();
            if (abstractC1604130rqV != null) {
                abstractC1604130rqV.LJIIJJI(new AwS88S1000000_3(str, 13));
            }
            C21658219pU c21658219pU = ((FlexibleSheetAssem) awS468S0200000_33.l0).LLJJJJJIL;
            if (c21658219pU != null) {
                c21658219pU.LIZ(false, true);
            }
            ((FlexibleBottomSheetBehavior) awS468S0200000_33.l1).setState(5);
            InterfaceC21659219pe interfaceC21659219pe = (InterfaceC21659219pe) ((FlexibleSheetAssem) awS468S0200000_33.l0).LLJLL.getValue();
            if (interfaceC21659219pe != null) {
                interfaceC21659219pe.q(str);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS468S0200000_33 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131849919(0x7f1172bf, float:1.9333386E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity r0 = (com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity r2 = (com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS429S0200000_28 r6 = new kotlin.jvm.internal.AwS429S0200000_28
            r0 = 31
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            r0 = 2131849918(0x7f1172be, float:1.9333383E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L8d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L97
        L8d:
            kotlin.jvm.internal.AwS577S0100000_33 r6 = new kotlin.jvm.internal.AwS577S0100000_33
            r0 = 2282(0x8ea, float:3.198E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L97:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS468S0200000_33.invoke$1(kotlin.jvm.internal.AwS468S0200000_33, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$10(AwS468S0200000_33 awS468S0200000_33, Object obj, Object obj2) {
        ((FriendsV3MusicTitleAssem) awS468S0200000_33.l0).Xq((TuxIconView) awS468S0200000_33.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS468S0200000_33 awS468S0200000_33, Object obj, Object obj2) {
        int i;
        int i2;
        TuxIconView tuxIconView = (TuxIconView) awS468S0200000_33.l0;
        obj.getClass();
        if (obj2 == C1A5S.LIKE) {
            i = R.raw.icon_thumbs_up_fill;
        } else {
            i = R.raw.icon_thumbs_up;
        }
        tuxIconView.setIconRes(i);
        TuxIconView tuxIconView2 = (TuxIconView) awS468S0200000_33.l1;
        if (obj2 == C1A5S.DISLIKE) {
            i2 = R.raw.icon_thumbs_down_fill;
        } else {
            i2 = R.raw.icon_thumbs_down;
        }
        tuxIconView2.setIconRes(i2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS468S0200000_33 awS468S0200000_33, Object obj, Object obj2) {
        int i;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        TuxIconView tuxIconView = (TuxIconView) awS468S0200000_33.l0;
        obj.getClass();
        tuxIconView.setEnabled(zBooleanValue);
        int i2 = R.attr.a1k;
        if (zBooleanValue) {
            i = R.attr.a1k;
        } else {
            i = R.attr.a01;
        }
        tuxIconView.setTintColorRes(i);
        TuxIconView tuxIconView2 = (TuxIconView) awS468S0200000_33.l1;
        tuxIconView2.setEnabled(zBooleanValue);
        if (!zBooleanValue) {
            i2 = R.attr.a01;
        }
        tuxIconView2.setTintColorRes(i2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS468S0200000_33 awS468S0200000_33, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C05P1 c05p1 = (C05P1) awS468S0200000_33.l1;
            String str = SettingsComposeRvmpFragment._pnsPageId;
            C1688860u3A.LIZIZ((C1688880u3C) c05p1.getValue(), (List) awS468S0200000_33.l0, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS468S0200000_33 awS468S0200000_33, Object obj, Object obj2) {
        String containerID;
        String containerID2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        InterfaceC634840OvC interfaceC634840OvC = ((C1AUN) awS468S0200000_33.l0).IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        C1AUW c1auw = (C1AUW) C1909107dp.LIZJ(C1AUW.class, containerID);
        c1auw.setSystemIsNotReduced(Boolean.valueOf(zBooleanValue));
        c1auw.setInAppIsNotReduced(Boolean.valueOf(zBooleanValue2));
        CompletionBlock completionBlock = (CompletionBlock) awS468S0200000_33.l1;
        InterfaceC634840OvC interfaceC634840OvC2 = ((C1AUN) awS468S0200000_33.l0).IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID2 = interfaceC634840OvC2.getContainerID();
        } else {
            containerID2 = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C1AUR.class, containerID2);
        C1AUR c1aur = (C1AUR) xBaseModelLIZJ;
        c1aur.setGranted(c1auw);
        c1aur.setDenied(null);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS468S0200000_33 awS468S0200000_33, Object obj, Object obj2) {
        String containerID;
        String containerID2;
        int iIntValue = ((Number) obj).intValue();
        InterfaceC634840OvC interfaceC634840OvC = ((C1AUN) awS468S0200000_33.l0).IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        C1AUV c1auv = (C1AUV) C1909107dp.LIZJ(C1AUV.class, containerID);
        c1auv.setType(Integer.valueOf(iIntValue));
        CompletionBlock completionBlock = (CompletionBlock) awS468S0200000_33.l1;
        InterfaceC634840OvC interfaceC634840OvC2 = ((C1AUN) awS468S0200000_33.l0).IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID2 = interfaceC634840OvC2.getContainerID();
        } else {
            containerID2 = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C1AUR.class, containerID2);
        C1AUR c1aur = (C1AUR) xBaseModelLIZJ;
        c1aur.setDenied(c1auv);
        c1aur.setGranted(null);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS468S0200000_33 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r6 = r11
            X.0tpg r6 = (X.InterfaceC1680500tpg) r6
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L1a
            r6.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131829560(0x7f112338, float:1.9292093E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r9 = 1
            r3 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            X.11rr r0 = (X.C19634511rr) r0
            boolean r4 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r2 = r10.l0
            X.11rr r2 = (X.C19634511rr) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r4 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS430S0200000_29 r8 = new kotlin.jvm.internal.AwS430S0200000_29
            r0 = 70
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        L5a:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIIZZ(r4, r5, r6, r7, r8, r9)
            r0 = 2131829559(0x7f112337, float:1.929209E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            X.11rr r0 = (X.C19634511rr) r0
            boolean r3 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r10.l0
            X.11rr r2 = (X.C19634511rr) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r3 != 0) goto L97
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto La1
        L97:
            kotlin.jvm.internal.AwS430S0200000_29 r8 = new kotlin.jvm.internal.AwS430S0200000_29
            r0 = 71
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        La1:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIZ(r4, r5, r6, r7, r8, r9)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS468S0200000_33.invoke$7(kotlin.jvm.internal.AwS468S0200000_33, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$8(AwS468S0200000_33 awS468S0200000_33, Object obj, Object obj2) {
        ((EcTakePhotoActivity) awS468S0200000_33.l0).LLZLI().wQ2((EcTakePhotoActivity) awS468S0200000_33.l0, true);
        Function2 function2 = (Function2) awS468S0200000_33.l1;
        if (function2 != null) {
            function2.invoke(obj, obj2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS468S0200000_33 awS468S0200000_33, Object obj, Object obj2) {
        AlbumPreviewFragment albumPreviewFragment = (AlbumPreviewFragment) awS468S0200000_33.l0;
        if (albumPreviewFragment == null || (!albumPreviewFragment.mStatusDestroyed && !albumPreviewFragment.isDetached())) {
            AssemVMLazy assemVMLazy = ((AlbumPreviewFragment) awS468S0200000_33.l0).LLJJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = AlbumPreviewFragment.LLJJIJIL;
            ((EcPermissionVM) assemVMLazy.getValue()).wQ2(((AlbumPreviewFragment) awS468S0200000_33.l0).getContext(), false);
            EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM = (EcPhotoSearchAlbumVM) awS468S0200000_33.l1;
            if (ecPhotoSearchAlbumVM != null) {
                ecPhotoSearchAlbumVM.wQ2(((AlbumPreviewFragment) awS468S0200000_33.l0).getContext(), null);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS468S0200000_33(C1AUN c1aun, C1AUN c1aun2, CompletionBlock<C1AUR> completionBlock) {
        super(2);
        this.$t = completionBlock;
        this.l0 = c1aun;
        this.l1 = c1aun2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS468S0200000_33(TuxIconView tuxIconView, TuxIconView tuxIconView2, int i) {
        super(2);
        this.$t = i;
        this.l0 = tuxIconView;
        this.l1 = tuxIconView2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS468S0200000_33(EcTakePhotoActivity ecTakePhotoActivity, AwS468S0200000_33 awS468S0200000_33, int i) {
        super(2);
        this.$t = i;
        this.l0 = ecTakePhotoActivity;
        this.l1 = awS468S0200000_33;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS468S0200000_33(AlbumPreviewFragment albumPreviewFragment, EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = albumPreviewFragment;
        this.l1 = ecPhotoSearchAlbumVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS468S0200000_33(FlexibleSheetAssem flexibleSheetAssem, FlexibleBottomSheetBehavior flexibleBottomSheetBehavior, int i) {
        super(2);
        this.$t = i;
        this.l0 = flexibleSheetAssem;
        this.l1 = flexibleBottomSheetBehavior;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS468S0200000_33(FriendsV3MusicTitleAssem friendsV3MusicTitleAssem, TuxIconView tuxIconView, int i) {
        super(2);
        this.$t = i;
        this.l0 = friendsV3MusicTitleAssem;
        this.l1 = tuxIconView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS468S0200000_33(GeoFencingSelectionActivity geoFencingSelectionActivity, GeoFencingSelectionActivity geoFencingSelectionActivity2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = geoFencingSelectionActivity;
        this.l1 = geoFencingSelectionActivity2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS468S0200000_33(List list, C05P0 c05p0, int i) {
        super(2);
        this.$t = i;
        this.l0 = list;
        this.l1 = c05p0;
    }
}
