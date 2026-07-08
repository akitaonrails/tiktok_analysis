package defpackage;

import X.AbstractC879060Ye8;
import X.C062P;
import X.C09AY;
import X.C0Y8T;
import X.C0Z28;
import X.C0Z5T;
import X.C0Z5U;
import X.C0ZBL;
import X.C1697810uHb;
import X.C1722006ok;
import X.C19EG;
import X.C1A23;
import X.C1A24;
import X.C2201941BFw;
import X.C300790Bqf;
import X.C890990YxN;
import X.C893020Z1o;
import X.C893950Z5d;
import X.C893960Z5e;
import X.C898670ZNh;
import X.InterfaceC111300bX;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.search.ChatHistorySearchFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.data.IChatDetailActionFactory;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS298S0000000_14;
import kotlin.jvm.internal.AwS120S1000000_2;
import kotlin.jvm.internal.AwS124S1000000_14;
import kotlin.jvm.internal.AwS132S0110000_14;
import kotlin.jvm.internal.AwS29S1110000_2;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS41S1110000_14;
import kotlin.jvm.internal.AwS44S1300000_2;
import kotlin.jvm.internal.AwS53S1000000_2;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS57S0010000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.AwS68S0010000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class q8 extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ SingleDetailFragment LL;
    public final /* synthetic */ IMUser LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Long LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ AbstractC879060Ye8 LLIZLLLIL;
    public final /* synthetic */ C0Y8T LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(SingleDetailFragment singleDetailFragment, IMUser iMUser, String str, Long l, boolean z, boolean z2, boolean z3, AbstractC879060Ye8 abstractC879060Ye8, C0Y8T c0y8t, boolean z4) {
        super(1);
        this.LL = singleDetailFragment;
        this.LLILLJJLI = iMUser;
        this.LLILLL = str;
        this.LLILZ = l;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = z3;
        this.LLIZLLLIL = abstractC879060Ye8;
        this.LLJ = c0y8t;
        this.LLJI = z4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        final C893960Z5e c893960Z5eLIZ;
        final C893020Z1o c893020Z1oLIZLLL;
        C890990YxN c890990YxNLIZJ;
        C1722006ok c1722006okLIZIZ;
        C062P<InterfaceC111300bX> c062p2 = c062p;
        SingleDetailFragment singleDetailFragment = this.LL;
        final IMUser iMUser = this.LLILLJJLI;
        final String str = this.LLILLL;
        Long l = this.LLILZ;
        final boolean z = this.LLILZIL;
        final boolean z2 = this.LLILZLL;
        final boolean z3 = this.LLIZ;
        final AbstractC879060Ye8 abstractC879060Ye8 = this.LLIZLLLIL;
        final C0Y8T c0y8t = this.LLJ;
        final boolean z4 = this.LLJI;
        singleDetailFragment.getClass();
        ArrayList arrayList = new ArrayList();
        IChatDetailActionFactory.LIZ.getClass();
        IChatDetailActionFactory iChatDetailActionFactoryLIZ = C0Z5U.LIZ();
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(new C1A24(iMUser, z4) { // from class: X.0Z6m
            /* JADX WARN: Type inference failed for: r1v1, types: [X.0Z29, X.0Z6k] */
            {
                ?? r1 = new C0Z29(iMUser, z4, new C894370Z6t(new C06WA() { // from class: X.0Z6s
                }, 2131832142, R.raw.icon_two_person_plus_fill)) { // from class: X.0Z6k
                };
                super((C894370Z6t) r1.LLIZ, new AwS558S0100000_14((C894280Z6k) r1, 1653), new AwS628S0100000_14((C894280Z6k) r1, 84), new AwS628S0100000_14((C894280Z6k) r1, 85), 48);
            }
        }, new C1A24(iMUser, str, z2) { // from class: X.0Z6l
            {
                AtomicReference atomicReference = new AtomicReference(iMUser);
                super(new C894370Z6t(new C06WA() { // from class: X.0Z6r
                }, 2131835241, R.raw.icon_person_fill), AFwS201S0000000_14.get$arr$(561), new C1721706oh(iMUser, str, atomicReference, z2), new AwS628S0100000_14(atomicReference, (AtomicReference<IMUser>) 80), 48);
            }
        });
        if (ChatHistorySearchFeature.LIZ.LIZ() != null && iChatDetailActionFactoryLIZ != null && (c1722006okLIZIZ = iChatDetailActionFactoryLIZ.LIZIZ("private", str, iMUser.getUid())) != null) {
            listLJIILJJIL.add(c1722006okLIZIZ);
        }
        arrayList.add(new C893950Z5d(C0ZBL.HORIZONTAL_NEW, listLJIILJJIL));
        ArrayList arrayList2 = new ArrayList();
        IMCrossAppFeatureDiffApi.LIZ.getClass();
        IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
        if (iMCrossAppFeatureDiffApiLIZIZ != null && !iMCrossAppFeatureDiffApiLIZIZ.LIZLLL()) {
            arrayList2.add(new C1A23(str, iMUser, c0y8t, z4) { // from class: X.0Z1H
                {
                    AtomicReference atomicReference = new AtomicReference(iMUser);
                    super(new C2172771A1r(new C06WA() { // from class: X.0Z1I
                    }, 2131847924, R.raw.icon_bookmark_collection, null, null, true, null, 1976), new AwS558S0100000_14(c0y8t, 1651), new C904320Zdm(atomicReference, str), new C0Z1G(atomicReference, z4), null, 48);
                }
            });
        }
        ArrayList arrayList3 = new ArrayList();
        if (iChatDetailActionFactoryLIZ != null && (c890990YxNLIZJ = iChatDetailActionFactoryLIZ.LIZJ(str, z3, z4)) != null) {
            arrayList3.add(c890990YxNLIZJ);
        }
        arrayList3.add(new C0Z28(str, z4) { // from class: X.0Z1t
            /* JADX WARN: Illegal instructions before constructor call */
            {
                int i;
                C06W8 c06w8 = C06W8.LIZ;
                if (C300790Bqf.LIZ()) {
                    i = 2131832249;
                } else {
                    i = 2131835249;
                }
                super(new C2172711A1l(c06w8, i, R.raw.icon_bell_slash), AFwS201S0000000_14.get$arr$(562), new AwS120S1000000_2(str, 0), new AwS68S0010000_14(z4, 2));
            }
        });
        if (C300790Bqf.LIZ()) {
            C2201941BFw c2201941BFw = IMUser.Companion;
            String uid = iMUser.getUid();
            c2201941BFw.getClass();
            if (!C2201941BFw.LJFF(uid) && !z3) {
                arrayList3.add(new C0Z28(str) { // from class: X.0Z1k
                    {
                        super(new C2172711A1l(new C06WA() { // from class: X.0Z1l
                        }, 2131832248, R.raw.icon_phone), AFwS201S0000000_14.get$arr$(563), new AwS120S1000000_2(str, 1), new AwS124S1000000_14(str, 5));
                    }
                });
            }
        }
        IChatDetailActionFactory iChatDetailActionFactoryLIZ2 = C0Z5U.LIZ();
        if (iChatDetailActionFactoryLIZ2 != null && (c893020Z1oLIZLLL = iChatDetailActionFactoryLIZ2.LIZLLL(str, new AwS53S1000000_2(str, 34))) != null) {
            arrayList3.add(new C0Z28(c893020Z1oLIZLLL, z, z4) { // from class: X.0Z24
                public static final /* synthetic */ int LLJILJILJ = 0;

                {
                    super(c893020Z1oLIZLLL.LLIZ, new AwS132S0110000_14(z, c893020Z1oLIZLLL, 9), new AwS628S0100000_14(c893020Z1oLIZLLL, 81), new C0Z23(c893020Z1oLIZLLL, z, z4));
                }
            });
        }
        final C19EG activity = singleDetailFragment.getActivity();
        ListProtector.add(arrayList3, 0, new C1A23(str, activity, z4) { // from class: X.0Z19
            /* JADX WARN: Illegal instructions before constructor call */
            {
                boolean z5;
                String strLJIIJ;
                C1619106Vp c1619106Vp = IChatCustomizeHelper.LIZ;
                c1619106Vp.getClass();
                IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
                if (iChatCustomizeHelperLIZ != null && iChatCustomizeHelperLIZ.canShowNewLabel()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                C1696006kY c1696006kY = C1696006kY.LIZ;
                c1619106Vp.getClass();
                IChatCustomizeHelper iChatCustomizeHelperLIZ2 = C1619106Vp.LIZ();
                if (iChatCustomizeHelperLIZ2 != null && iChatCustomizeHelperLIZ2.isShowCustomizationLegacyNewLabel()) {
                    strLJIIJ = C1383370m6R.LJIIJ(2131830998);
                } else {
                    strLJIIJ = null;
                }
                super(new C2172771A1r(c1696006kY, 2131830991, R.raw.icon_color_palette, strLJIIJ, new AwS132S0110000_14(activity, z5, 10), true, null, 1928), AFwS201S0000000_14.get$arr$(560), new AwS41S1110000_14(activity, str, z5, 1), new AwS68S0010000_14(z4, 0), new AwS29S1110000_2(activity, str, z5, 1), 32);
            }
        });
        List listLJIILJJIL2 = C1697810uHb.LJIILJJIL(new C1A23(z3, abstractC879060Ye8) { // from class: X.0Yx7
            {
                super(new C2172771A1r(new C06WA() { // from class: X.0Yx9
                }, 2131845352, R.raw.icon_star, null, null, false, null, 2040), new AwS57S0010000_14(z3, 3), new AwS628S0100000_14(abstractC879060Ye8, 86), new AwS68S0010000_14(3), null, 48);
            }
        }, new C1A23(abstractC879060Ye8, z3) { // from class: X.0YxD
            {
                super(new C2172771A1r(new C06WA() { // from class: X.0YxH
                }, 2131845350, R.raw.icon_exclamation_mark_polygon, null, null, false, null, 2040), new AwS57S0010000_14(z3, 2), new AwS628S0100000_14(abstractC879060Ye8, 83), AFwS298S0000000_14.get$arr$(18), null, 48);
            }
        });
        Boolean boolValueOf = Boolean.valueOf(z);
        final Boolean boolValueOf2 = Boolean.valueOf(z2);
        IChatDetailActionFactory iChatDetailActionFactoryLIZ3 = C0Z5U.LIZ();
        if (iChatDetailActionFactoryLIZ3 != null && (c893960Z5eLIZ = iChatDetailActionFactoryLIZ3.LIZ(new AwS44S1300000_2(iMUser, boolValueOf, str, l, 3))) != null) {
            ListProtector.add(listLJIILJJIL2, 2, new C1A23(c893960Z5eLIZ, iMUser, boolValueOf2) { // from class: X.0Z5V
                public static final /* synthetic */ int LLJILJILJ = 0;

                {
                    super(c893960Z5eLIZ.LLIZ, new AwS415S0200000_14(iMUser, boolValueOf2, 128), new AwS628S0100000_14(c893960Z5eLIZ, 82), null, null, 56);
                }
            });
        }
        arrayList2.addAll(arrayList3);
        arrayList2.addAll(listLJIILJJIL2);
        arrayList.add(new C893950Z5d(C0ZBL.VERTICAL_NEW, arrayList2));
        c062p2.LIZ = new C0Z5T(arrayList);
        return Unit.LIZ;
    }
}
