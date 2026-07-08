package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.AnonymousClass0956;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C0S9L;
import X.C0SKM;
import X.C0SKP;
import X.C0SKQ;
import X.C0SKV;
import X.C0SKX;
import X.C0SKZ;
import X.C0SLX;
import X.C13LE;
import X.C1EE2;
import X.C20737116Cr;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C687700QyG;
import X.C719530SKh;
import X.C719660SKu;
import X.C719880SLq;
import X.C724270Sb3;
import X.C738950Syj;
import X.EnumC452301pR;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC696720RUo;
import X.InterfaceC710220RtU;
import X.InterfaceC719500SKe;
import X.InterfaceC737790Swr;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellViewAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import com.ss.android.ugc.aweme.scope.PhotoSlideScope;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoDynamicBgColorComponent;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoDynamicBgColorComponent extends BaseCellContentComponent<PhotoDynamicBgColorComponent> implements C0SKX, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public C719530SKh LLJLIL;
    public AnonymousClass0956 LLJLILLLLZIIL;
    public long LLJLL;
    public int LLJLLIL;
    public C0SLX LLJLLL;
    public C719880SLq LLJZ;
    public int LLJZIJLIL;
    public int LLL;
    public volatile InterfaceC696720RUo LLLFFI;
    public volatile C0S9L LLLFZ;
    public volatile C0SKV LLLI;
    public InterfaceC665370Q7z LLLII;
    public C0QSJ LLLIIII;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1017));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1018));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS198S0000000_11.get$arr$(230));
    public final C01GW LLJL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(229));
    public final C01GW LLLF = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(231));
    public final PhotoDynamicBgColorComponent LLLFF = this;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoDynamicBgColorComponent.class, "photoSlideComponentContext", "getPhotoSlideComponentContext()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoSlideComponentContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PhotoDynamicBgColorComponent.class, "photoCellLayoutAbility", "getPhotoCellLayoutAbility()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoCellLayoutAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PhotoDynamicBgColorComponent.class, "photoSlideAbility", "getPhotoSlideAbility()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoSlideInternalAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(PhotoDynamicBgColorComponent.class, "photoSlideEventNotifyAbility", "getPhotoSlideEventNotifyAbility()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoSlideEventNotifyAbility;", 0);
        c09r3.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PhotoSlideScope.class, VideoCellScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PhotoSlideScope.class);
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    public final C0QSJ ep() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLIIII;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLII;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLII = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PhotoSlideScope.class});
        this.LLLIIII = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final InterfaceC710220RtU hp() {
        C0S9L c0s9l = this.LLLFZ;
        if (c0s9l == null) {
            synchronized (this) {
                c0s9l = this.LLLFZ;
                if (c0s9l == null) {
                    C0QSJ c0qsjEp = ep();
                    c0s9l = c0qsjEp != null ? (C0S9L) c0qsjEp.getAbility(C0S9L.class) : null;
                    this.LLLFZ = c0s9l;
                    if (c0s9l == null) {
                        return null;
                    }
                }
            }
        }
        return c0s9l.yn();
    }

    public final C0SKV ip() {
        C0SKV c0skv = this.LLLI;
        if (c0skv == null) {
            synchronized (this) {
                c0skv = this.LLLI;
                if (c0skv == null) {
                    C0QSJ c0qsjEp = ep();
                    C0SKV c0skv2 = c0qsjEp != null ? (C0SKV) c0qsjEp.getAbility(C0SKV.class) : null;
                    this.LLLI = c0skv2;
                    return c0skv2;
                }
            }
        }
        return c0skv;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        C719660SKu c719660SKu;
        InterfaceC710220RtU interfaceC710220RtUHp = hp();
        if (interfaceC710220RtUHp == null || !interfaceC710220RtUHp.LJIIL()) {
            return;
        }
        InterfaceC710220RtU interfaceC710220RtUHp2 = hp();
        if ((interfaceC710220RtUHp2 instanceof C719660SKu) && (c719660SKu = (C719660SKu) interfaceC710220RtUHp2) != null) {
            C719530SKh c719530SKh = c719660SKu.LIZIZ;
            if (c719530SKh == null) {
                c719530SKh = new C719530SKh();
            }
            c719660SKu.LIZIZ = c719530SKh;
            c719530SKh.LJI.clear();
            c719530SKh.LIZJ = null;
            c719530SKh.LIZLLL = null;
            c719530SKh.LJ = null;
            c719530SKh.LJFF = 0;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJLILLLLZIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // X.C0SKX
    public final void LLLLLJIL(int i) {
        lp(0.0f, i);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PhotoSlideScope.class}).unbindAbility(this.LLLFF, C0SKX.class);
    }

    public final void kp(int i) {
        C719880SLq c719880SLq;
        PhotosViewHolderV3 photosViewHolderV3LJJJI;
        InterfaceC710220RtU interfaceC710220RtUHp = hp();
        if (interfaceC710220RtUHp != null && interfaceC710220RtUHp.LJIIL() && i == 0) {
            if ((this.LLJZIJLIL == 0 && this.LLL == 0) || (c719880SLq = this.LLJZ) == null || (photosViewHolderV3LJJJI = c719880SLq.LJJJI(i)) == null) {
                return;
            }
            photosViewHolderV3LJJJI.LIZLLL(this.LLJZIJLIL, this.LLL);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0SKT] */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        PagerAdapter adapter;
        C719880SLq c719880SLq;
        C719530SKh c719530SKh;
        C719660SKu c719660SKu;
        C0SLX c0slx = (C0SLX) view.findViewById(R.id.qez);
        this.LLJLLL = c0slx;
        if (c0slx != null) {
            adapter = c0slx.getAdapter();
        } else {
            adapter = null;
        }
        if (adapter instanceof C719880SLq) {
            c719880SLq = (C719880SLq) adapter;
        } else {
            c719880SLq = null;
        }
        this.LLJZ = c719880SLq;
        InterfaceC710220RtU interfaceC710220RtUHp = hp();
        if ((interfaceC710220RtUHp instanceof C719660SKu) && (c719660SKu = (C719660SKu) interfaceC710220RtUHp) != null) {
            c719530SKh = c719660SKu.LIZIZ;
            if (c719530SKh == null) {
                c719530SKh = new C719530SKh();
            }
            c719660SKu.LIZIZ = c719530SKh;
        } else {
            c719530SKh = new C719530SKh();
        }
        this.LLJLIL = c719530SKh;
        C0SLX c0slx2 = this.LLJLLL;
        if (c0slx2 != null) {
            c0slx2.LIZLLL(new C738950Syj(this, 2));
        }
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility = (IPhotoSlidesEventDispatchAbility) this.LLJJJJLIIL.getValue();
        if (iPhotoSlidesEventDispatchAbility != null) {
            iPhotoSlidesEventDispatchAbility.x6(new InterfaceC719500SKe() { // from class: X.0SKS
                @Override // X.InterfaceC719500SKe
                public final void n5(int i, JSONObject jSONObject) {
                }

                @Override // X.InterfaceC719500SKe
                public final void u6(SlidesImageLoadParams slidesImageLoadParams) {
                }

                @Override // X.InterfaceC719500SKe
                public final void p2(SlidesImageLoadParams slidesImageLoadParams) {
                    int currentItem;
                    C0SLX c0slx3 = this.LL.LLJLLL;
                    if (c0slx3 != null) {
                        currentItem = c0slx3.getCurrentItem();
                    } else {
                        currentItem = -1;
                    }
                    if (slidesImageLoadParams.index == currentItem) {
                        PhotoDynamicBgColorComponent photoDynamicBgColorComponent = this.LL;
                        if (photoDynamicBgColorComponent.LLJLLIL == 0) {
                            photoDynamicBgColorComponent.lp(0.0f, currentItem);
                            InterfaceC710220RtU interfaceC710220RtUHp2 = this.LL.hp();
                            if (interfaceC710220RtUHp2 != null && interfaceC710220RtUHp2.LJIIL()) {
                                this.LL.kp(currentItem);
                            }
                        }
                    }
                }
            });
        }
        C719880SLq c719880SLq2 = this.LLJZ;
        if (c719880SLq2 != null) {
            c719880SLq2.LLJLILLLLZIIL = new C0SKZ() { // from class: X.0SKT
                @Override // X.C0SKZ
                public final void LIZ(int i) {
                    int currentItem;
                    C0SLX c0slx3 = this.LIZ.LLJLLL;
                    if (c0slx3 != null) {
                        currentItem = c0slx3.getCurrentItem();
                    } else {
                        currentItem = -1;
                    }
                    if (i == currentItem) {
                        PhotoDynamicBgColorComponent photoDynamicBgColorComponent = this.LIZ;
                        if (photoDynamicBgColorComponent.LLJLLIL == 0) {
                            photoDynamicBgColorComponent.lp(0.0f, i);
                            InterfaceC710220RtU interfaceC710220RtUHp2 = this.LIZ.hp();
                            if (interfaceC710220RtUHp2 != null && interfaceC710220RtUHp2.LJIIL()) {
                                this.LIZ.kp(currentItem);
                            }
                        }
                    }
                }
            };
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PhotoSlideScope.class}).bindAbility(this.LLLFF, C0SKX.class);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        this.LLJZIJLIL = 0;
        this.LLL = 0;
        C719530SKh c719530SKh = this.LLJLIL;
        if (c719530SKh != null) {
            c719530SKh.LJI.clear();
            c719530SKh.LIZJ = null;
            c719530SKh.LIZLLL = null;
            c719530SKh.LJ = null;
            c719530SKh.LJFF = 0;
        }
    }

    public final void lp(float f, int i) {
        Object obj;
        PhotosViewHolderV3 photosViewHolderV3LJJJI;
        Object obj2;
        Object obj3;
        boolean z;
        Drawable drawableLJJIIJZLJL;
        C0SKV c0skvIp;
        InterfaceC710220RtU interfaceC710220RtUHp;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        if (aweme == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.LLJLL;
        if (f != 0.0f && f != 1.0f && j < ((Number) this.LLLF.getValue()).longValue()) {
            return;
        }
        this.LLJLL = jCurrentTimeMillis;
        boolean z2 = C0SKP.LIZ().enableOpt;
        InterfaceC696720RUo interfaceC696720RUo = this.LLLFFI;
        if (interfaceC696720RUo == null) {
            synchronized (this) {
                interfaceC696720RUo = this.LLLFFI;
                if (interfaceC696720RUo == null) {
                    C0QSJ c0qsjEp = ep();
                    if (c0qsjEp != null) {
                        interfaceC696720RUo = (InterfaceC696720RUo) c0qsjEp.getAbility(InterfaceC696720RUo.class);
                        C687700QyG.LJ(interfaceC696720RUo, InterfaceC696720RUo.class);
                    } else {
                        interfaceC696720RUo = null;
                    }
                    this.LLLFFI = interfaceC696720RUo;
                }
            }
        }
        if (!interfaceC696720RUo.ie() && (!z2 || (!C20737116Cr.LIZJ() && !C20737116Cr.LIZIZ()))) {
            C1EE2 c1ee2 = C1EE2.LIZIZ;
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            String str = ((VideoItemParams) obj2).mEventType;
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            } else {
                obj3 = null;
            }
            if (c1ee2.LJLIIL(aweme, str, ((VideoItemParams) obj3).isMyProfile) || (((interfaceC710220RtUHp = hp()) != null && interfaceC710220RtUHp.LJJIIJ()) || C0SKM.LIZJ())) {
                InterfaceC710220RtU interfaceC710220RtUHp2 = hp();
                if (interfaceC710220RtUHp2 != null && interfaceC710220RtUHp2.LJIIL()) {
                    z = true;
                } else {
                    z = false;
                }
                if (f == 0.0f && z) {
                    IVideoCellViewAbility iVideoCellViewAbility = (IVideoCellViewAbility) this.LLJJL.getValue();
                    if (iVideoCellViewAbility != null) {
                        iVideoCellViewAbility.UY1();
                    }
                    InterfaceC710220RtU interfaceC710220RtUHp3 = hp();
                    if (interfaceC710220RtUHp3 != null && (drawableLJJIIJZLJL = interfaceC710220RtUHp3.LJJIIJZLJL()) != null && (c0skvIp = ip()) != null) {
                        c0skvIp.F8(drawableLJJIIJZLJL, aweme.getAid());
                    }
                }
                AnonymousClass0956 anonymousClass0956 = this.LLJLILLLLZIIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LLJLILLLLZIIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0SKQ(z, this, i, f, aweme, z2, null), 3);
                return;
            }
        }
        C719880SLq c719880SLq = this.LLJZ;
        if (c719880SLq != null && (photosViewHolderV3LJJJI = c719880SLq.LJJJI(i)) != null) {
            photosViewHolderV3LJJJI.LJIIIIZZ((Drawable) this.LLJL.getValue());
        }
    }
}
