package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol;

import X.AnonymousClass0956;
import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C0I6Y;
import X.C1295960jpS;
import X.C13LE;
import X.C1509305vX;
import X.C1558360qeg;
import X.C1558520qew;
import X.C2217381BqS;
import X.C452501pT;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C869590Y9l;
import X.C901890ZZr;
import X.C910920ZoQ;
import X.C910970ZoV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC911100Zoi;
import X.InterfaceC911130Zol;
import X.InterfaceC911150Zon;
import X.ViewOnAttachStateChangeListenerC913860ZtA;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListPhotoClickAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.ability.PhotoSwapAnimationAbility;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public abstract class PhotoSwapAssem<T extends InterfaceC911100Zoi, RECEIVER extends C03H5> extends DMCameraPhotoCardAssem<T, RECEIVER> implements InterfaceC911130Zol, InterfaceC911150Zon {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS558S0100000_14((PhotoSwapAssem) this, 978));
    public final C01GW LLL = C1509305vX.LIZ(new AwS558S0100000_14((PhotoSwapAssem) this, 977));
    public final C01GW LLLF = C1509305vX.LIZ(new AwS558S0100000_14((PhotoSwapAssem) this, 976));
    public final C01GW LLLFF = C1509305vX.LIZ(new AwS558S0100000_14((PhotoSwapAssem) this, 979));
    public AnonymousClass0956 LLLFFI;
    public volatile C910970ZoV LLLFZ;
    public volatile C910920ZoQ LLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoSwapAssem.class, "photoSwapAnimAbility", "getPhotoSwapAnimAbility()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/viewholder/template/media/protocol/PhotoSwapAnimAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PhotoSwapAssem.class, "photoSwapRevealAbility", "getPhotoSwapRevealAbility()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/viewholder/template/media/protocol/PhotoSwapRevealAbility;", 0);
        c09r3.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMCameraPhotoCardAssem
    public final C901890ZZr Ap() {
        return (C901890ZZr) this.LLLFF.getValue();
    }

    @Override // X.InterfaceC911150Zon
    public final PictureCardTemplate LLJJ() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((InterfaceC911100Zoi) (c724270Sb3 != null ? c724270Sb3.LL : null)).getContent();
    }

    @Override // X.InterfaceC911150Zon
    public final C869590Y9l getMsg() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null));
    }

    @Override // X.InterfaceC911130Zol
    public final C1295960jpS i7() {
        return (C1295960jpS) this.LLLF.getValue();
    }

    @Override // X.InterfaceC911130Zol
    public final MessageListPhotoClickAbility W9() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            return (MessageListPhotoClickAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), MessageListPhotoClickAbility.class, null);
        }
        return null;
    }

    @Override // X.InterfaceC911130Zol
    public final PhotoSwapAnimationAbility kc() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            return (PhotoSwapAnimationAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), PhotoSwapAnimationAbility.class, null);
        }
        return null;
    }

    @Override // X.InterfaceC911130Zol
    public final View ll() {
        return getContentView();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMCameraPhotoCardAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC913860ZtA(this, 10));
    }
}
