package kotlin.jvm.internal;

import X.AbstractC1201400hMw;
import X.C09AY;
import X.C1058250de3;
import X.C1155030gA9;
import X.C1169690gXn;
import X.C1178440glu;
import X.C1178450glv;
import X.C1185410gx9;
import X.C1195930hE7;
import X.C1196500hF2;
import X.C1201270hMj;
import X.C1201280hMk;
import X.C1201310hMn;
import X.C1201350hMr;
import X.C1201360hMs;
import X.C1201380hMu;
import X.C1205490hTX;
import X.C1207520hWo;
import X.C1257300ip6;
import X.C1954807lC;
import X.C19EG;
import X.C1EMR;
import X.EnumC1169600gXe;
import X.EnumC1169700gXo;
import X.EnumC1178460glw;
import X.EnumC1201300hMm;
import X.EnumC1201320hMo;
import X.InterfaceC1207170hWF;
import X.InterfaceC1672820tdI;
import X.InterfaceC1690500u5o;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizToastModel;
import com.ss.android.ugc.profile.business.ur.popup.AvatarAndNicknamePopupController;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS38S0310000_18;

/* JADX INFO: loaded from: classes19.dex */
public class AwS78S0500000_18 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS78S0500000_18 awS78S0500000_18) {
        ((C1169690gXn) awS78S0500000_18.l0).LIZLLL(EnumC1169700gXo.ADD_PHOTO);
        ((AvatarAndNicknamePopupController) awS78S0500000_18.l1).LJI((Activity) awS78S0500000_18.l2, (C1169690gXn) awS78S0500000_18.l0, (EnumC1169600gXe) awS78S0500000_18.l3, (C1196500hF2) awS78S0500000_18.l4, false);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS78S0500000_18 awS78S0500000_18) {
        ((C1169690gXn) awS78S0500000_18.l0).LJ(EnumC1169700gXo.EDIT_NICKNAME);
        ((AvatarAndNicknamePopupController) awS78S0500000_18.l1).LJI((Activity) awS78S0500000_18.l2, (C1169690gXn) awS78S0500000_18.l0, (EnumC1169600gXe) awS78S0500000_18.l3, (C1196500hF2) awS78S0500000_18.l4, false);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS78S0500000_18 awS78S0500000_18) {
        int i = C1178450glv.LIZ[((EnumC1178460glw) awS78S0500000_18.l0).ordinal()];
        if (i != 1) {
            if (i == 2) {
                C1178440glu c1178440glu = (C1178440glu) awS78S0500000_18.l1;
                c1178440glu.LJ.LIZLLL(Boolean.FALSE, c1178440glu, (C19EG) awS78S0500000_18.l2, (List) awS78S0500000_18.l3, (Function0) awS78S0500000_18.l4);
            }
        } else {
            C1178440glu c1178440glu2 = (C1178440glu) awS78S0500000_18.l1;
            c1178440glu2.LJ.LIZIZ((C19EG) awS78S0500000_18.l2, c1178440glu2, (List) awS78S0500000_18.l3, (Function0) awS78S0500000_18.l4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS78S0500000_18 awS78S0500000_18) {
        AbstractC1201400hMw abstractC1201400hMw;
        C1257300ip6 c1257300ip6 = C1257300ip6.LIZ;
        EnumC1201320hMo enumC1201320hMo = (EnumC1201320hMo) awS78S0500000_18.l0;
        c1257300ip6.getClass();
        if (enumC1201320hMo == EnumC1201320hMo.GPS) {
            abstractC1201400hMw = C1201360hMs.LIZIZ;
        } else {
            abstractC1201400hMw = C1201350hMr.LIZIZ;
        }
        abstractC1201400hMw.getClass();
        try {
            String string = abstractC1201400hMw.LIZ.getString(abstractC1201400hMw.LIZLLL(), "");
            if (string != null && string.length() != 0) {
                Object objLIZ = C1058250de3.LIZ(string, C1201380hMu.class);
                C1201380hMu c1201380hMu = (C1201380hMu) objLIZ;
                c1201380hMu.getClass();
                c1201380hMu.LIZIZ = 0;
                abstractC1201400hMw.LIZ.storeString(abstractC1201400hMw.LIZLLL(), C1058250de3.LIZLLL((C1201380hMu) objLIZ));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_DETAIL_LOCATION;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "float_notice_clear_frequency", null, e);
        }
        C1201280hMk.LIZ((EnumC1201320hMo) awS78S0500000_18.l0, EnumC1201300hMm.ALLOW, ((C1201270hMj) awS78S0500000_18.l1).LIZLLL);
        int i = C1201310hMn.LIZ[((EnumC1201320hMo) awS78S0500000_18.l0).ordinal()];
        if (i != 1) {
            if (i == 2) {
                C1201270hMj c1201270hMj = (C1201270hMj) awS78S0500000_18.l1;
                Fragment fragment = (Fragment) awS78S0500000_18.l2;
                C1185410gx9 c1185410gx9 = (C1185410gx9) awS78S0500000_18.l4;
                c1201270hMj.getClass();
                final C19EG activity = fragment.getActivity();
                if (activity != null) {
                    final TokenCert tokenCertLIZIZ = C1195930hE7.LIZIZ(true);
                    ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
                    if (iLocationBaseServiceForMT != null) {
                        C1207520hWo c1207520hWoLIZ = C1201270hMj.LIZ(c1185410gx9, true);
                        final WeakReference<C1201270hMj> weakReference = c1201270hMj.LJ;
                        iLocationBaseServiceForMT.LJIL(activity, fragment, tokenCertLIZIZ, c1207520hWoLIZ, new InterfaceC1207170hWF(weakReference, activity, tokenCertLIZIZ) { // from class: X.0hF8
                            public final WeakReference<C1201270hMj> LIZ;
                            public final Activity LIZIZ;
                            public final TokenCert LIZJ;

                            @Override // X.InterfaceC1207170hWF
                            public final void LIZ(C1208240hXy c1208240hXy) {
                            }

                            @Override // X.InterfaceC1207170hWF
                            public final void LIZIZ(C1208000hXa c1208000hXa) {
                                if (this.LIZ.get() != null) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("promotePreciseGPSPermissionFromFloatNotice resultType:");
                                    sbLIZ.append(c1208000hXa.LIZ);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    int i2 = C1207260hWO.LIZ[c1208000hXa.LIZ.ordinal()];
                                    if (i2 != 1) {
                                        if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                                            return;
                                        }
                                        C1197750hH3 c1197750hH3 = C1197750hH3.LIZ;
                                        Activity activity2 = this.LIZIZ;
                                        TokenCert tokenCert = this.LIZJ;
                                        EnumC1207930hXT enumC1207930hXT = c1208000hXa.LIZ;
                                        c1197750hH3.getClass();
                                        c1197750hH3.LIZJ("poi_detail_promote_precise_not_show", new AwS38S0310000_18(activity2, tokenCert, enumC1207930hXT, 3));
                                        return;
                                    }
                                    C1201360hMs.LIZIZ.LIZ();
                                }
                            }

                            {
                                this.LIZ = weakReference;
                                this.LIZIZ = activity;
                                this.LIZJ = tokenCertLIZIZ;
                            }
                        });
                    }
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            ((C1201270hMj) awS78S0500000_18.l1).LIZJ(((Fragment) awS78S0500000_18.l2).getContext(), (Fragment) awS78S0500000_18.l2, "poi", "poi_detail_float_notice", (TokenCert) awS78S0500000_18.l3, (C1185410gx9) awS78S0500000_18.l4);
        }
        ((C1201270hMj) awS78S0500000_18.l1).LJ();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS78S0500000_18 awS78S0500000_18) {
        boolean z;
        if (((InterfaceC1672820tdI) awS78S0500000_18.l0).LIZLLL((InterfaceC1690500u5o) awS78S0500000_18.l1) - ((InterfaceC1672820tdI) awS78S0500000_18.l2).LIZLLL((InterfaceC1690500u5o) awS78S0500000_18.l1) > 0) {
            z = true;
        } else {
            z = false;
        }
        return new C1155030gA9(z, ((InterfaceC1672820tdI) awS78S0500000_18.l3).LIZLLL((InterfaceC1690500u5o) awS78S0500000_18.l1), ((InterfaceC1672820tdI) awS78S0500000_18.l2).LIZLLL((InterfaceC1690500u5o) awS78S0500000_18.l1), ((InterfaceC1672820tdI) awS78S0500000_18.l4).LIZLLL((InterfaceC1690500u5o) awS78S0500000_18.l1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS78S0500000_18(C1169690gXn c1169690gXn, AvatarAndNicknamePopupController avatarAndNicknamePopupController, Activity activity, EnumC1169600gXe enumC1169600gXe, C1196500hF2 c1196500hF2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1169690gXn;
        this.l1 = avatarAndNicknamePopupController;
        this.l2 = activity;
        this.l3 = enumC1169600gXe;
        this.l4 = c1196500hF2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS78S0500000_18(EnumC1178460glw enumC1178460glw, EnumC1178460glw enumC1178460glw2, C1178440glu c1178440glu, C19EG c19eg, List<PoiQuizToastModel> list, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = enumC1178460glw;
        this.l1 = enumC1178460glw2;
        this.l2 = c1178440glu;
        this.l3 = c19eg;
        this.l4 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS78S0500000_18(EnumC1201320hMo enumC1201320hMo, C1201270hMj c1201270hMj, PoiDetailSlashFragment poiDetailSlashFragment, TokenCert tokenCert, C1185410gx9 c1185410gx9, int i) {
        super(0);
        this.$t = i;
        this.l0 = enumC1201320hMo;
        this.l1 = c1201270hMj;
        this.l2 = poiDetailSlashFragment;
        this.l3 = tokenCert;
        this.l4 = c1185410gx9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS78S0500000_18(InterfaceC1672820tdI interfaceC1672820tdI, InterfaceC1690500u5o interfaceC1690500u5o, InterfaceC1672820tdI interfaceC1672820tdI2, InterfaceC1672820tdI interfaceC1672820tdI3, InterfaceC1672820tdI interfaceC1672820tdI4, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC1672820tdI;
        this.l1 = interfaceC1690500u5o;
        this.l2 = interfaceC1672820tdI2;
        this.l3 = interfaceC1672820tdI3;
        this.l4 = interfaceC1672820tdI4;
    }
}
