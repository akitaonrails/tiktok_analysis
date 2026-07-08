package kotlin.jvm.internal;

import X.C09AY;
import X.C497740JfY;
import X.C930380aJo;
import X.C931830aM9;
import X.InterfaceC931760aM2;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS10S0200001_15 extends C09AY implements Function1 {
    public final int $t;
    public float f2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS10S0200001_15 awS10S0200001_15, Object obj) {
        LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) awS10S0200001_15.l0;
        if (linkPlayerInfo.isFullPositionPreApproved) {
            C931830aM9 c931830aM9 = (C931830aM9) awS10S0200001_15.l1;
            float f = awS10S0200001_15.f2;
            InterfaceC931760aM2 interfaceC931760aM2 = c931830aM9.LLILLJJLI;
            if (interfaceC931760aM2 != null) {
                interfaceC931760aM2.LJJIJIIJI(linkPlayerInfo, new C930380aJo(linkPlayerInfo, c931830aM9, f), new AwS10S0200001_15(linkPlayerInfo, c931830aM9, f, 1));
            }
        } else {
            ((C931830aM9) awS10S0200001_15.l1).N5(linkPlayerInfo);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS10S0200001_15 awS10S0200001_15, Object obj) {
        ((LinkPlayerInfo) awS10S0200001_15.l0).isFullPositionPreApproved = true;
        ((C931830aM9) awS10S0200001_15.l1).LLJZIJLIL.setText(C497740JfY.LJIJI(2131855393));
        ((C931830aM9) awS10S0200001_15.l1).LLJZIJLIL.setEnabled(true);
        ((C931830aM9) awS10S0200001_15.l1).LLJZIJLIL.j0(R.style.a8a);
        ((C931830aM9) awS10S0200001_15.l1).LLJZIJLIL.setRadius(awS10S0200001_15.f2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S0200001_15(LinkPlayerInfo linkPlayerInfo, C931830aM9 c931830aM9, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = linkPlayerInfo;
        this.l1 = c931830aM9;
        this.f2 = f;
    }
}
