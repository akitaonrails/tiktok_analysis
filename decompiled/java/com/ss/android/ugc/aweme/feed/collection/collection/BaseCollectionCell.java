package com.ss.android.ugc.aweme.feed.collection.collection;

import X.C0RF0;
import X.C0RF2;
import X.C0SMO;
import X.C673150Qan;
import X.C687700QyG;
import X.InterfaceC1587906Jp;
import X.InterfaceC448830Hir;
import X.InterfaceC687730QyJ;
import X.InterfaceC704110Rjd;
import com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoSlideAbility;
import com.ss.android.ugc.aweme.ad.feed.translation.ability.ICarouselComponentTranslationAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseCollectionCell<R extends C0SMO<R, ITEM>, ITEM extends InterfaceC1587906Jp> extends BaseCollectionViewHolder<R, ITEM> {
    public BottomSlideIndicatorAbility LLJL;
    public IPhotoModeAbility LLJLIL;
    public IPhotoSlidesAbility LLJLILLLLZIIL;
    public IPhotoSlidesEventDispatchAbility LLJLL;
    public ISlideIndicatorAbility LLJLLIL;
    public ICommercePhotoSlideAbility LLJLLL;
    public ICarouselComponentTranslationAbility LLJZ;
    public PauseTimeAbility LLJZIJLIL;
    public FeedBarSearchAbility LLL;
    public InterfaceC448830Hir LLLF;
    public InterfaceC704110Rjd LLLFF;
    public FcpMetaTagAbility LLLFFI;
    public List<InterfaceC687730QyJ> LLLFZ;

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionViewHolder, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        super.bindAbility(obj, cls);
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLJL = (BottomSlideIndicatorAbility) obj;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLJLIL = (IPhotoModeAbility) obj;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLJLILLLLZIIL = (IPhotoSlidesAbility) obj;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLJLL = (IPhotoSlidesEventDispatchAbility) obj;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLJLLIL = (ISlideIndicatorAbility) obj;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLJLLL = (ICommercePhotoSlideAbility) obj;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLJZ = (ICarouselComponentTranslationAbility) obj;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJZIJLIL = (PauseTimeAbility) obj;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLL = (FeedBarSearchAbility) obj;
            C687700QyG.LJFF(this, this.LLLFZ, obj, cls);
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLLF = (InterfaceC448830Hir) obj;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLLFF = (InterfaceC704110Rjd) obj;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLLFFI = (FcpMetaTagAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionViewHolder, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionViewHolder, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            return this.LLJL;
        }
        if (cls == IPhotoModeAbility.class) {
            return this.LLJLIL;
        }
        if (cls == IPhotoSlidesAbility.class) {
            return this.LLJLILLLLZIIL;
        }
        if (cls == IPhotoSlidesEventDispatchAbility.class) {
            return this.LLJLL;
        }
        if (cls == ISlideIndicatorAbility.class) {
            return this.LLJLLIL;
        }
        if (cls == ICommercePhotoSlideAbility.class) {
            return this.LLJLLL;
        }
        if (cls == ICarouselComponentTranslationAbility.class) {
            return this.LLJZ;
        }
        if (cls == PauseTimeAbility.class) {
            return this.LLJZIJLIL;
        }
        if (cls == FeedBarSearchAbility.class) {
            return this.LLL;
        }
        if (cls == InterfaceC448830Hir.class) {
            return this.LLLF;
        }
        if (cls == InterfaceC704110Rjd.class) {
            return this.LLLFF;
        }
        if (cls == FcpMetaTagAbility.class) {
            return this.LLLFFI;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionViewHolder, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionViewHolder, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionViewHolder, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        super.unbindAbility(obj, cls);
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLJL = null;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLJLIL = null;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLJLILLLLZIIL = null;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLJLL = null;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLJLLIL = null;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLJLLL = null;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLJZ = null;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJZIJLIL = null;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLL = null;
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLLF = null;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLLFF = null;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLLFFI = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLLFZ;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLLFZ == null) {
            this.LLLFZ = new ArrayList();
        }
        ((ArrayList) this.LLLFZ).add(interfaceC687730QyJ);
    }

    public BaseCollectionCell(C0RF0 c0rf0, C0RF2<R, ITEM> c0rf2) {
        super(c0rf0, c0rf2);
    }
}
