package com.ss.android.ugc.aweme.feed.collection.collection;

import X.C01GW;
import X.C0RF0;
import X.C0RF2;
import X.C0SMO;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.InterfaceC1587906Jp;
import android.graphics.SurfaceTexture;
import com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.container.scope.CommonVideoCellScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseCollectionViewHolder<R extends C0SMO<R, ITEM>, ITEM extends InterfaceC1587906Jp> extends BaseSubViewHolder<R, ITEM> {
    public final C0RF0 LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.InterfaceC1473950oSX
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.InterfaceC1473950oSX
    public final void LLF(int i, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.InterfaceC1473950oSX
    public void LLILLIZIL(int i, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommonVideoCellScope.class});
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0QSJ
    public Object getAbility(Class cls) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(CommonVideoCellScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0QSJ
    public List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(CommonVideoCellScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.InterfaceC1473950oSX
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public void LJJIJIIJIL(int i) {
        BaseCellContentComponent baseCellContentComponent;
        this.LLJJJIL = true;
        this.LLJJJJ = Boolean.TRUE;
        this.LLJJIJIL = i;
        if (!((Boolean) this.LLJJLIIIJLLLLLLLZ.getValue()).booleanValue() && (baseCellContentComponent = this.LLJJJ) != null) {
            baseCellContentComponent.J1(i, getAweme());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public void h(boolean z) {
        this.LLJJJIL = false;
        this.LLJJJJ = Boolean.FALSE;
        BaseCellContentComponent baseCellContentComponent = this.LLJJJ;
        if (baseCellContentComponent != null) {
            baseCellContentComponent.LJL();
        }
    }

    public BaseCollectionViewHolder(C0RF0 c0rf0, C0RF2<R, ITEM> c0rf2) {
        super(c0rf0, c0rf2);
        this.LLJJL = c0rf0;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11((BaseCollectionViewHolder) this, 287));
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0QSJ
    public void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0QSJ
    public void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
        C673150Qan.LIZIZ(this, obj, cls);
    }
}
