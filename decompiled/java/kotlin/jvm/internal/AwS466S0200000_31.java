package kotlin.jvm.internal;

import X.AbstractC20356314kz;
import X.AbstractC207157164l;
import X.AbstractC738140SxQ;
import X.AbstractC903430ZcL;
import X.C09AY;
import X.C0DHG;
import X.C0PEM;
import X.C1010170cOV;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C15A1;
import X.C15BF;
import X.C15NA;
import X.C15NB;
import X.C15NC;
import X.C163D;
import X.C164P;
import X.C1954807lC;
import X.C19EG;
import X.C1DFH;
import X.C20424814w2;
import X.C20441214yg;
import X.C204747159t;
import X.C20564815dW;
import X.C20661615t8;
import X.C207134163o;
import X.C207189165r;
import X.C2107308Nj;
import X.C21513519Hh;
import X.C2188811AlT;
import X.C23250099c;
import X.C291001Au;
import X.C298690BnH;
import X.C341290DZn;
import X.C632670Orh;
import X.C688120Qyw;
import X.C724240Sb0;
import X.C934690aQl;
import X.C985403tE;
import X.EnumC971980bOu;
import X.InterfaceC20507715Ml;
import X.InterfaceC497601wk;
import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.cohost.playentity.CohostEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.feedcard.TTPlusCardData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.selector.EcChoosePhotoActivity;
import com.ss.android.ugc.aweme.ecommerce.base.selector.viewmodel.EcPermissionVM;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageListPreviewDialogFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tag.assem.SelectedWidgetAssem;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.smartparams.AdaptionRegularResultOperator;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes32.dex */
public class AwS466S0200000_31 extends C09AY implements Function2 {
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
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS466S0200000_31(AbstractC20356314kz abstractC20356314kz, C20424814w2 c20424814w2, int i) {
        super(2);
        this.$t = i;
        this.l0 = abstractC20356314kz;
        this.l1 = c20424814w2;
    }

    public static final Object invoke$0(AwS466S0200000_31 awS466S0200000_31, Object obj, Object obj2) {
        CohostEntity cohostEntity = (CohostEntity) awS466S0200000_31.l0;
        cohostEntity.LJJJJJ(cohostEntity.LIZLLL((C20424814w2) awS466S0200000_31.l1, "stateChange"), ((CohostEntity) awS466S0200000_31.l0).LLJJJJJIL.LIZLLL);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS466S0200000_31 awS466S0200000_31, Object obj, Object obj2) {
        AbstractC20356314kz abstractC20356314kz = (AbstractC20356314kz) awS466S0200000_31.l0;
        abstractC20356314kz.LJJJJJ(abstractC20356314kz.LIZLLL((C20424814w2) awS466S0200000_31.l1, "stateChange"), ((AbstractC20356314kz) awS466S0200000_31.l0).LJJJIL().LIZLLL);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS466S0200000_31 awS466S0200000_31, Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj;
        int iIntValue = ((Number) obj2).intValue();
        SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment = (SpotlightImageListPreviewDialogFragment) awS466S0200000_31.l0;
        List<Matrix> list = spotlightImageListPreviewDialogFragment.LLJJJIL;
        List<Matrix> list2 = null;
        if (list == null) {
            list = null;
        }
        int i = spotlightImageListPreviewDialogFragment.LLJJIJIIJIL;
        C21513519Hh c21513519HhOR = spotlightImageListPreviewDialogFragment.OR();
        c21513519HhOR.getClass();
        ListProtector.set(list, i, new Matrix(c21513519HhOR.LLIZLLLIL));
        SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment2 = (SpotlightImageListPreviewDialogFragment) awS466S0200000_31.l0;
        spotlightImageListPreviewDialogFragment2.LLJJIJIIJIL = iIntValue;
        List<Matrix> list3 = spotlightImageListPreviewDialogFragment2.LLJJJIL;
        if (list3 == null) {
            list3 = null;
        }
        if (ListProtector.get(list3, iIntValue) != null) {
            C21513519Hh c21513519HhOR2 = ((SpotlightImageListPreviewDialogFragment) awS466S0200000_31.l0).OR();
            List<Matrix> list4 = ((SpotlightImageListPreviewDialogFragment) awS466S0200000_31.l0).LLJJJIL;
            if (list4 != null) {
                list2 = list4;
            }
            c21513519HhOR2.LJI((Matrix) ListProtector.get(list2, iIntValue));
            HandlerHook.viewRemoveCallbacks(((SpotlightImageListPreviewDialogFragment) awS466S0200000_31.l0).PR(), (Runnable) awS466S0200000_31.l1);
            ((SpotlightImageListPreviewDialogFragment) awS466S0200000_31.l0).PR().LIZIZ();
            HandlerHook.viewPostDelay(((SpotlightImageListPreviewDialogFragment) awS466S0200000_31.l0).PR(), (Runnable) awS466S0200000_31.l1, 2000L);
        }
        ((SpotlightImageListPreviewDialogFragment) awS466S0200000_31.l0).UR(bitmap);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS466S0200000_31 awS466S0200000_31, Object obj, Object obj2) {
        String uri;
        Pair pair = (Pair) obj2;
        for (String str : ((C15BF) awS466S0200000_31.l0).LJ) {
            if (Intrinsics.LJFF(str, obj)) {
                if (str == null) {
                    return null;
                }
                ImageModel imageModel = (ImageModel) awS466S0200000_31.l1;
                if (imageModel == null || (uri = imageModel.getUri()) == null) {
                    uri = "";
                }
                Bitmap bitmapLIZ = C934690aQl.LIZ(uri, true);
                int iIntValue = ((Number) pair.getFirst()).intValue();
                int iIntValue2 = ((Number) pair.getSecond()).intValue();
                if (bitmapLIZ != null) {
                    int width = bitmapLIZ.getWidth();
                    int height = bitmapLIZ.getHeight();
                    if (width != iIntValue || height != iIntValue2) {
                        Matrix matrix = new Matrix();
                        matrix.postScale(iIntValue / width, iIntValue2 / height);
                        return Bitmap.createBitmap(bitmapLIZ, 0, 0, width, height, matrix, true);
                    }
                    return bitmapLIZ;
                }
                return bitmapLIZ;
            }
        }
        return null;
    }

    public static final Object invoke$2(AwS466S0200000_31 awS466S0200000_31, Object obj, Object obj2) {
        ((AnchorTextHeaderService) awS466S0200000_31.l0).LJII(((Number) obj).intValue(), (Context) obj2, (EnumC971980bOu) awS466S0200000_31.l1, true);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS466S0200000_31 awS466S0200000_31, Object obj, Object obj2) {
        C15NC c15nc;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c15nc = (C15NC) c291001Au.LIZ) != null) {
            SelectedWidgetAssem selectedWidgetAssem = (SelectedWidgetAssem) awS466S0200000_31.l0;
            C19EG c19eg = (C19EG) awS466S0200000_31.l1;
            switch (C15NB.LIZ[c15nc.ordinal()]) {
                case 1:
                    selectedWidgetAssem.setLoading(false);
                    Fragment fragmentLJI = C724240Sb0.LJI(abstractC738140SxQ);
                    if (fragmentLJI != null) {
                        InterfaceC20507715Ml interfaceC20507715Ml = (InterfaceC20507715Ml) C1010170cOV.LIZIZ(InterfaceC20507715Ml.class);
                        if (interfaceC20507715Ml != null) {
                            interfaceC20507715Ml.Tv1(fragmentLJI);
                        }
                        VideoTagFriendsListViewModel videoTagFriendsListViewModelJo = selectedWidgetAssem.Jo();
                        InterfaceC497601wk assemVMScope = videoTagFriendsListViewModelJo.getAssemVMScope();
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(assemVMScope, C2107308Nj.LIZ, null, new C15NA(videoTagFriendsListViewModelJo, fragmentLJI, null), 2);
                    }
                    break;
                case 2:
                    selectedWidgetAssem.setLoading(true);
                    selectedWidgetAssem.Jo().EQ2();
                    break;
                case 3:
                    Context context = selectedWidgetAssem.getContext();
                    if (context != null) {
                        C1397620mTQ c1397620mTQ = new C1397620mTQ(context);
                        c1397620mTQ.LJ(2131849602, new AwS610S0100000_31(selectedWidgetAssem, 244));
                        c1397620mTQ.LJII(2131849600, new AwS610S0100000_31(selectedWidgetAssem, 245));
                        C1397580mTM c1397580mTM = new C1397580mTM(context);
                        c1397580mTM.LJFF(2131849604);
                        c1397580mTM.LIZ(2131849603);
                        c1397580mTM.LJIIL = c1397620mTQ;
                        c1397580mTM.LJII = false;
                        new C1397510mTF(c1397580mTM).LIZLLL();
                    }
                    break;
                case 4:
                    if (C298690BnH.LIZJ()) {
                        selectedWidgetAssem.Go(true);
                    } else {
                        selectedWidgetAssem.Ho();
                    }
                    break;
                case 5:
                case 6:
                    selectedWidgetAssem.setLoading(false);
                    C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                    c1389890mGx.LJIIIZ(2131849606);
                    c1389890mGx.LJIIJJI();
                    if (C298690BnH.LIZJ()) {
                        selectedWidgetAssem.Go(false);
                    }
                    break;
                case 7:
                    selectedWidgetAssem.setLoading(false);
                    if (C0DHG.LIZ() && C1388190mED.LIZ(c19eg) != null) {
                        C632670Orh.LIZIZ(c19eg, C341290DZn.LIZ);
                    } else {
                        C1397580mTM c1397580mTM2 = new C1397580mTM(c19eg);
                        c1397580mTM2.LIZ(2131849579);
                        C985403tE.LIZ(c1397580mTM2, AFwS276S0000000_31.get$arr$(224));
                        new C1397510mTF(c1397580mTM2).LIZLLL();
                    }
                    break;
                default:
                    throw new C1954807lC();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS466S0200000_31 awS466S0200000_31, Object obj, Object obj2) {
        EcPermissionVM ecPermissionVMLLLLLZL = ((EcChoosePhotoActivity) awS466S0200000_31.l0).LLLLLZL();
        EcChoosePhotoActivity ecChoosePhotoActivity = (EcChoosePhotoActivity) awS466S0200000_31.l0;
        if (ecChoosePhotoActivity != null) {
            ecPermissionVMLLLLLZL.setState(new AwS397S0200000_31(ecPermissionVMLLLLLZL, ecChoosePhotoActivity, 95));
        }
        Function0 function0 = (Function0) awS466S0200000_31.l1;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS466S0200000_31 awS466S0200000_31, Object obj, Object obj2) {
        String str;
        ((C164P) awS466S0200000_31.l0).getTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInvalidTransition error, from: ");
        sbLIZ.append(obj);
        sbLIZ.append(", event=");
        sbLIZ.append(obj2);
        sbLIZ.append(", id=");
        C207134163o c207134163o = ((C163D) awS466S0200000_31.l1).LJ;
        if (c207134163o != null) {
            str = c207134163o.LIZJ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS466S0200000_31 awS466S0200000_31, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String tag = ((C204747159t) awS466S0200000_31.l0).getTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("firework lottie loadRes success:");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(" message:");
        sbLIZ.append((String) obj2);
        C20441214yg.LJIIIZ(tag, C2188811AlT.LIZIZ(sbLIZ));
        ((C204747159t) awS466S0200000_31.l0).LJ((C15A1) awS466S0200000_31.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS466S0200000_31 awS466S0200000_31, Object obj, Object obj2) {
        Fragment fragment;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (!zBooleanValue) {
            if (!Intrinsics.LJFF(((C20661615t8) awS466S0200000_31.l0).LLILLL, "tako")) {
                ((C20661615t8) awS466S0200000_31.l0).LJIILJJIL((C688120Qyw) awS466S0200000_31.l1);
            }
        } else {
            C20661615t8 c20661615t8 = (C20661615t8) awS466S0200000_31.l0;
            C688120Qyw c688120Qyw = (C688120Qyw) awS466S0200000_31.l1;
            String str = c20661615t8.LLILLL;
            LifecycleOwner lifecycleOwner = c688120Qyw.LIZIZ;
            C1389890mGx c1389890mGx = null;
            if (lifecycleOwner instanceof Fragment) {
                fragment = (Fragment) lifecycleOwner;
            } else {
                fragment = null;
            }
            C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
            if (fragment != null) {
                c1389890mGx = new C1389890mGx(fragment);
            } else if (c19egLIZIZ != null) {
                c1389890mGx = new C1389890mGx(c19egLIZIZ);
            }
            int iHashCode = str.hashCode();
            if (iHashCode != -906336856) {
                if (iHashCode != 3529462) {
                    if (iHashCode == 100344454 && str.equals("inbox") && c1389890mGx != null) {
                        c1389890mGx.LJIIIZ(2131835536);
                        c1389890mGx.LJIIJJI();
                    }
                } else if (str.equals("shop") && c1389890mGx != null) {
                    c1389890mGx.LJIIIZ(2131835537);
                    c1389890mGx.LJIIJJI();
                }
            } else if (str.equals("search") && c1389890mGx != null) {
                c1389890mGx.LJIIIZ(2131835540);
                c1389890mGx.LJIIJJI();
            }
        }
        Function1<Boolean, Unit> function1 = ((C20661615t8) awS466S0200000_31.l0).LLIZ;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(zBooleanValue));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS466S0200000_31 r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS466S0200000_31.invoke$8(kotlin.jvm.internal.AwS466S0200000_31, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AwS466S0200000_31 r1, java.lang.Object r2, java.lang.Object r3) {
        /*
            X.15eG r3 = (X.AbstractC20569415eG) r3
            java.lang.Object r0 = r1.l0
            X.15dW r0 = (X.C20564815dW) r0
            java.lang.Object r1 = r1.l1
            com.ss.android.ugc.aweme.videoadaption.adaptionparams.smartparams.AdaptionRegularResultOperator r1 = (com.ss.android.ugc.aweme.videoadaption.adaptionparams.smartparams.AdaptionRegularResultOperator) r1
            java.lang.String r2 = r3.LIZ
            r0.getClass()
            int r0 = r2.hashCode()
            switch(r0) {
                case -1646185360: goto L19;
                case -1571378998: goto L22;
                case -1388096000: goto L31;
                case 513522387: goto L3a;
                case 1332378572: goto L48;
                case 1741517557: goto L56;
                default: goto L16;
            }
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L19:
            java.lang.String r0 = "interact_left"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2b
            goto L16
        L22:
            java.lang.String r0 = "interact_left_up"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2b
            goto L16
        L2b:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setIntextOccludeDesc(r0)
            goto L16
        L31:
            java.lang.String r0 = "right_edge"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L5f
            goto L16
        L3a:
            java.lang.String r0 = "interact_right"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L16
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setIntextOccludeInteraction(r0)
            goto L16
        L48:
            java.lang.String r0 = "interact_top"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L16
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setIntextOccludeTab(r0)
            goto L16
        L56:
            java.lang.String r0 = "left_edge"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L5f
            goto L16
        L5f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setIntextOut(r0)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS466S0200000_31.invoke$9(kotlin.jvm.internal.AwS466S0200000_31, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS466S0200000_31(C204747159t c204747159t, C15A1 c15a1, int i) {
        super(2);
        this.$t = i;
        this.l0 = c204747159t;
        this.l1 = c15a1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS466S0200000_31(C15BF c15bf, ImageModel imageModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = c15bf;
        this.l1 = imageModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS466S0200000_31(C20564815dW c20564815dW, AdaptionRegularResultOperator adaptionRegularResultOperator, int i) {
        super(2);
        this.$t = i;
        this.l0 = c20564815dW;
        this.l1 = adaptionRegularResultOperator;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS466S0200000_31(C20661615t8 c20661615t8, C688120Qyw c688120Qyw, int i) {
        super(2);
        this.$t = i;
        this.l0 = c20661615t8;
        this.l1 = c688120Qyw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS466S0200000_31(C164P c164p, C164P<AbstractC903430ZcL, AbstractC207157164l> c164p2, C163D c163d) {
        super(2);
        this.$t = c163d;
        this.l0 = c164p;
        this.l1 = c164p2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS466S0200000_31(C207189165r c207189165r, TTPlusCardData tTPlusCardData, int i) {
        super(2);
        this.$t = i;
        this.l0 = c207189165r;
        this.l1 = tTPlusCardData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS466S0200000_31(CohostEntity cohostEntity, C20424814w2 c20424814w2, int i) {
        super(2);
        this.$t = i;
        this.l0 = cohostEntity;
        this.l1 = c20424814w2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS466S0200000_31(AnchorTextHeaderService anchorTextHeaderService, EnumC971980bOu enumC971980bOu, int i) {
        super(2);
        this.$t = i;
        this.l0 = anchorTextHeaderService;
        this.l1 = enumC971980bOu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS466S0200000_31(EcChoosePhotoActivity ecChoosePhotoActivity, AwS575S0100000_31 awS575S0100000_31, int i) {
        super(2);
        this.$t = i;
        this.l0 = ecChoosePhotoActivity;
        this.l1 = awS575S0100000_31;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS466S0200000_31(SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment, ARunnableS131S0100000_31 aRunnableS131S0100000_31, int i) {
        super(2);
        this.$t = i;
        this.l0 = spotlightImageListPreviewDialogFragment;
        this.l1 = aRunnableS131S0100000_31;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS466S0200000_31(SelectedWidgetAssem selectedWidgetAssem, C19EG c19eg, int i) {
        super(2);
        this.$t = i;
        this.l0 = selectedWidgetAssem;
        this.l1 = c19eg;
    }
}
