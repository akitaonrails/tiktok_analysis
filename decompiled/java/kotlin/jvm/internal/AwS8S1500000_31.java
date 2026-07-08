package kotlin.jvm.internal;

import X.C01EI;
import X.C09AY;
import X.C118300cf;
import X.C1397620mTQ;
import X.C1AZW;
import X.C20361214lm;
import X.C2188811AlT;
import X.C259800zU;
import X.InterfaceC20354714kj;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.playentity.StickerEffectEntity;
import com.bytedance.android.livesdk.model.SharedEffect;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class AwS8S1500000_31 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS8S1500000_31 awS8S1500000_31, Object obj) {
        String resourceId;
        List list = (List) obj;
        if (((StickerEffectEntity) awS8S1500000_31.l1).LLJJJJJIL.LJ != 1) {
            StickerEffectEntity stickerEffectEntity = (StickerEffectEntity) awS8S1500000_31.l1;
            SharedEffect sharedEffect = (SharedEffect) awS8S1500000_31.l2;
            String str = sharedEffect.id;
            String str2 = sharedEffect.backupResourceId;
            stickerEffectEntity.getClass();
            LiveEffect liveEffectLJJLIIIJILLIZJL = StickerEffectEntity.LJJLIIIJILLIZJL(str, str2, list);
            String strLIZ = C01EI.LIZ(115, ((StickerEffectEntity) awS8S1500000_31.l1).LLJJJJJIL.LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchEffectListInBroadcastResult, resourceId=");
            sbLIZ.append(((SharedEffect) awS8S1500000_31.l2).id);
            sbLIZ.append(", backupResourceId=");
            sbLIZ.append(((SharedEffect) awS8S1500000_31.l2).backupResourceId);
            sbLIZ.append(", finalEffectResourceId=");
            if (liveEffectLJJLIIIJILLIZJL != null) {
                resourceId = liveEffectLJJLIIIJILLIZJL.getResourceId();
            } else {
                resourceId = null;
            }
            sbLIZ.append(resourceId);
            C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            ((StickerEffectEntity) awS8S1500000_31.l1).LJJLIIIJLJLI(liveEffectLJJLIIIJILLIZJL, (C20361214lm) awS8S1500000_31.l3, new AwS575S0100000_31((C259800zU) awS8S1500000_31.l5, (C259800zU<InterfaceC20354714kj>) 130), awS8S1500000_31.s0, (LifecycleOwner) awS8S1500000_31.l4);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS8S1500000_31 awS8S1500000_31, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        int i = ((C118300cf) awS8S1500000_31.l3).element;
        if (i != 0) {
            c1397620mTQ.LJFF(i, new AwS67S1300000_31((C259800zU) awS8S1500000_31.l1, (C259800zU<Runnable>) awS8S1500000_31.l5, (NetworkStandardUIServiceImpl) awS8S1500000_31.l2, (C118300cf) awS8S1500000_31.s0, (String) 1));
        }
        int i2 = ((C118300cf) awS8S1500000_31.l4).element;
        if (i2 != 0) {
            c1397620mTQ.LJII(i2, new AwS114S1200000_31((NetworkStandardUIServiceImpl) awS8S1500000_31.l5, (C118300cf) awS8S1500000_31.l2, awS8S1500000_31.s0, 6));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS8S1500000_31(C118300cf c118300cf, C118300cf c118300cf2, C118300cf c118300cf3, C259800zU<Runnable> c259800zU, NetworkStandardUIServiceImpl networkStandardUIServiceImpl, C118300cf c118300cf4, String str) {
        super(1);
        this.$t = str;
        this.l3 = c118300cf;
        this.l4 = c118300cf2;
        this.l1 = c118300cf3;
        this.l5 = c259800zU;
        this.l2 = networkStandardUIServiceImpl;
        this.s0 = c118300cf4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS8S1500000_31(StickerEffectEntity stickerEffectEntity, StickerEffectEntity stickerEffectEntity2, SharedEffect sharedEffect, C20361214lm c20361214lm, String str, LifecycleOwner lifecycleOwner, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l1 = stickerEffectEntity;
        this.l2 = stickerEffectEntity2;
        this.l3 = sharedEffect;
        this.s0 = c20361214lm;
        this.l4 = str;
        this.l5 = lifecycleOwner;
    }
}
