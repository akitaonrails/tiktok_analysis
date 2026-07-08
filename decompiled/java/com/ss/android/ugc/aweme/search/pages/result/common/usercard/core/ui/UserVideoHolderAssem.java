package com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui;

import X.C07GK;
import X.C0Q6K;
import X.C0QSJ;
import X.C1012300cRw;
import X.C13LE;
import X.C1558520qew;
import X.C658200Prm;
import X.C661470Px3;
import X.C673150Qan;
import X.C687700QyG;
import X.C723830SaL;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC664630Q5d;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC712990Rxx;
import X.InterfaceC737790Swr;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleCommonAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class UserVideoHolderAssem extends ReusedUIContentAssem<UserVideoHolderAssem> implements InterfaceC712990Rxx<C658200Prm>, InterfaceC664630Q5d, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public final UserVideoHolderAssem LLJJJJ = this;
    public InterfaceC664630Q5d LLJJJJJIL;
    public List<InterfaceC687730QyJ> LLJJJJLIIL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC664630Q5d.class) {
            this.LLJJJJJIL = (InterfaceC664630Q5d) obj;
            C687700QyG.LJFF(this, this.LLJJJJLIIL, obj, cls);
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchCLASubtitleScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC664630Q5d.class) {
            return this.LLJJJJJIL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchCLASubtitleScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchCLASubtitleScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC664630Q5d.class) {
            this.LLJJJJJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLJJJJLIIL;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC664630Q5d
    public final C1012300cRw El() {
        return (C1012300cRw) LJJIJL().findViewById(R.id.wm6);
    }

    @Override // X.InterfaceC664630Q5d
    public final C661470Px3 X4() {
        IUserVideoHolderAbility iUserVideoHolderAbility = (IUserVideoHolderAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IUserVideoHolderAbility.class, null);
        if (iUserVideoHolderAbility != null) {
            return iUserVideoHolderAbility.X4();
        }
        return null;
    }

    @Override // X.InterfaceC664630Q5d
    public final TextView m7() {
        return (TextView) LJJIJL().findViewById(R.id.wm5);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchCLASubtitleScope.class}).unbindAbility(this.LLJJJJ, InterfaceC664630Q5d.class);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 237));
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchCLASubtitleScope.class}).bindAbility(this.LLJJJJ, InterfaceC664630Q5d.class);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLJJJJLIIL == null) {
            this.LLJJJJLIIL = new ArrayList();
        }
        ((ArrayList) this.LLJJJJLIIL).add(interfaceC687730QyJ);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C658200Prm c658200Prm) {
        C658200Prm c658200Prm2 = c658200Prm;
        if (C07GK.LIZ() && C0Q6K.LIZ(c658200Prm2.LL)) {
            C723830SaL.LJ(this, C13LE.LIZ(SearchCLASubtitleCommonAssem.class), true, null);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C658200Prm c658200Prm) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C658200Prm c658200Prm) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
