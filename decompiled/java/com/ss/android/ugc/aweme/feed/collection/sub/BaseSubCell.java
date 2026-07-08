package com.ss.android.ugc.aweme.feed.collection.sub;

import X.C0RF0;
import X.C0SMO;
import X.C0SZL;
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
public abstract class BaseSubCell<R extends C0SMO<R, ITEM>, ITEM extends InterfaceC1587906Jp> extends BaseSubViewHolder<R, ITEM> {
    public BottomSlideIndicatorAbility LLJJL;
    public IPhotoModeAbility LLJJLIIIJLLLLLLLZ;
    public IPhotoSlidesAbility LLJL;
    public IPhotoSlidesEventDispatchAbility LLJLIL;
    public ISlideIndicatorAbility LLJLILLLLZIIL;
    public ICommercePhotoSlideAbility LLJLL;
    public ICarouselComponentTranslationAbility LLJLLIL;
    public PauseTimeAbility LLJLLL;
    public FeedBarSearchAbility LLJZ;
    public InterfaceC448830Hir LLJZIJLIL;
    public InterfaceC704110Rjd LLL;
    public FcpMetaTagAbility LLLF;
    public List<InterfaceC687730QyJ> LLLFF;

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            return this.LLJJL;
        }
        if (cls == IPhotoModeAbility.class) {
            return this.LLJJLIIIJLLLLLLLZ;
        }
        if (cls == IPhotoSlidesAbility.class) {
            return this.LLJL;
        }
        if (cls == IPhotoSlidesEventDispatchAbility.class) {
            return this.LLJLIL;
        }
        if (cls == ISlideIndicatorAbility.class) {
            return this.LLJLILLLLZIIL;
        }
        if (cls == ICommercePhotoSlideAbility.class) {
            return this.LLJLL;
        }
        if (cls == ICarouselComponentTranslationAbility.class) {
            return this.LLJLLIL;
        }
        if (cls == PauseTimeAbility.class) {
            return this.LLJLLL;
        }
        if (cls == FeedBarSearchAbility.class) {
            return this.LLJZ;
        }
        if (cls == InterfaceC448830Hir.class) {
            return this.LLJZIJLIL;
        }
        if (cls == InterfaceC704110Rjd.class) {
            return this.LLL;
        }
        if (cls == FcpMetaTagAbility.class) {
            return this.LLLF;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLLFF;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLLFF == null) {
            this.LLLFF = new ArrayList();
        }
        ((ArrayList) this.LLLFF).add(interfaceC687730QyJ);
    }

    public BaseSubCell(C0RF0 c0rf0, C0SZL c0szl) {
        super(c0rf0, c0szl);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLJJL = (BottomSlideIndicatorAbility) obj;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLJJLIIIJLLLLLLLZ = (IPhotoModeAbility) obj;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLJL = (IPhotoSlidesAbility) obj;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLJLIL = (IPhotoSlidesEventDispatchAbility) obj;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLJLILLLLZIIL = (ISlideIndicatorAbility) obj;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLJLL = (ICommercePhotoSlideAbility) obj;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLJLLIL = (ICarouselComponentTranslationAbility) obj;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJLLL = (PauseTimeAbility) obj;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLJZ = (FeedBarSearchAbility) obj;
            C687700QyG.LJFF(this, this.LLLFF, obj, cls);
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLJZIJLIL = (InterfaceC448830Hir) obj;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLL = (InterfaceC704110Rjd) obj;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLLF = (FcpMetaTagAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLJJL = null;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLJJLIIIJLLLLLLLZ = null;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLJL = null;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLJLIL = null;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLJLILLLLZIIL = null;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLJLL = null;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLJLLIL = null;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJLLL = null;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLJZ = null;
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLJZIJLIL = null;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLL = null;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLLF = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }
}
