package kotlin.jvm.internal;

import X.AbstractC1159090gGh;
import X.AnonymousClass1991;
import X.C054G;
import X.C09AY;
import X.C0KPG;
import X.C0KPI;
import X.C1155860gBU;
import X.C336601Si;
import X.C631370Opb;
import X.InterfaceC21392018ne;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.ss.android.ugc.aweme.detail.ui.im.IMDetailPageComponent;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarSocialPublishAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.series.payment.serviceimpl.SeriesPaymentServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS55S0100100_24 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS55S0100100_24 awS55S0100100_24, Object obj) {
        C054G c054g = C336601Si.LIZ;
        C336601Si.LIZ("preload_cancel", awS55S0100100_24.j1, ((VideoItemParams) C631370Opb.LIZ((FeedAvatarSocialPublishAssem) awS55S0100100_24.l0)).getAweme(), (String) obj, null, null, 48);
        ((FeedAvatarSocialPublishAssem) awS55S0100100_24.l0).LLL = null;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS55S0100100_24 awS55S0100100_24, Object obj) {
        C1155860gBU c1155860gBU = (C1155860gBU) obj;
        if (c1155860gBU.LIZ == C0KPI.SUCCESS.getValue()) {
            ((SeriesPaymentServiceImpl) awS55S0100100_24.l0).LJIILIIL(new AbstractC1159090gGh(awS55S0100100_24.j1) { // from class: X.0gGi
                public final long LIZ;

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof C1159100gGi) && this.LIZ == ((C1159100gGi) obj2).LIZ;
                }

                public final int hashCode() {
                    return C786410Ut5.Y2(this.LIZ);
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("IapLoadingDone(collectionId=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.AbstractC1159090gGh
                public final long LIZ() {
                    return this.LIZ;
                }

                {
                    super(j);
                    this.LIZ = j;
                }
            });
        }
        Object obj2 = c1155860gBU.LIZIZ;
        if ((obj2 instanceof C0KPG) && obj2 != null) {
            ((SeriesPaymentServiceImpl) awS55S0100100_24.l0).LJFF.onNext((C0KPG) obj2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS55S0100100_24 awS55S0100100_24, Object obj) {
        IMDetailPageComponent iMDetailPageComponent = (IMDetailPageComponent) awS55S0100100_24.l0;
        final long j = awS55S0100100_24.j1;
        iMDetailPageComponent.getClass();
        ((AnonymousClass1991) obj).LIZJ = new InterfaceC21392018ne() { // from class: X.0Gd9
            @Override // X.InterfaceC21392018ne
            public final Animator LIZ(View view, View view2) {
                return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(j);
            }

            @Override // X.InterfaceC21392018ne
            public final Animator LIZIZ(View view, View view2) {
                return ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(j);
            }
        };
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S0100100_24(long j, FeedAvatarSocialPublishAssem feedAvatarSocialPublishAssem, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = feedAvatarSocialPublishAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S0100100_24(IMDetailPageComponent iMDetailPageComponent, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = iMDetailPageComponent;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S0100100_24(SeriesPaymentServiceImpl seriesPaymentServiceImpl, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = seriesPaymentServiceImpl;
        this.j1 = j;
    }
}
