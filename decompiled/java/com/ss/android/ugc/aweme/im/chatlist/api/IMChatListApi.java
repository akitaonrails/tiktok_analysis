package com.ss.android.ugc.aweme.im.chatlist.api;

import X.AbstractC20660015ss;
import X.C0Y2X;
import X.C0Y8T;
import X.C0Z31;
import X.C0ZB7;
import X.C0ZCZ;
import X.C19719912Dl;
import X.C19EG;
import X.C890330YwJ;
import X.C890510Ywb;
import X.C897280ZHy;
import X.EnumC894560Z7m;
import X.InterfaceC1364105Vn;
import X.InterfaceC1412005fq;
import X.InterfaceC1719806oO;
import X.InterfaceC754190TiD;
import X.InterfaceC882680Yjy;
import X.InterfaceC882750Yk5;
import X.InterfaceC884180YmO;
import X.InterfaceC888840Ytu;
import X.InterfaceC889880Yva;
import X.InterfaceC889950Yvh;
import X.InterfaceC890150Yw1;
import X.InterfaceC890430YwT;
import X.InterfaceC890500Ywa;
import X.InterfaceC893700Z4e;
import X.InterfaceC913280ZsE;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.chatlist.api.model.ChatInviteViewModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserArchiveSettings;
import com.ss.android.ugc.aweme.im.core.chatlist.api.service.IIMChatListApi;
import java.util.List;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes15.dex */
public interface IMChatListApi extends IIMChatListApi {
    public static final C890330YwJ LJJIII = C890330YwJ.LIZ;

    void LIZ();

    @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.service.IIMChatListApi
    InterfaceC890150Yw1 LIZIZ();

    InterfaceC888840Ytu LIZLLL();

    ChatInviteViewModel LJ(C19EG c19eg);

    C0Y2X LJFF();

    InterfaceC754190TiD LJI();

    void LJII();

    InterfaceC913280ZsE LJIIIIZZ();

    InterfaceC889950Yvh LJIIIZ();

    InterfaceC1412005fq LJIIJ();

    InterfaceC893700Z4e LJIIJJI();

    InterfaceC890500Ywa LJIIL();

    C0ZB7 LJIILIIL();

    void LJIILJJIL();

    void LJIILL();

    List<Object> LJIILLIIL();

    C0Z31 LJIIZILJ();

    Object LJIJ(C0Y8T c0y8t, Activity activity, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    boolean LJIJI();

    void LJIJJ();

    C890510Ywb LJIJJLI();

    boolean LJIL(String str, Lifecycle.State state);

    void LJJ();

    InterfaceC1719806oO LJJI();

    AbstractC20660015ss<DialogFragment> LJJIFFI(Context context, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager);

    void LJJII();

    boolean LJJIII();

    C0ZCZ LJJIIJ();

    void LJJIIJZLJL();

    View LJJIIZ(Context context);

    List<Object> LJJIIZI();

    void LJJIJ(LifecycleOwner lifecycleOwner, AwS546S0100000_2 awS546S0100000_2);

    void LJJIJIIJI(Context context, FragmentManager fragmentManager, C897280ZHy c897280ZHy);

    boolean LJJIJIIJIL(Context context);

    InterfaceC882750Yk5 LJJIJIL();

    void LJJIJL(FragmentManager fragmentManager, EnumC894560Z7m enumC894560Z7m);

    int LJJIJLIJ(C19719912Dl c19719912Dl);

    InterfaceC882680Yjy LJJIL();

    InterfaceC889880Yva LJJIZ();

    InterfaceC890430YwT LJJJ();

    boolean LJJJI();

    InterfaceC884180YmO LJJJIL();

    IMUserArchiveSettings LJJJJ();
}
