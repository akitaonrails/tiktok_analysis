package com.ss.android.ugc.aweme.ui.feed.collection;

import X.C13LE;
import X.C1558520qew;
import X.C2217381BqS;
import X.C628500Oky;
import X.C687700QyG;
import X.C696790RUv;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC696800RUw;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.scope.PhotoSlideScope;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoScrollControlComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoScrollControlInCollectionComponent extends PhotoScrollControlComponent implements InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoScrollControlInCollectionComponent.class, "photoSlideComponentContext", "getPhotoSlideComponentContext()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoSlideComponentContext;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoScrollControlComponent, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PhotoSlideScope.class});
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoScrollControlComponent, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(PhotoSlideScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1032212285) {
            return null;
        }
        return this;
    }

    public PhotoScrollControlInCollectionComponent() {
        C628500Oky.LIZ(new AwS555S0100000_11(this, 974));
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoScrollControlComponent
    public final C696790RUv Co() {
        return new C696790RUv(LifecycleOwnerKt.getLifecycleScope(this), new InterfaceC696800RUw() { // from class: X.0RUs
            @Override // X.InterfaceC696800RUw
            public final void LIZ() {
                this.LIZ.Fo().QQ2(true);
            }
        });
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }
}
