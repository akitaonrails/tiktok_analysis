package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C20361214lm;
import X.C259800zU;
import X.C422301kb;
import X.C954460awe;
import X.C974060bSG;
import X.C974990bTl;
import X.EnumC919170a1j;
import X.InterfaceC20354714kj;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.CountDownSingleEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.CountDownSingleEntityConfig;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.SharedBackgroundEntity;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.data.multi_guest_play.CountdownConfig;

/* JADX INFO: loaded from: classes16.dex */
public class AwS171S0400000_15 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS171S0400000_15 awS171S0400000_15, Object obj, Object obj2) {
        PlayEntityUtilKt.LIZJ((SharedBackgroundEntity) awS171S0400000_15.l0, obj2, (C20361214lm) awS171S0400000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS171S0400000_15.l2).element, ((C013C) awS171S0400000_15.l3).element);
        ((C013C) awS171S0400000_15.l3).element = false;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS171S0400000_15 awS171S0400000_15, Object obj, Object obj2) {
        CountDownSingleEntityConfig countDownSingleEntityConfig;
        CountdownConfig countdownConfig;
        C422301kb c422301kb = (C422301kb) obj2;
        CountDownSingleEntity countDownSingleEntity = (CountDownSingleEntity) awS171S0400000_15.l0;
        if (c422301kb != null && (countdownConfig = c422301kb.LIZLLL) != null) {
            countDownSingleEntity.getClass();
            countDownSingleEntityConfig = new CountDownSingleEntityConfig(0L, false, 0L);
            countDownSingleEntityConfig.duration = countdownConfig.duration;
            countDownSingleEntityConfig.autoExpand = countdownConfig.autoExpand;
            countDownSingleEntityConfig.targetScore = countdownConfig.targetScore;
        } else {
            countDownSingleEntityConfig = null;
        }
        PlayEntityUtilKt.LIZJ(countDownSingleEntity, countDownSingleEntityConfig, (C20361214lm) awS171S0400000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS171S0400000_15.l2).element, ((C013C) awS171S0400000_15.l3).element);
        ((C013C) awS171S0400000_15.l3).element = false;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS171S0400000_15 awS171S0400000_15, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        C974990bTl c974990bTl = (C974990bTl) awS171S0400000_15.l1;
        C974060bSG c974060bSG = (C974060bSG) awS171S0400000_15.l2;
        List list = (List) awS171S0400000_15.l3;
        C974990bTl.LJIILIIL(c974060bSG, c974990bTl, (EnumC919170a1j) awS171S0400000_15.l0, (MultiMatchPrepareResponse) obj, list);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS171S0400000_15(EnumC919170a1j enumC919170a1j, EnumC919170a1j enumC919170a1j2, C974990bTl c974990bTl, C974060bSG c974060bSG, List<C954460awe> list) {
        super(2);
        this.$t = list;
        this.l0 = enumC919170a1j;
        this.l1 = enumC919170a1j2;
        this.l2 = c974990bTl;
        this.l3 = c974060bSG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS171S0400000_15(CountDownSingleEntity countDownSingleEntity, CountDownSingleEntity countDownSingleEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU, C013C c013c) {
        super(2);
        this.$t = c013c;
        this.l0 = countDownSingleEntity;
        this.l1 = countDownSingleEntity2;
        this.l2 = c20361214lm;
        this.l3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS171S0400000_15(SharedBackgroundEntity sharedBackgroundEntity, SharedBackgroundEntity sharedBackgroundEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU, C013C c013c) {
        super(2);
        this.$t = c013c;
        this.l0 = sharedBackgroundEntity;
        this.l1 = sharedBackgroundEntity2;
        this.l2 = c20361214lm;
        this.l3 = c259800zU;
    }
}
