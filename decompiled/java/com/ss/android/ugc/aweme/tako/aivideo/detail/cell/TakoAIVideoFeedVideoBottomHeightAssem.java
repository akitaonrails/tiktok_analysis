package com.ss.android.ugc.aweme.tako.aivideo.detail.cell;

import X.C05VZ;
import X.C09R3;
import X.C0DSB;
import X.C0IDP;
import X.C0QSJ;
import X.C13LE;
import X.C1558520qew;
import X.C1BNE;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C433970Gzz;
import X.C448810Hip;
import X.C687700QyG;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC448830Hir;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.tako.aivideo.detail.scope.TakoAIVideoDetailScope;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class TakoAIVideoFeedVideoBottomHeightAssem extends FeedBaseContentAssem<TakoAIVideoFeedVideoBottomHeightAssem> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final C2252321DDq LLJJJJ = C1BNE.LIZ(0);
    public C0IDP LLJJJJJIL;
    public volatile C05VZ LLJJJJLIIL;
    public volatile InterfaceC448830Hir LLJJL;
    public InterfaceC665370Q7z LLJJLIIIJLLLLLLLZ;
    public C0QSJ LLJL;
    public C0QSJ LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoAIVideoFeedVideoBottomHeightAssem.class, "heightAbility", "getHeightAbility()Lcom/ss/android/ugc/aweme/tako/aivideo/detail/ability/TakoAIVideoBottomHeightAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoAIVideoFeedVideoBottomHeightAssem.class, "cellAbility", "getCellAbility()Lcom/ss/android/ugc/aweme/tako/aivideo/detail/ability/TakoAIVideoCellAbility;", 0);
        c09r3.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class, TakoAIVideoDetailScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        arrayList.add(TakoAIVideoDetailScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        if (view.getTag(R.id.x45) == null) {
            view.setTag(R.id.x45, Boolean.TRUE);
            view.setPaddingRelative(0, 0, 0, C814420VxA.LIZIZ(C0DSB.LIZ(8)));
        }
        if (this.LLJJJJJIL == null) {
            C0IDP c0idp = new C0IDP(this, 1);
            view.addOnLayoutChangeListener(c0idp);
            this.LLJJJJJIL = c0idp;
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C433970Gzz(view, this, null), 3);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C448810Hip(this, null), 3);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        BottomBarPriorityAbility bottomBarPriorityAbility = (BottomBarPriorityAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BottomBarPriorityAbility.class, null);
        if (bottomBarPriorityAbility != null) {
            bottomBarPriorityAbility.fl1();
        }
    }

    public static int cp(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i3 = 0;
        if (marginLayoutParams != null) {
            i2 = marginLayoutParams.topMargin;
        } else {
            i2 = 0;
        }
        int i4 = i + i2;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i3 = marginLayoutParams2.bottomMargin;
        }
        return i4 + i3;
    }
}
