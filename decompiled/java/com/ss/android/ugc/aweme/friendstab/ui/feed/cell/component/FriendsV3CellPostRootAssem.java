package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component;

import X.C01GW;
import X.C0QSJ;
import X.C1558520qew;
import X.C426880GoY;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C690870R8b;
import X.C704790Rkj;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1146704e9;
import X.InterfaceC1361270lWn;
import X.InterfaceC687730QyJ;
import Y.ARunnableS5S0500000_6;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CellConfigProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3AnimationAbility;
import com.ss.android.ugc.feed.platform.cell.RootCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsV3CellPostRootAssem extends BaseFriendsV3CellUISlotAssem<FriendsV3CellPostRootAssem, InterfaceC1361270lWn> implements FriendsV3AnimationAbility, C0QSJ, InterfaceC1146704e9 {
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cb_;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{RootCellScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RootCellScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RootCellScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public FriendsV3CellPostRootAssem() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJL = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 426));
        this.LLJLIL = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 424));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 425));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), FriendsV3AnimationAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3AnimationAbility
    public final void Yu2(AwS555S0100000_11 awS555S0100000_11) {
        ViewGroup viewGroup;
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
            C426880GoY c426880GoY = C426880GoY.LIZ;
            TuxTextView tuxTextView = (TuxTextView) this.LLJL.getValue();
            AvatarComponentView avatarComponentView = (AvatarComponentView) this.LLJLIL.getValue();
            c426880GoY.getClass();
            Rect rect = new Rect();
            if (avatarComponentView.getGlobalVisibleRect(rect) && rect.width() == avatarComponentView.getWidth() && rect.height() == avatarComponentView.getHeight()) {
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                viewGroup.addView(frameLayout);
                HandlerHook.viewPost(frameLayout, new ARunnableS5S0500000_6(tuxTextView, frameLayout, awS555S0100000_11, viewGroup, avatarComponentView, 0));
                return;
            }
            awS555S0100000_11.invoke();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        FriendsV3CellConfigProtocol friendsV3CellConfigProtocol = (FriendsV3CellConfigProtocol) this.LLJLILLLLZIIL.getValue();
        if (friendsV3CellConfigProtocol != null) {
            friendsV3CellConfigProtocol.NG(this, (C690870R8b) this.LLJJLIIIJLLLLLLLZ.getValue());
        }
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, FriendsV3AnimationAbility.class, null, null);
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
    }
}
