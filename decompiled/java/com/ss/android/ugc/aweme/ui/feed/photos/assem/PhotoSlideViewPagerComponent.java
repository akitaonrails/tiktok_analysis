package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.AbstractC705690RmB;
import X.AbstractC738140SxQ;
import X.C013C;
import X.C01GW;
import X.C08H2;
import X.C098200Yq;
import X.C09R3;
import X.C0ADZ;
import X.C0AU4;
import X.C0N0Y;
import X.C0QSJ;
import X.C0RGG;
import X.C0RJN;
import X.C0S9L;
import X.C0S9P;
import X.C0SKM;
import X.C0SKV;
import X.C0SKX;
import X.C0SKY;
import X.C0SL8;
import X.C0SL9;
import X.C0SLF;
import X.C0SLG;
import X.C0SLJ;
import X.C0SLS;
import X.C0SLX;
import X.C0SM8;
import X.C0SMC;
import X.C0SMD;
import X.C0SMF;
import X.C0SMP;
import X.C0SNV;
import X.C0SO2;
import X.C0SOW;
import X.C0WIY;
import X.C118300cf;
import X.C1220000hqw;
import X.C1375730lu7;
import X.C1388190mED;
import X.C1389300mG0;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C14EU;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1570380qy4;
import X.C1591220rVg;
import X.C1602160rnK;
import X.C1607950rwf;
import X.C161N;
import X.C1697810uHb;
import X.C189200o6;
import X.C1904180zeS;
import X.C19EG;
import X.C1A5L;
import X.C1AF0;
import X.C20737116Cr;
import X.C21600219g8;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C23250099c;
import X.C2421209eE;
import X.C259800zU;
import X.C281430B1h;
import X.C294910BhB;
import X.C295890Bil;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C497820Jfg;
import X.C585960MyY;
import X.C586380MzE;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C695660RQm;
import X.C705790RmL;
import X.C709030RrZ;
import X.C714060Rzg;
import X.C719530SKh;
import X.C719660SKu;
import X.C719670SKv;
import X.C719680SKw;
import X.C719720SLa;
import X.C719880SLq;
import X.C719950SLx;
import X.C720360SNm;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817403Hg;
import X.EnumC1616310sA9;
import X.EnumC452301pR;
import X.EnumC706820Ro0;
import X.InterfaceC1146704e9;
import X.InterfaceC1211910hdt;
import X.InterfaceC1554640qYg;
import X.InterfaceC1585190rLx;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC469360Ias;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC696720RUo;
import X.InterfaceC705580Rm0;
import X.InterfaceC709040Rra;
import X.InterfaceC710220RtU;
import X.InterfaceC717030SAr;
import X.InterfaceC717040SAs;
import X.InterfaceC719460SKa;
import X.InterfaceC719500SKe;
import X.InterfaceC719700SKy;
import X.InterfaceC720380SNo;
import X.InterfaceC737790Swr;
import X.ViewOnLayoutChangeListenerC738720SyM;
import Y.ACListenerS146S0100000_11;
import Y.ARunnableS111S0100000_11;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.fcpanchor.access.FeedMultiAnchorAbility;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellViewAbility;
import com.ss.android.ugc.aweme.feed.assem.desc.InteractInfoDescAbility;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.InteractInfoAuthorInfoAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.photos.clearmode.PhotoClearModeOwnerAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.scope.PhotoSlideScope;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideViewPagerComponent;
import com.ss.android.ugc.aweme.ui.feed.protocol.PhotoGetInitPositionProtocol;
import com.ss.android.ugc.aweme.ui.feed.protocol.PhotoOnIndexSetProtocol;
import com.ss.android.ugc.aweme.ui.feed.protocol.PhotoOnPageSelectedInterceptProtocol;
import com.ss.android.ugc.aweme.ui.feed.protocol.PhotoTouchInterceptorProtocol;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2;
import com.ss.android.ugc.aweme.upvote.ability.IUpvoteGuideAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS94S0210000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoSlideViewPagerComponent extends BaseCellContentComponent<PhotoSlideViewPagerComponent> implements InterfaceC469360Ias, C0S9L, IPhotoSlidesAbility, PhotoGetInitPositionProtocol, InterfaceC1211910hdt, InterfaceC1554640qYg, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLLL;
    public final C01GW LLJJJJLIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(528));
    public final C01GW LLJJL = C737910Sx3.LIZJ(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(529));
    public final C736950SvV LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C630740Ooa LLJLLIL;
    public boolean LLJLLL;
    public final C01GW LLJZ;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public C0SLX LLLFF;
    public C719880SLq LLLFFI;
    public TuxTextView LLLFZ;
    public boolean LLLI;
    public C714060Rzg LLLII;
    public TuxIconView LLLIIII;
    public View LLLIIIIL;
    public C0SOW LLLIIIL;
    public View LLLIIL;
    public int LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public PhotosViewHolderV3 LLLILZLLLI;
    public int LLLIZZ;
    public boolean LLLJ;
    public C719660SKu LLLJIL;
    public C719670SKv LLLJL;
    public int LLLL;
    public int LLLLII;
    public ValueAnimator LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public final PhotoSlideViewPagerComponent LLLLIILL;
    public final PhotoSlideViewPagerComponent LLLLIILLL;
    public final AwS555S0100000_11 LLLLIL;
    public final C01GW LLLLILI;
    public List<View> LLLLJ;
    public volatile InterfaceC696720RUo LLLLJI;
    public volatile InterfaceC717030SAr LLLLL;
    public volatile C0SKV LLLLLIL;
    public volatile C0SKY LLLLLILLIL;
    public volatile C0SKX LLLLLJIL;
    public volatile C0SLJ LLLLLJLJLL;
    public volatile C0SLS LLLLLL;
    public InterfaceC665370Q7z LLLLLLIL;
    public C0QSJ LLLLLLJ;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PhotoSlideScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PhotoSlideScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void onDestroyView() {
        Bp(true);
        PhotoClearModeOwnerAbility photoClearModeOwnerAbility = (PhotoClearModeOwnerAbility) this.LLLIL.getValue();
        if (photoClearModeOwnerAbility != null) {
            photoClearModeOwnerAbility.TD0(this);
        }
        InteractRightAreaAttachAbility interactRightAreaAttachAbility = (InteractRightAreaAttachAbility) this.LLJLLIL.getValue();
        if (interactRightAreaAttachAbility != null) {
            interactRightAreaAttachAbility.Bs2(null, -1);
        }
        C719880SLq c719880SLq = this.LLLFFI;
        if (c719880SLq != null) {
            c719880SLq.LLJJIJIL = null;
        }
        C719720SLa.LIZJ(this.LLLLIL);
        zp().TQ2(null);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -180829065) {
            return null;
        }
        return this;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoSlideViewPagerComponent.class, "photoSlideComponentContext", "getPhotoSlideComponentContext()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoSlideComponentContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PhotoSlideViewPagerComponent.class, "photoCellLayoutAbility", "getPhotoCellLayoutAbility()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoCellLayoutAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PhotoSlideViewPagerComponent.class, "photoSlideEventNotifyAbility", "getPhotoSlideEventNotifyAbility()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoSlideEventNotifyAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(PhotoSlideViewPagerComponent.class, "photoNumInternalAbility", "getPhotoNumInternalAbility()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoNumInternalAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(PhotoSlideViewPagerComponent.class, "photoBgColorAbility", "getPhotoBgColorAbility()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoBgColorAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(PhotoSlideViewPagerComponent.class, "multiFingerCallBack", "getMultiFingerCallBack()Lcom/ss/android/ugc/aweme/ui/feed/FeedPhotosMultiFingerCallBack;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(PhotoSlideViewPagerComponent.class, "pinchInterceptor", "getPinchInterceptor()Lcom/ss/android/ugc/aweme/ui/feed/collection/PinchInterceptor;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(PhotoSlideViewPagerComponent.class, "translationDelegate", "getTranslationDelegate()Lcom/ss/android/ugc/aweme/translation/controller/TranslationDelegate;", 0);
        c09r3.getClass();
        LLLLLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
    }

    public final C0SLS Ap() {
        C0SLS c0sls = this.LLLLLL;
        if (c0sls == null) {
            synchronized (this) {
                c0sls = this.LLLLLL;
                if (c0sls == null) {
                    C0QSJ c0qsjKp = kp();
                    C0SLS c0sls2 = c0qsjKp != null ? (C0SLS) c0qsjKp.getAbility(C0SLS.class) : null;
                    this.LLLLLL = c0sls2;
                    return c0sls2;
                }
            }
        }
        return c0sls;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        C719660SKu c719660SKu = this.LLLJIL;
        if (c719660SKu != null) {
            c719660SKu.LJJJJJL(false);
        }
        C719670SKv c719670SKv = this.LLLJL;
        if (c719670SKv != null) {
            c719670SKv.LIZ(false);
        }
        C719720SLa.LIZJ(this.LLLLIL);
        PhotoClearModeOwnerAbility photoClearModeOwnerAbility = (PhotoClearModeOwnerAbility) this.LLLIL.getValue();
        if (photoClearModeOwnerAbility != null) {
            photoClearModeOwnerAbility.TD0(this);
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        if (aweme == null || !AwemeExtKt.isPhotoMode(aweme) || AwemeExtKt.isAdTraffic(aweme)) {
            return;
        }
        C0SLF.LJFF = true;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final InterfaceC719460SKa LJLIL() {
        C719880SLq c719880SLq;
        C0SLX c0slx = this.LLLFF;
        if (c0slx == null || (c719880SLq = this.LLLFFI) == null) {
            return null;
        }
        return c719880SLq.LJJJJJ(c0slx.getCurrentItem());
    }

    @Override // X.C0S9L
    public final PhotosViewHolderV3 LLJLLL() {
        PhotosViewHolderV3 photosViewHolderV3;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        PhotoModeImageUrlModel photoModeImageUrlModel2;
        C0SLX c0slx = this.LLLFF;
        if (c0slx == null) {
            return null;
        }
        try {
            int currentItem = c0slx.getCurrentItem();
            PhotosViewHolderV3 photosViewHolderV32 = this.LLLILZLLLI;
            if (photosViewHolderV32 != null) {
                C719950SLx c719950SLx = photosViewHolderV32.LLJILJILJ;
                PhotoModeImageUrlModel photoModeImageUrlModel3 = c719950SLx != null ? c719950SLx.LLILLJJLI : null;
                C719880SLq c719880SLq = this.LLLFFI;
                if (c719880SLq != null) {
                    photoModeImageUrlModel2 = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(c719880SLq.LJJIJIL() > 0 ? currentItem % c719880SLq.LJJIJIL() : currentItem, c719880SLq.LLJILLL);
                } else {
                    photoModeImageUrlModel2 = null;
                }
                if (Intrinsics.LJFF(photoModeImageUrlModel3, photoModeImageUrlModel2)) {
                    return this.LLLILZLLLI;
                }
            }
            int childCount = c0slx.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = c0slx.getChildAt(i);
                Object tag = childAt != null ? childAt.getTag(R.id.el8) : null;
                if ((tag instanceof PhotosViewHolderV3) && (photosViewHolderV3 = (PhotosViewHolderV3) tag) != null) {
                    C719950SLx c719950SLx2 = photosViewHolderV3.LLJILJILJ;
                    PhotoModeImageUrlModel photoModeImageUrlModel4 = c719950SLx2 != null ? c719950SLx2.LLILLJJLI : null;
                    C719880SLq c719880SLq2 = this.LLLFFI;
                    if (c719880SLq2 != null) {
                        photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(c719880SLq2.LJJIJIL() > 0 ? currentItem % c719880SLq2.LJJIJIL() : currentItem, c719880SLq2.LLJILLL);
                    } else {
                        photoModeImageUrlModel = null;
                    }
                    if (Intrinsics.LJFF(photoModeImageUrlModel4, photoModeImageUrlModel)) {
                        this.LLLILZLLLI = photosViewHolderV3;
                        return photosViewHolderV3;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0S9L
    public final void Nd() {
        C0SLX c0slx = this.LLLFF;
        if (c0slx != null) {
            this.LLLL = c0slx.getPaddingStart();
            this.LLLLII = c0slx.getPaddingEnd();
            C426750GoL.LJIIL(c0slx, 0, null, 0, null, 26);
            c0slx.setScrollX(((C0S9P) zp().getState()).LL * C497820Jfg.LIZIZ(c0slx.getContext()));
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final Bundle Rc2() {
        C719660SKu c719660SKu;
        C0SLX c0slx;
        View view;
        View viewFindViewById;
        Activity activityLIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (C0SO2.LIZ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mEventType)) {
            return null;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (((C0SO2.LIZJ(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mEventType) && Intrinsics.LJFF(C724240Sb0.LIZ(this), C2421209eE.LIZ())) || ((c719660SKu = this.LLLJIL) != null && c719660SKu.LJJJLIIL)) && (c0slx = this.LLLFF) != null) {
            int currentItem = c0slx.getCurrentItem();
            C719880SLq c719880SLq = this.LLLFFI;
            PhotosViewHolderV3 photosViewHolderV3LJJJJJ = c719880SLq != null ? c719880SLq.LJJJJJ(currentItem) : null;
            if ((photosViewHolderV3LJJJJJ instanceof SmartImagePhotoViewHolderV2) && photosViewHolderV3LJJJJJ != null && (view = photosViewHolderV3LJJJJJ.LL) != null && (viewFindViewById = view.findViewById(R.id.vmb)) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                C724270Sb3 c724270Sb33 = this.LLJI;
                Aweme aweme = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme();
                sbLIZ.append(aweme != null ? aweme.getAid() : null);
                sbLIZ.append('_');
                sbLIZ.append(currentItem);
                sbLIZ.append("_cover_photo");
                viewFindViewById.setTransitionName(C2188811AlT.LIZIZ(sbLIZ));
                Context context = viewFindViewById.getContext();
                if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C0WIY(viewFindViewById, viewFindViewById.getTransitionName()));
                    int size = arrayList.size();
                    C0WIY[] c0wiyArr = new C0WIY[size];
                    arrayList.toArray(c0wiyArr);
                    Bundle bundleLJFF = C1607950rwf.LJ(activityLIZ, (C0WIY[]) Arrays.copyOf(c0wiyArr, size)).LJFF();
                    return bundleLJFF == null ? new Bundle() : bundleLJFF;
                }
            }
        }
        return null;
    }

    public final void Tp() {
        TuxIconView tuxIconView = this.LLLIIII;
        if (tuxIconView == null) {
            return;
        }
        if (zp().LLJJIII) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_speaker_x_mark_fill_ltr;
            c419910GdJ.LJ = Integer.valueOf(R.attr.zl);
            tuxIconView.setTuxIcon(c419910GdJ);
            return;
        }
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_speaker_2_fill_ltr;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.zl);
        tuxIconView.setTuxIcon(c419910GdJ2);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final boolean UH1() {
        C719880SLq c719880SLq;
        C0SLX c0slx = this.LLLFF;
        if (c0slx == null || (c719880SLq = this.LLLFFI) == null) {
            return false;
        }
        PhotosViewHolderV3 photosViewHolderV3LJJJJJ = c719880SLq.LJJJJJ(c0slx.getCurrentItem());
        if (!(photosViewHolderV3LJJJJJ instanceof PhotosViewHolderV3) || photosViewHolderV3LJJJJJ == null || !photosViewHolderV3LJJJJJ.LJJIFFI()) {
            return false;
        }
        int iLJJIJIL = c719880SLq.LJJIJIL();
        for (int i = 0; i < iLJJIJIL; i++) {
            PhotosViewHolderV3 photosViewHolderV3LJJJI = c719880SLq.LJJJI(i);
            if ((photosViewHolderV3LJJJI instanceof PhotosViewHolderV3) && photosViewHolderV3LJJJI != null) {
                photosViewHolderV3LJJJI.LJJIIJZLJL();
            }
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS111S0100000_11(this, 58));
        if (C1591220rVg.LIZLLL()) {
            C719720SLa.LIZJ(this.LLLLIL);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void ap() {
        C719880SLq c719880SLq = this.LLLFFI;
        if (c719880SLq != null) {
            c719880SLq.LJJJJL();
        }
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        C719660SKu c719660SKu = this.LLLJIL;
        if (c719660SKu != null && c719660SKu.LJJJLIIL && c719660SKu.LJIIJJI) {
            c719660SKu.LJJJJZ();
        }
    }

    @Override // X.InterfaceC1211910hdt
    public final String getAwemeId() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        if (aweme != null) {
            return aweme.getAid();
        }
        return null;
    }

    public final C0QSJ kp() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLLLLJ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLLLLIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLLLLIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PhotoSlideScope.class});
        this.LLLLLLJ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final View lp() {
        View viewFindViewById;
        C0SLX c0slx = this.LLLFF;
        if (c0slx == null) {
            return null;
        }
        Object parent = c0slx.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            while (view != null) {
                if ((view instanceof ViewGroup) && (viewFindViewById = view.findViewById(R.id.c26)) != null) {
                    return viewFindViewById.findViewById(R.id.qec);
                }
                Object parent2 = view.getParent();
                if (!(parent2 instanceof View)) {
                    break;
                }
                view = (View) parent2;
            }
        }
        return null;
    }

    public final C0SLJ mp() {
        C0SLJ c0slj = this.LLLLLJLJLL;
        if (c0slj == null) {
            synchronized (this) {
                c0slj = this.LLLLLJLJLL;
                if (c0slj == null) {
                    C0QSJ c0qsjKp = kp();
                    C0SLJ c0slj2 = c0qsjKp != null ? (C0SLJ) c0qsjKp.getAbility(C0SLJ.class) : null;
                    this.LLLLLJLJLL = c0slj2;
                    return c0slj2;
                }
            }
        }
        return c0slj;
    }

    public final InterfaceC717030SAr op() {
        InterfaceC717030SAr interfaceC717030SAr = this.LLLLL;
        if (interfaceC717030SAr == null) {
            synchronized (this) {
                interfaceC717030SAr = this.LLLLL;
                if (interfaceC717030SAr == null) {
                    C0QSJ c0qsjKp = kp();
                    InterfaceC717030SAr interfaceC717030SAr2 = c0qsjKp != null ? (InterfaceC717030SAr) c0qsjKp.getAbility(InterfaceC717030SAr.class) : null;
                    this.LLLLL = interfaceC717030SAr2;
                    return interfaceC717030SAr2;
                }
            }
        }
        return interfaceC717030SAr;
    }

    public final C0SKY sp() {
        C0SKY c0sky = this.LLLLLILLIL;
        if (c0sky == null) {
            synchronized (this) {
                c0sky = this.LLLLLILLIL;
                if (c0sky == null) {
                    C0QSJ c0qsjKp = kp();
                    C0SKY c0sky2 = c0qsjKp != null ? (C0SKY) c0qsjKp.getAbility(C0SKY.class) : null;
                    this.LLLLLILLIL = c0sky2;
                    return c0sky2;
                }
            }
        }
        return c0sky;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        Set<InterfaceC705580Rm0> anchorShowListeners;
        AbstractC705690RmB abstractC705690RmB;
        Set<InterfaceC705580Rm0> anchorShowListeners2;
        InterfaceC719700SKy interfaceC719700SKy;
        C719670SKv c719670SKv = this.LLLJL;
        if (c719670SKv != null) {
            BPEAHandler bPEAHandler = c719670SKv.LJII;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacksAndMessages(null);
            }
            c719670SKv.LIZIZ = null;
            c719670SKv.LJIIJ = null;
            c719670SKv.LJIIL = null;
            c719670SKv.LJ = false;
            c719670SKv.LJFF = false;
            c719670SKv.LJI = false;
            c719670SKv.LJIIIZ = false;
        }
        C719660SKu c719660SKu = this.LLLJIL;
        if (c719660SKu != null) {
            String str = c719660SKu.LIZJ;
            if (c719660SKu.LJJIFFI()) {
                if (str != null && (interfaceC719700SKy = c719660SKu.LJJZ) != null) {
                    interfaceC719700SKy.LIZLLL(str, false, null, null);
                }
                InterfaceC719700SKy interfaceC719700SKy2 = c719660SKu.LJJZ;
                View viewUf = interfaceC719700SKy2 != null ? interfaceC719700SKy2.Uf() : null;
                if ((viewUf instanceof C705790RmL) && (abstractC705690RmB = (AbstractC705690RmB) viewUf) != null && (anchorShowListeners2 = abstractC705690RmB.getAnchorShowListeners()) != null) {
                    anchorShowListeners2.remove(c719660SKu);
                }
            }
            BPEAHandler bPEAHandler2 = c719660SKu.LJJLIL;
            if (bPEAHandler2 != null) {
                bPEAHandler2.removeCallbacksAndMessages(null);
            }
            c719660SKu.LJJLJ = null;
            c719660SKu.LJJLJLI = null;
            c719660SKu.LJJLL = null;
            ViewOnLayoutChangeListenerC738720SyM viewOnLayoutChangeListenerC738720SyM = c719660SKu.LJLJLLL;
            if (viewOnLayoutChangeListenerC738720SyM != null) {
                View view = c719660SKu.LJJJJZ;
                if (view != null) {
                    view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC738720SyM);
                }
                c719660SKu.LJLJLLL = null;
            }
            View view2 = c719660SKu.LJJJJZ;
            if ((view2 instanceof C705790RmL) && (anchorShowListeners = ((AbstractC705690RmB) view2).getAnchorShowListeners()) != null) {
                anchorShowListeners.remove(c719660SKu);
            }
            c719660SKu.LJJJJZI(null);
            c719660SKu.LJ = null;
            c719660SKu.LJI = false;
            c719660SKu.LJIIZILJ = null;
            c719660SKu.LJIJ = null;
            c719660SKu.LJIJI = null;
            c719660SKu.LJIJJ = null;
            c719660SKu.LJIIIIZZ = null;
            c719660SKu.LJIIJ = false;
            c719660SKu.LJIIJJI = false;
            c719660SKu.LJIIL = false;
            c719660SKu.LJIJJLI = null;
            c719660SKu.LJLIL = false;
            c719660SKu.LJLJLJ = false;
            c719660SKu.LJIILIIL = null;
            c719660SKu.LJIILJJIL = null;
            c719660SKu.LJIL = null;
            c719660SKu.LJJLIIIJLJLI = 0;
            c719660SKu.LJJLIIIJL = 0;
            c719660SKu.LJJLIIIJLLLLLLLZ = 0;
            c719660SKu.LJJLIIJ = false;
            c719660SKu.LJJLIIIJ = 0;
            c719660SKu.LJJJJLI = 0;
            c719660SKu.LJJJJL = 0;
            c719660SKu.LJJJJLL = 0;
            c719660SKu.LJIILL = 0;
            c719660SKu.LJJ = 0;
            c719660SKu.LJJJJJL = null;
            ((Set) c719660SKu.LJJJ.getValue()).clear();
            CopyOnWriteArraySet<View> copyOnWriteArraySet = c719660SKu.LJJJI;
            if (copyOnWriteArraySet != null) {
                copyOnWriteArraySet.clear();
            }
            C719530SKh c719530SKh = c719660SKu.LIZIZ;
            if (c719530SKh != null) {
                c719530SKh.LJI.clear();
                c719530SKh.LIZJ = null;
                c719530SKh.LIZLLL = null;
                c719530SKh.LJ = null;
                c719530SKh.LJFF = 0;
            }
        }
        PhotoClearModeOwnerAbility photoClearModeOwnerAbility = (PhotoClearModeOwnerAbility) this.LLLIL.getValue();
        if (photoClearModeOwnerAbility != null) {
            photoClearModeOwnerAbility.TD0(this);
        }
        C719720SLa.LIZJ(this.LLLLIL);
        zp().TQ2(null);
        if (C0SLF.LIZ && C0SLF.LJFF) {
            String str2 = C0SLF.LIZLLL;
            boolean z = str2 == null || Intrinsics.LJFF(str2, "HOME");
            String str3 = C0SLF.LJ;
            if (z) {
                if (str3 != null) {
                    try {
                        if (!C0SLF.LIZLLL(str3)) {
                            return;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1AF0.LJFF(th, "PhotoKita run error");
                        return;
                    }
                }
                if (C0SLF.LIZIZ) {
                    C08H2.LIZJ();
                    C0SLF.LIZIZ = false;
                }
            }
        }
    }

    public final InterfaceC696720RUo up() {
        InterfaceC696720RUo interfaceC696720RUo;
        InterfaceC696720RUo interfaceC696720RUo2 = this.LLLLJI;
        if (interfaceC696720RUo2 == null) {
            synchronized (this) {
                interfaceC696720RUo2 = this.LLLLJI;
                if (interfaceC696720RUo2 == null) {
                    C0QSJ c0qsjKp = kp();
                    if (c0qsjKp != null) {
                        interfaceC696720RUo = (InterfaceC696720RUo) c0qsjKp.getAbility(InterfaceC696720RUo.class);
                        C687700QyG.LJ(interfaceC696720RUo, InterfaceC696720RUo.class);
                    } else {
                        interfaceC696720RUo = null;
                    }
                    this.LLLLJI = interfaceC696720RUo;
                    return interfaceC696720RUo;
                }
            }
        }
        return interfaceC696720RUo2;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final int xt0() {
        C0SLX c0slx = this.LLLFF;
        if (c0slx != null) {
            return c0slx.getCurrentItem();
        }
        return -1;
    }

    public final C0SKV yp() {
        C0SKV c0skv = this.LLLLLIL;
        if (c0skv == null) {
            synchronized (this) {
                c0skv = this.LLLLLIL;
                if (c0skv == null) {
                    C0QSJ c0qsjKp = kp();
                    C0SKV c0skv2 = c0qsjKp != null ? (C0SKV) c0qsjKp.getAbility(C0SKV.class) : null;
                    this.LLLLLIL = c0skv2;
                    return c0skv2;
                }
            }
        }
        return c0skv;
    }

    public final PhotoViewModelV2 zp() {
        return (PhotoViewModelV2) this.LLJJL.getValue();
    }

    public PhotoSlideViewPagerComponent() {
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 1057);
        this.LLJJLIIIJLLLLLLLZ = new C736950SvV(C13LE.LIZ(PhotoSharedViewModel.class), awS555S0100000_11, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS243S0000000_11.get$arr$(530), new AwS555S0100000_11((AbstractC738140SxQ) this, 1064), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1056));
        this.LLJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1058));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1060));
        this.LLJLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1065));
        this.LLJLLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1062));
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJZ = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 1054));
        this.LLJZIJLIL = C161N.LIZIZ.LLIFFJFJJ(this);
        this.LLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(234));
        this.LLLF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1052));
        this.LLLIL = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 1053));
        this.LLLILZ = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 1061));
        this.LLLILZJ = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 1059));
        this.LLLIZZ = -1;
        this.LLLJ = true;
        this.LLLLIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1066));
        this.LLLLIILL = this;
        this.LLLLIILLL = this;
        this.LLLLIL = new AwS555S0100000_11(this, 1055);
        this.LLLLILI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1063));
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final int Al() {
        return tp();
    }

    public final boolean Ep() {
        if (C294910BhB.LIZ()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
            if (aweme == null || !aweme.isAd()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final Rect Gi2() {
        PhotosViewHolderV3 photosViewHolderV3LLJLLL = LLJLLL();
        Rect rectLIZIZ = null;
        SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2 = photosViewHolderV3LLJLLL instanceof SmartImagePhotoViewHolderV2 ? (SmartImagePhotoViewHolderV2) photosViewHolderV3LLJLLL : null;
        if (smartImagePhotoViewHolderV2 != null) {
            try {
                C695660RQm c695660RQm = C695660RQm.LIZ;
                ViewGroup viewGroup = smartImagePhotoViewHolderV2.LLJLL;
                c695660RQm.getClass();
                rectLIZIZ = C695660RQm.LIZIZ(viewGroup);
                return rectLIZIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return rectLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final View.OnTouchListener Hg() {
        PhotosViewHolderV3 photosViewHolderV3LLJLLL = LLJLLL();
        if (photosViewHolderV3LLJLLL != null) {
            return photosViewHolderV3LLJLLL.Hg();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final int K91() {
        return zp().AQ2();
    }

    @Override // X.InterfaceC1211910hdt
    public final MainPageBusinessAbility Ub() {
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558520qew.LJIIL(this), MainActivityScope.class);
        Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(MainPageBusinessAbility.class) : null;
        return (MainPageBusinessAbility) (ability instanceof MainPageBusinessAbility ? ability : null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Zo() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final ImageView.ScaleType getScaleType() {
        SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2;
        ImageView.ScaleType scaleType;
        PhotosViewHolderV3 photosViewHolderV3LLJLLL = LLJLLL();
        return (!(photosViewHolderV3LLJLLL instanceof SmartImagePhotoViewHolderV2) || (smartImagePhotoViewHolderV2 = (SmartImagePhotoViewHolderV2) photosViewHolderV3LLJLLL) == null || (scaleType = smartImagePhotoViewHolderV2.LLLILZ) == null) ? ImageView.ScaleType.FIT_CENTER : scaleType;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ip() {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideViewPagerComponent.ip():void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final int tp() {
        return zp().zQ2();
    }

    @Override // X.C0S9L, com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final InterfaceC710220RtU yn() {
        return this.LLLJIL;
    }

    public final void Bp(boolean z) {
        ViewGroup viewGroup;
        TuxTextView tuxTextView = this.LLLFZ;
        if (tuxTextView == null) {
            return;
        }
        ViewParent parent = tuxTextView.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(tuxTextView, viewGroup);
        }
        this.LLLFZ = null;
        if (z) {
            Ip(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final void Cq1(View view) {
        if (view != null && (view instanceof C709030RrZ)) {
            ((C709030RrZ) view).setHorizontalSwipeForwarder((InterfaceC709040Rra) this.LLLLILI.getValue());
        }
    }

    public final void Fp(int i) {
        onPageSelected(i);
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), PhotoOnPageSelectedInterceptProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                ((PhotoOnPageSelectedInterceptProtocol) it2.next()).rg0(i);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final void G91(int i) {
        Fp(i);
        O0(i, false, true);
    }

    public final void Gp(boolean z) {
        int i;
        Object c098200Yq;
        Object parent = null;
        if (z) {
            if (!Ep()) {
                return;
            }
            try {
                c098200Yq = Boolean.valueOf(zp().LLJJJJ);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            if (!Intrinsics.LJFF(c098200Yq, Boolean.TRUE)) {
                return;
            }
            PhotoClearModeOwnerAbility photoClearModeOwnerAbility = (PhotoClearModeOwnerAbility) this.LLLIL.getValue();
            if (photoClearModeOwnerAbility != null) {
                photoClearModeOwnerAbility.s91(this);
            }
        } else {
            PhotoClearModeOwnerAbility photoClearModeOwnerAbility2 = (PhotoClearModeOwnerAbility) this.LLLIL.getValue();
            if (photoClearModeOwnerAbility2 != null) {
                photoClearModeOwnerAbility2.TD0(this);
            }
        }
        C0SLX c0slx = this.LLLFF;
        if (c0slx != null) {
            parent = c0slx.getParent();
        }
        if (parent instanceof ViewGroup) {
            View view = (View) parent;
            while (view != null) {
                View viewFindViewById = view.findViewById(R.id.i8r);
                if (viewFindViewById != null) {
                    if (z) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    C786410Ut5.LJLLLLLL(i, viewFindViewById);
                    return;
                }
                Object parent2 = view.getParent();
                if (!(parent2 instanceof ViewGroup)) {
                    return;
                } else {
                    view = (View) parent2;
                }
            }
        }
    }

    @Override // X.InterfaceC1211910hdt
    public final void Ic(View view) {
        View viewFindViewById = view.findViewById(R.id.qbu);
        C0SOW c0sow = this.LLLIIIL;
        if (viewFindViewById != null && c0sow != null) {
            ((ArrayList) c0sow.LLJJIJI).remove(viewFindViewById);
        }
        this.LLLIIIL = null;
        View view2 = this.LLLIIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(this.LLLIILIL, view2);
        }
        this.LLLIIL = null;
        this.LLLIILIL = 0;
        View viewFindViewById2 = view.findViewById(R.id.qbt);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(null, viewFindViewById2);
        }
        View viewFindViewById3 = view.findViewById(R.id.qby);
        if (viewFindViewById3 != null) {
            C786410Ut5.I7(null, viewFindViewById3);
        }
        View viewFindViewById4 = view.findViewById(R.id.qbv);
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnTouchListener(null);
        }
        this.LLLIIII = null;
        if (this.LLLIIIIL == view) {
            this.LLLIIIIL = null;
        }
    }

    public final void Ip(boolean z) {
        int i;
        C0SLX c0slx = this.LLLFF;
        if (c0slx == null) {
            return;
        }
        Object parent = c0slx.getParent();
        View viewFindViewById = null;
        if (parent instanceof View) {
            View view = (View) parent;
            while (view != null) {
                if (viewFindViewById != null) {
                    break;
                }
                viewFindViewById = view.findViewById(R.id.qed);
                Object parent2 = view.getParent();
                if (!(parent2 instanceof View)) {
                    break;
                } else {
                    view = (View) parent2;
                }
            }
            if (viewFindViewById == null) {
                return;
            }
            if (z) {
                if (zp().AQ2() > 1) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, viewFindViewById);
                return;
            }
            C786410Ut5.LJLLLLLL(4, viewFindViewById);
        }
    }

    public final void Jp(boolean z) {
        final C0SLX c0slx;
        final int i;
        PagerAdapter adapter;
        if (z || (c0slx = this.LLLFF) == null) {
            return;
        }
        final int paddingStart = c0slx.getPaddingStart();
        final int paddingEnd = c0slx.getPaddingEnd();
        final int i2 = this.LLLL;
        final int i3 = this.LLLLII;
        if (paddingStart == i2 && paddingEnd == i3) {
            return;
        }
        int width = (c0slx.getWidth() - i2) - i3;
        final int scrollX = c0slx.getScrollX();
        C719660SKu c719660SKu = this.LLLJIL;
        if (c719660SKu != null) {
            int currentItem = c0slx.getCurrentItem();
            C21600219g8 c21600219g8 = c719660SKu.LJJZZI;
            if (c21600219g8 != null) {
                adapter = c21600219g8.getAdapter();
            } else {
                adapter = null;
            }
            i = width * currentItem;
            if (adapter != null) {
                if (adapter.getCount() > 1 && currentItem == adapter.getCount() - 1) {
                    if (c719660SKu.LJJL == 0) {
                        i = (i - c719660SKu.LJJLIIIJJIZ) + C719660SKu.LJLLJ;
                    }
                } else if (adapter.getCount() > 1 && currentItem != 0) {
                    i -= c719660SKu.LJJLIIIJ;
                }
            }
        } else {
            i = 0;
        }
        ValueAnimator valueAnimator = this.LLLLIIIILLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c0slx.getScroller().abortAnimation();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0SL6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                int i4 = paddingStart;
                int i5 = i2;
                int i6 = (int) (i4 + ((i5 - i4) * fFloatValue));
                int i7 = paddingEnd;
                int i8 = (int) (i7 + ((r1 - i7) * fFloatValue));
                int i9 = i3 + i5;
                if (i9 != 0) {
                    fFloatValue = (i6 + i8) / i9;
                }
                int i10 = (int) (scrollX + ((i - r2) * fFloatValue));
                C0SLX c0slx2 = c0slx;
                C426750GoL.LJIIL(c0slx2, Integer.valueOf(i6), null, Integer.valueOf(i8), null, 26);
                c0slx2.setScrollX(i10);
            }
        });
        valueAnimatorOfFloat.start();
        this.LLLLIIIILLL = valueAnimatorOfFloat;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        Object obj;
        if ((i != 3 && i != 2 && i != 1) || !this.LLLI) {
            return;
        }
        if (i == 3 && Ep()) {
            return;
        }
        int type = EnumC1616310sA9.SWITCH_PAGE.getType();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        C714060Rzg c714060Rzg = new C714060Rzg(false, type, "", ((VideoItemParams) obj).mEventType);
        if (Ep()) {
            this.LLLII = c714060Rzg;
        }
        C1440005kM.LIZ(c714060Rzg);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final void ML0(boolean z) {
        C0SLX c0slx = this.LLLFF;
        if (c0slx != null) {
            c0slx.setSlideSupported(!z);
        }
    }

    public final void Qp(int i) {
        Object obj;
        if (C295890Bil.LIZIZ()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (!AwemeExtKt.isAdTraffic(((VideoItemParams) obj).getAweme())) {
                if (i == tp() - 1) {
                    HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), HomePageViewPagerAbility.class, null);
                    if (homePageViewPagerAbility != null) {
                        homePageViewPagerAbility.ju(C295890Bil.LIZ());
                        return;
                    }
                    return;
                }
                HomePageViewPagerAbility homePageViewPagerAbility2 = (HomePageViewPagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), HomePageViewPagerAbility.class, null);
                if (homePageViewPagerAbility2 == null) {
                    return;
                }
                homePageViewPagerAbility2.ju(C1570380qy4.LIZ().leftAngle);
            }
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PhotoSlideScope.class});
        c0qsjLIZIZ.unbindAbility(this.LLLLIIL.getValue(), InterfaceC717040SAs.class);
        c0qsjLIZIZ.unbindAbility(this.LLLLIILL, C0S9L.class);
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class}).unbindAbility(this.LLLLIILLL, IPhotoSlidesAbility.class);
    }

    @Override // X.InterfaceC1211910hdt
    public final View e9(ViewGroup viewGroup) {
        Object c098200Yq;
        boolean zBooleanValue;
        Object obj;
        int i;
        try {
            c098200Yq = Boolean.valueOf(zp().LLJJJJ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C0SOW c0sow = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (!zBooleanValue) {
            return null;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e_e, viewGroup, false);
        this.LLLIIIIL = viewTd;
        View viewFindViewById = viewTd.findViewById(R.id.qbt);
        View viewFindViewById2 = viewTd.findViewById(R.id.qby);
        TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.qbz);
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (C720360SNm.LJIIIZ(((VideoItemParams) obj).getAweme())) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById2);
        this.LLLIIII = tuxIconView;
        Tp();
        C2271391DvN.LIZ(viewFindViewById, C2271381DvM.LIZIZ());
        C2271391DvN.LIZ(viewFindViewById2, C2271381DvM.LIZIZ());
        C786410Ut5.I7(new ACListenerS146S0100000_11(this, 38), viewFindViewById);
        C786410Ut5.I7(new ACListenerS146S0100000_11(this, 39), viewFindViewById2);
        final View viewFindViewById3 = viewTd.findViewById(R.id.qbv);
        C0SOW c0sow2 = (C0SOW) viewTd.findViewById(R.id.qbu);
        View viewLp = lp();
        if (viewLp != null) {
            c0sow = (C0SOW) viewLp.findViewById(R.id.qed);
        }
        View viewLp2 = lp();
        if (c0sow != null && zp().AQ2() > 1) {
            int visibility = c0sow2.getVisibility();
            c0sow2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c0sow2);
            c0sow.LIZ(c0sow2);
            this.LLLIIIL = c0sow;
        } else {
            int visibility2 = c0sow2.getVisibility();
            c0sow2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c0sow2);
        }
        if (viewLp2 != null) {
            this.LLLIIL = viewLp2;
            this.LLLIILIL = viewLp2.getVisibility();
            C786410Ut5.LJLLLLLL(4, viewLp2);
        }
        C2271391DvN.LIZ(viewFindViewById3, (C1A5L) C2271381DvM.LLLLLLL.getValue());
        final View viewFindViewById4 = viewTd.findViewById(R.id.qbw);
        final AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 1048);
        final AwS555S0100000_11 awS555S0100000_112 = new AwS555S0100000_11(this, 1049);
        final AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(this, 293);
        final AwS555S0100000_11 awS555S0100000_113 = new AwS555S0100000_11(this, 1050);
        final AwS555S0100000_11 awS555S0100000_114 = new AwS555S0100000_11(this, 1051);
        final C013C c013c = new C013C();
        final C817403Hg c817403Hg = new C817403Hg();
        final C118300cf c118300cf = new C118300cf();
        final C259800zU c259800zU = new C259800zU();
        viewFindViewById3.setOnTouchListener(new View.OnTouchListener() { // from class: X.0HIc
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
                /*
                    Method dump skipped, instruction units count: 492
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC438680HIc.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
        return viewTd;
    }

    public final void hp(boolean z) {
        SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2;
        C719880SLq c719880SLq = this.LLLFFI;
        if (c719880SLq != null) {
            int iLJJIJIL = c719880SLq.LJJIJIL();
            for (int i = 0; i < iLJJIJIL; i++) {
                InterfaceC719460SKa interfaceC719460SKaRq2 = this.LLLLIILLL.rq2(i);
                if ((interfaceC719460SKaRq2 instanceof SmartImagePhotoViewHolderV2) && (smartImagePhotoViewHolderV2 = (SmartImagePhotoViewHolderV2) interfaceC719460SKaRq2) != null) {
                    SmartImagePhotoViewHolderV2.LJJLL(smartImagePhotoViewHolderV2, z, true, 4);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final void mh0(MotionEvent motionEvent) {
        C0SLX c0slx;
        if ((motionEvent.getAction() == 0 || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (c0slx = this.LLLFF) != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3) {
                    c0slx.LLLLZIL = false;
                }
            } else {
                c0slx.LLLLZIL = true;
            }
        }
        C0SLX c0slx2 = this.LLLFF;
        if (c0slx2 != null) {
            c0slx2.onTouchEvent(motionEvent);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onClearModeEvent(C714060Rzg c714060Rzg) {
        Object obj;
        Object c098200Yq;
        boolean zBooleanValue;
        boolean z;
        Object obj2;
        PhotosViewHolderV3 photosViewHolderV3LJJJJJ;
        SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2;
        boolean z2;
        String str = c714060Rzg.LIZLLL;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (!TextUtils.equals(str, ((VideoItemParams) obj).mEventType)) {
            return;
        }
        try {
            c098200Yq = Boolean.valueOf(zp().LLJJJJ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        boolean z3 = this.LLLI;
        if (c714060Rzg == this.LLLII) {
            z = true;
            this.LLLII = null;
        } else {
            z = false;
        }
        if (!c714060Rzg.LIZ && c714060Rzg.LIZIZ == EnumC1616310sA9.SWITCH_PAGE.getType() && zBooleanValue && z3 && !z) {
            return;
        }
        if (c714060Rzg.LIZ) {
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            if (C586380MzE.LIZ().LIZLLL) {
                return;
            }
        }
        boolean z4 = c714060Rzg.LIZ;
        this.LLLI = z4;
        if (!z4 || this.LLLFZ != null) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            String str2 = ((VideoItemParams) obj2).mEventType;
            String str3 = c714060Rzg.LIZJ;
            if (str3.length() == 0) {
                str3 = "other_way";
            }
            C585960MyY.LIZ(str2, str3, "");
            Bp(!c714060Rzg.LIZ);
            C0SLX c0slx = this.LLLFF;
            if (c0slx != null) {
                int currentItem = c0slx.getCurrentItem();
                C719880SLq c719880SLq = this.LLLFFI;
                if (c719880SLq != null) {
                    photosViewHolderV3LJJJJJ = c719880SLq.LJJJJJ(currentItem);
                } else {
                    photosViewHolderV3LJJJJJ = null;
                }
                if ((photosViewHolderV3LJJJJJ instanceof SmartImagePhotoViewHolderV2) && (smartImagePhotoViewHolderV2 = (SmartImagePhotoViewHolderV2) photosViewHolderV3LJJJJJ) != null) {
                    C0SMD c0smd = SmartImagePhotoViewHolderV2.LLLLLLIL;
                    smartImagePhotoViewHolderV2.LJJJJLI(true);
                }
            }
        }
        if (!Ep()) {
            C719660SKu c719660SKu = this.LLLJIL;
            if (c719660SKu != null && c719660SKu.LJJJLIIL) {
                c719660SKu.LJJJJJ(new C0SL8(this), c714060Rzg.LIZ);
                return;
            }
            return;
        }
        boolean z5 = c714060Rzg.LIZ;
        if ((!z5 || !z3) && zp().LLJJIII) {
            zp().LLJJIII = false;
            ((C0N0Y) this.LLLILZ.getValue()).LJIJJ();
        }
        Gp(z5);
        if (c714060Rzg.LIZ && c714060Rzg.LIZIZ == EnumC1616310sA9.PINCH_ZOOM.getType()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c714060Rzg.LIZ) {
            if (zBooleanValue) {
                if (!z2) {
                    hp(true);
                }
                C0SLX c0slx2 = this.LLLFF;
                if (c0slx2 != null) {
                    Object parent = c0slx2.getParent();
                    Object obj3 = c0slx2;
                    while (true) {
                        if (!(parent instanceof ViewGroup)) {
                            break;
                        }
                        if (Intrinsics.LJFF(obj3.getClass().getSimpleName(), "VideoViewCellRootView")) {
                            List<View> arrayList = this.LLLLJ;
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                            }
                            ViewGroup viewGroup = (ViewGroup) parent;
                            int childCount = viewGroup.getChildCount();
                            for (int i = 0; i < childCount; i++) {
                                View childAt = viewGroup.getChildAt(i);
                                if (childAt != obj3 && childAt.getVisibility() == 0) {
                                    C786410Ut5.LJLLLLLL(4, childAt);
                                    if (!arrayList.contains(childAt)) {
                                        arrayList.add(childAt);
                                    }
                                }
                            }
                            this.LLLLJ = arrayList;
                        } else {
                            obj3 = parent;
                            parent = ((View) parent).getParent();
                        }
                    }
                }
            }
        } else {
            hp(false);
            List<View> list = this.LLLLJ;
            if (list != null) {
                Iterator<View> it2 = list.iterator();
                while (it2.hasNext()) {
                    C786410Ut5.LJLLLLLL(0, it2.next());
                }
            }
            this.LLLLJ = null;
        }
        C719660SKu c719660SKu2 = this.LLLJIL;
        if (c719660SKu2 != null && c719660SKu2.LJJJLIIL) {
            c719660SKu2.LJJJJJ(new C0SL9(this), c714060Rzg.LIZ);
        }
        ep(c714060Rzg.LIZ, null);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        int iIntValue;
        int currentItem;
        InteractAreaCommonAbility interactAreaCommonAbility;
        SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2;
        int iIntValue2 = 0;
        if (i != 0) {
            if (i == 1) {
                if (!C20737116Cr.LIZJ()) {
                    iIntValue2 = ((Number) C0ADZ.LIZ.getValue()).intValue();
                }
                C1904180zeS.LIZ(iIntValue2, true);
                zp().MQ2();
                return;
            }
            return;
        }
        if (!C20737116Cr.LIZJ()) {
            iIntValue = ((Number) C0ADZ.LIZ.getValue()).intValue();
        } else {
            iIntValue = 0;
        }
        C1904180zeS.LIZ(iIntValue, false);
        C0SLX c0slx = this.LLLFF;
        if (c0slx != null) {
            currentItem = c0slx.getCurrentItem();
        } else {
            currentItem = 0;
        }
        C719880SLq c719880SLq = this.LLLFFI;
        if (c719880SLq != null) {
            c719880SLq.LJJJJLL(currentItem);
        }
        Object obj = null;
        if (Ep()) {
            InterfaceC719460SKa interfaceC719460SKaRq2 = this.LLLLIILLL.rq2(currentItem);
            if ((interfaceC719460SKaRq2 instanceof SmartImagePhotoViewHolderV2) && (smartImagePhotoViewHolderV2 = (SmartImagePhotoViewHolderV2) interfaceC719460SKaRq2) != null) {
                SmartImagePhotoViewHolderV2.LJJLL(smartImagePhotoViewHolderV2, this.LLLI, false, 6);
                if (this.LLLI) {
                    smartImagePhotoViewHolderV2.LJJLJLI(false);
                    smartImagePhotoViewHolderV2.LJJZ();
                }
            }
        }
        if (((Boolean) C0AU4.LIZ.getValue()).booleanValue()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            }
            if (!((VideoItemParams) obj).getAweme().isSubOnlyVideo() && (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJLIL.getValue()) != null) {
                interactAreaCommonAbility.Xz2(EnumC706820Ro0.RIGHT_AREA, true, null, false, null);
            }
        } else {
            InteractAreaCommonAbility interactAreaCommonAbility2 = (InteractAreaCommonAbility) this.LLJLIL.getValue();
            if (interactAreaCommonAbility2 != null) {
                interactAreaCommonAbility2.Xz2(EnumC706820Ro0.RIGHT_AREA, true, null, false, null);
            }
        }
        PhotoViewModelV2 photoViewModelV2Zp = zp();
        photoViewModelV2Zp.getClass();
        photoViewModelV2Zp.withState(new AwS590S0100000_11(photoViewModelV2Zp, 590));
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011a  */
    @Override // X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r9) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideViewPagerComponent.onPageSelected(int):void");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C719660SKu c719660SKu;
        View decorView;
        ViewGroup viewGroup;
        C0SMC c0smc;
        Object obj;
        boolean z;
        C19EG activity;
        Window window;
        final C0SLX c0slx = (C0SLX) view.findViewById(R.id.qez);
        this.LLLFF = c0slx;
        String strLIZ = null;
        if (c0slx != null) {
            c0slx.setSlideSupported(true);
            c0slx.LIZLLL(this);
            InterfaceC720380SNo interfaceC720380SNo = new InterfaceC720380SNo() { // from class: X.0SKz
                @Override // X.InterfaceC720380SNo
                public final void Ei() {
                    c0slx.setSwipingOnImage(true);
                }

                @Override // X.InterfaceC720380SNo
                public final void onTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent == null || ((CommentService) ServiceManager.get().getService(CommentService.class)).LLFFF(this.LL.getContext())) {
                        return;
                    }
                    C0SLX c0slx2 = c0slx;
                    c0slx2.getClass();
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action == 1 || action == 3) {
                            c0slx2.LLLLZIL = false;
                        }
                    } else {
                        c0slx2.LLLLZIL = true;
                    }
                    List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this.LL), PhotoTouchInterceptorProtocol.class, false);
                    if (listLIZIZ != null) {
                        Iterator it2 = ((ArrayList) listLIZIZ).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC720380SNo) it2.next()).onTouchEvent(motionEvent);
                        }
                    }
                }
            };
            C0SLJ c0slj = new C0SLJ() { // from class: X.0SLB
                @Override // X.C0SLJ
                public final PointF LLILIL() {
                    return null;
                }

                @Override // X.C0SLJ
                public final void LLLL() {
                }

                @Override // X.C0SLJ
                public final void Ld() {
                }

                @Override // X.C0SLJ
                public final float x7() {
                    return 1.0f;
                }

                @Override // X.C0SLJ
                public final void N() {
                    C0SLJ c0sljMp = this.LL.mp();
                    if (c0sljMp != null) {
                        c0sljMp.N();
                    }
                }

                @Override // X.C0SLJ
                public final void n(float f) {
                    float f2 = 0.0f;
                    if (f <= 0.0f) {
                        f2 = 1.0f;
                    }
                    View view2 = this.LL.LLLIIIIL;
                    if (view2 != null) {
                        C786410Ut5.T4(view2, f2);
                    }
                    TuxTextView tuxTextView = this.LL.LLLFZ;
                    if (tuxTextView != null) {
                        C786410Ut5.T4(tuxTextView, f2);
                    }
                    C0SLJ c0sljMp = this.LL.mp();
                    if (c0sljMp != null) {
                        c0sljMp.n(f);
                    }
                }

                @Override // X.C0SLJ
                public final void Na(float f, boolean z2, EnumC719760SLe enumC719760SLe) {
                    if (this.LL.Ep()) {
                        if (enumC719760SLe != EnumC719760SLe.NORMAL) {
                            this.LL.ip();
                        } else {
                            this.LL.hp(false);
                        }
                    }
                    C0SLJ c0sljMp = this.LL.mp();
                    if (c0sljMp != null) {
                        c0sljMp.Na(f, z2, enumC719760SLe);
                    }
                }

                @Override // X.C0SLJ
                public final void w2(float f, boolean z2, EnumC719760SLe enumC719760SLe, float f2, String str, String str2) {
                    ViewParent parent;
                    ViewGroup viewGroup2;
                    float translationZ;
                    int iN3;
                    View viewFindViewById;
                    int i = C0SLC.LIZ[enumC719760SLe.ordinal()];
                    if (i != 1) {
                        String str3 = "pinch";
                        if (i != 2) {
                            if (i == 3) {
                                String str4 = ((VideoItemParams) C631370Opb.LIZ(this.LL)).mEventType;
                                if (str2 != null) {
                                    str3 = str2;
                                }
                                C585960MyY.LIZ(str4, str3, "");
                                this.LL.Bp(false);
                                this.LL.Gp(true);
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            String str5 = ((VideoItemParams) C631370Opb.LIZ(this.LL)).mEventType;
                            if (str2 != null) {
                                str3 = str2;
                            }
                            C585960MyY.LIZ(str5, str3, "");
                            this.LL.Bp(true);
                        }
                    } else {
                        C585960MyY.LIZ = System.currentTimeMillis();
                        this.LL.Gp(false);
                        PhotoSlideViewPagerComponent photoSlideViewPagerComponent = this.LL;
                        if (photoSlideViewPagerComponent.LLLFZ == null) {
                            C0SLX c0slx2 = photoSlideViewPagerComponent.LLLFF;
                            ViewGroup viewGroup3 = null;
                            if (c0slx2 != null) {
                                parent = c0slx2.getParent();
                            } else {
                                parent = null;
                            }
                            if ((parent instanceof ConstraintLayout) && (viewGroup2 = (ViewGroup) parent) != null) {
                                photoSlideViewPagerComponent.Ip(false);
                                TuxTextView tuxTextView = new TuxTextView(viewGroup2.getContext(), null, 6, 0);
                                tuxTextView.setId(View.generateViewId());
                                tuxTextView.setText(2131829323);
                                tuxTextView.setTextColor(-1);
                                tuxTextView.setTextSize(14.0f);
                                tuxTextView.setTypeface(Typeface.DEFAULT_BOLD);
                                tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                                tuxTextView.setBackgroundResource(R.drawable.cww);
                                tuxTextView.setGravity(17);
                                C786410Ut5.h9(tuxTextView, new ACListenerS146S0100000_11(photoSlideViewPagerComponent, 98));
                                C2271391DvN.LIZ(tuxTextView, C2271381DvM.LIZIZ());
                                Context context = viewGroup2.getContext();
                                View rootView = viewGroup2.getRootView();
                                if (rootView != null && (iN3 = C786410Ut5.n3(context.getResources(), "immersive_bottom_container", FollowStatusChangeMethod.PARAM_UID, context.getPackageName())) != 0 && (viewFindViewById = rootView.findViewById(iN3)) != null) {
                                    ViewParent parent2 = viewFindViewById.getParent();
                                    if (parent2 instanceof FrameLayout) {
                                        viewGroup3 = (ViewGroup) parent2;
                                    }
                                }
                                if (viewGroup3 != null) {
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388691);
                                    layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
                                    layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                                    viewGroup3.addView(tuxTextView, layoutParams);
                                } else {
                                    C19ME c19me = new C19ME(-2, -2);
                                    c19me.bottomToBottom = 0;
                                    c19me.startToStart = 0;
                                    ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
                                    c19me.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                                    viewGroup2.addView(tuxTextView, c19me);
                                }
                                photoSlideViewPagerComponent.LLLFZ = tuxTextView;
                                C0SLX c0slx3 = photoSlideViewPagerComponent.LLLFF;
                                if (c0slx3 != null) {
                                    translationZ = c0slx3.getTranslationZ();
                                } else {
                                    translationZ = 0.0f;
                                }
                                tuxTextView.setTranslationZ(translationZ);
                                C786410Ut5.B5(tuxTextView, 0.0f);
                                tuxTextView.animate().alpha(1.0f).setDuration(200L).start();
                            }
                        }
                    }
                    C0SLJ c0sljMp = this.LL.mp();
                    if (c0sljMp != null) {
                        c0sljMp.w2(f, z2, enumC719760SLe, f2, str, str2);
                    }
                }
            };
            PhotoViewModelV2 photoViewModelV2Zp = zp();
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (activity = fragmentLJI.getActivity()) != null && (window = activity.getWindow()) != null) {
                decorView = window.getDecorView();
            } else {
                decorView = null;
            }
            if (decorView instanceof ViewGroup) {
                viewGroup = (ViewGroup) decorView;
            } else {
                viewGroup = null;
            }
            InterfaceC719500SKe interfaceC719500SKe = new InterfaceC719500SKe() { // from class: X.0SKd
                @Override // X.InterfaceC719500SKe
                public final void p2(SlidesImageLoadParams slidesImageLoadParams) {
                    CopyOnWriteArrayList<SlidesImageLoadParams> copyOnWriteArrayList;
                    this.LL.zp().GQ2(slidesImageLoadParams);
                    PhotoSlideViewPagerComponent photoSlideViewPagerComponent = this.LL;
                    C719880SLq c719880SLq = photoSlideViewPagerComponent.LLLFFI;
                    if (c719880SLq != null) {
                        int i = slidesImageLoadParams.index;
                        int i2 = photoSlideViewPagerComponent.zp().LLJJJJJIL;
                        if (i2 != 0) {
                            i /= i2;
                        }
                        PhotosViewHolderV3 photosViewHolderV3LJJJJJ = c719880SLq.LJJJJJ(i);
                        if (photosViewHolderV3LJJJJJ != null && (copyOnWriteArrayList = photosViewHolderV3LJJJJJ.LLJJJJJIL) != null) {
                            copyOnWriteArrayList.add(slidesImageLoadParams);
                        }
                    }
                    C0SKV c0skvYp = this.LL.yp();
                    if (c0skvYp != null) {
                        c0skvYp.p2(slidesImageLoadParams);
                    }
                }

                @Override // X.InterfaceC719500SKe
                public final void u6(SlidesImageLoadParams slidesImageLoadParams) {
                    CopyOnWriteArrayList<SlidesImageLoadParams> copyOnWriteArrayList;
                    PhotoViewModelV2 photoViewModelV2Zp2 = this.LL.zp();
                    photoViewModelV2Zp2.getClass();
                    photoViewModelV2Zp2.withState(new AwS377S0200000_11(photoViewModelV2Zp2, slidesImageLoadParams, 169));
                    PhotoSlideViewPagerComponent photoSlideViewPagerComponent = this.LL;
                    C719880SLq c719880SLq = photoSlideViewPagerComponent.LLLFFI;
                    if (c719880SLq != null) {
                        int i = slidesImageLoadParams.index;
                        int i2 = photoSlideViewPagerComponent.zp().LLJJJJJIL;
                        if (i2 != 0) {
                            i /= i2;
                        }
                        PhotosViewHolderV3 photosViewHolderV3LJJJJJ = c719880SLq.LJJJJJ(i);
                        if (photosViewHolderV3LJJJJJ != null && (copyOnWriteArrayList = photosViewHolderV3LJJJJJ.LLJJJJJIL) != null) {
                            copyOnWriteArrayList.add(slidesImageLoadParams);
                        }
                    }
                    C0SKV c0skvYp = this.LL.yp();
                    if (c0skvYp != null) {
                        c0skvYp.u6(slidesImageLoadParams);
                    }
                }

                @Override // X.InterfaceC719500SKe
                public final void n5(int i, JSONObject jSONObject) {
                    C0SKV c0skvYp = this.LL.yp();
                    if (c0skvYp != null) {
                        c0skvYp.n5(i, jSONObject);
                    }
                }
            };
            C0SM8 c0sm8 = new C0SM8() { // from class: X.0SAL
                @Override // X.C0SM8
                public final void LIZ(int i) {
                    C0SAH c0sah = this.LIZ.zp().LLILLJJLI;
                    if (!c0sah.LJI.containsKey(Integer.valueOf(i))) {
                        c0sah.LJI.put(Integer.valueOf(i), Boolean.TRUE);
                    }
                }

                @Override // X.C0SM8
                public final void LIZIZ(int i) {
                    C0SAH c0sah = this.LIZ.zp().LLILLJJLI;
                    if (!c0sah.LJFF.containsKey(Integer.valueOf(i))) {
                        c0sah.LJFF.put(Integer.valueOf(i), Boolean.TRUE);
                    }
                }

                @Override // X.C0SM8
                public final void LIZJ(int i) {
                    this.LIZ.zp().vQ2(i);
                }

                @Override // X.C0SM8
                public final void LIZLLL(int i) {
                    C0SAH c0sah = this.LIZ.zp().LLILLJJLI;
                    if (!c0sah.LJIIIIZZ.containsKey(Integer.valueOf(i))) {
                        c0sah.LJIIIIZZ.put(Integer.valueOf(i), Boolean.TRUE);
                    }
                }

                @Override // X.C0SM8
                public final void LJ(int i) {
                    C0SAH c0sah = this.LIZ.zp().LLILLJJLI;
                    if (!c0sah.LJII.containsKey(Integer.valueOf(i))) {
                        c0sah.LJII.put(Integer.valueOf(i), Boolean.TRUE);
                    }
                }

                @Override // X.C0SM8
                public final void LJFF(int i) {
                    C0SAH c0sah = this.LIZ.zp().LLILLJJLI;
                    c0sah.LIZLLL = Math.max(c0sah.LIZLLL, i);
                    C719880SLq c719880SLq = this.LIZ.LLLFFI;
                    if (c719880SLq != null) {
                        c719880SLq.LJJJJZI(i);
                    }
                    InterfaceC717030SAr interfaceC717030SArOp = this.LIZ.op();
                    if (interfaceC717030SArOp != null) {
                        interfaceC717030SArOp.hk(Integer.valueOf(i));
                    }
                }
            };
            PhotoSharedViewModel photoSharedViewModel = (PhotoSharedViewModel) this.LLJJLIIIJLLLLLLLZ.getValue();
            C0SLS c0sls = new C0SLS() { // from class: X.0SLN
                @Override // X.C0SLS
                public final void LJJJIL() {
                    C0SLS c0slsAp = this.LL.Ap();
                    if (c0slsAp != null) {
                        c0slsAp.LJJJIL();
                    }
                }

                @Override // X.C0SLS
                public final void LJZL() {
                    C0SLS c0slsAp = this.LL.Ap();
                    if (c0slsAp != null) {
                        c0slsAp.LJZL();
                    }
                }

                @Override // X.C0SLS
                public final boolean b1() {
                    C0SLS c0slsAp = this.LL.Ap();
                    if (c0slsAp != null) {
                        return c0slsAp.b1();
                    }
                    return true;
                }
            };
            C0SMP c0smp = new C0SMP(this) { // from class: X.0SLD
                public final PhotoSlideViewPagerComponent LIZ;
                public final C19EG LIZIZ;
                public final AwS555S0100000_11 LIZJ;

                @Override // X.C0SMP
                public final Function0<InterfaceC665370Q7z> LIZ() {
                    return this.LIZJ;
                }

                @Override // X.C0SMP
                public final C19EG getActivity() {
                    return this.LIZIZ;
                }

                @Override // X.C0SMP
                public final LifecycleOwner getLifecycleOwner() {
                    return this.LIZ;
                }

                {
                    this.LIZ = this;
                    this.LIZIZ = C724240Sb0.LIZ(this);
                    this.LIZJ = new AwS555S0100000_11(this, 1676);
                }
            };
            if (C0SKM.LIZLLL()) {
                c0smc = new C0SMC() { // from class: X.0SLM
                    @Override // X.C0SMC
                    public final boolean LIZ() {
                        return false;
                    }

                    @Override // X.C0SMC
                    public final boolean LIZIZ() {
                        return false;
                    }

                    @Override // X.C0SMC
                    public final int LIZLLL() {
                        return 0;
                    }

                    @Override // X.C0SMC
                    public final boolean LIZJ() {
                        C719660SKu c719660SKu2 = this.LIZ.LLLJIL;
                        return c719660SKu2 != null && c719660SKu2.LJJJLIIL;
                    }
                };
            } else {
                c0smc = null;
            }
            C719880SLq c719880SLq = new C719880SLq(interfaceC720380SNo, c0slj, photoViewModelV2Zp, viewGroup, interfaceC719500SKe, c0sm8, photoSharedViewModel, c0sls, c0smp, c0smc);
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            VideoItemParams videoItemParams = (VideoItemParams) obj;
            if (videoItemParams != null && videoItemParams.mPageType == 0) {
                z = true;
            } else {
                z = false;
            }
            c719880SLq.LLJZ = z;
            this.LLLFFI = c719880SLq;
            ((ArrayList) c719880SLq.LLJJJ).add(new C0SMF() { // from class: X.0SLA
                @Override // X.C0SMF
                public final void Yb() {
                }

                @Override // X.C0SMF
                public final void wd(int i) {
                    SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2;
                    if (this.LL.Ep()) {
                        PhotoSlideViewPagerComponent photoSlideViewPagerComponent = this.LL;
                        if (photoSlideViewPagerComponent.LLLI) {
                            InterfaceC719460SKa interfaceC719460SKaRq2 = photoSlideViewPagerComponent.LLLLIILLL.rq2(i);
                            if ((interfaceC719460SKaRq2 instanceof SmartImagePhotoViewHolderV2) && (smartImagePhotoViewHolderV2 = (SmartImagePhotoViewHolderV2) interfaceC719460SKaRq2) != null) {
                                SmartImagePhotoViewHolderV2.LJJLL(smartImagePhotoViewHolderV2, true, false, 6);
                                if (this.LL.LLLI) {
                                    smartImagePhotoViewHolderV2.LJJLJLI(false);
                                    smartImagePhotoViewHolderV2.LJJZ();
                                }
                            }
                        }
                    }
                }
            });
            c0slx.setAdapter(this.LLLFFI);
            if (C295890Bil.LIZIZ()) {
                c0slx.setSlideAngle(C295890Bil.LIZ());
            }
        }
        InterfaceC719700SKy interfaceC719700SKy = new InterfaceC719700SKy() { // from class: X.0SKW
            @Override // X.InterfaceC719700SKy
            public final void E8() {
                InteractInfoDescAbility interactInfoDescAbility = (InteractInfoDescAbility) this.LIZ.LLJLILLLLZIIL.getValue();
                if (interactInfoDescAbility != null) {
                    interactInfoDescAbility.E8();
                }
            }

            @Override // X.InterfaceC719700SKy
            public final ImageView F2() {
                IVideoCellViewAbility iVideoCellViewAbility = (IVideoCellViewAbility) this.LIZ.LLJLL.getValue();
                if (iVideoCellViewAbility != null) {
                    return iVideoCellViewAbility.F2();
                }
                return null;
            }

            @Override // X.InterfaceC719700SKy
            public final void LIZ() {
                ISlideIndicatorAbility iSlideIndicatorAbility = (ISlideIndicatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), ISlideIndicatorAbility.class, null);
                if (iSlideIndicatorAbility != null) {
                    iSlideIndicatorAbility.I6(false);
                }
            }

            @Override // X.InterfaceC719700SKy
            public final View LIZIZ() {
                InteractRightAreaAttachAbility interactRightAreaAttachAbility = (InteractRightAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), InteractRightAreaAttachAbility.class, null);
                if (interactRightAreaAttachAbility != null) {
                    return interactRightAreaAttachAbility.y9();
                }
                return null;
            }

            @Override // X.InterfaceC719700SKy
            public final View LJI() {
                ISlideIndicatorAbility iSlideIndicatorAbility = (ISlideIndicatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), ISlideIndicatorAbility.class, null);
                if (iSlideIndicatorAbility != null) {
                    return iSlideIndicatorAbility.A52();
                }
                return null;
            }

            @Override // X.InterfaceC719700SKy
            public final C21600219g8 LJIIJJI() {
                return this.LIZ.LLLFF;
            }

            @Override // X.InterfaceC719700SKy
            public final View Uf() {
                FeedMultiAnchorAbility feedMultiAnchorAbility = (FeedMultiAnchorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), FeedMultiAnchorAbility.class, null);
                if (feedMultiAnchorAbility != null) {
                    return feedMultiAnchorAbility.Uf();
                }
                return null;
            }

            @Override // X.InterfaceC719700SKy
            public final void LIZJ(int i) {
                InteractInfoAreaAttachAbility interactInfoAreaAttachAbility = (InteractInfoAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), InteractInfoAreaAttachAbility.class, null);
                if (interactInfoAreaAttachAbility != null) {
                    interactInfoAreaAttachAbility.xE1(i);
                }
            }

            @Override // X.InterfaceC719700SKy
            public final View LJ(int i) {
                Object objRq2 = this.LIZ.rq2(i);
                if (objRq2 != null) {
                    return ((C0SMB) objRq2).LL;
                }
                return null;
            }

            @Override // X.InterfaceC719700SKy
            public final void LLLLLJIL(int i) {
                PhotoSlideViewPagerComponent photoSlideViewPagerComponent = this.LIZ;
                C0SKX c0skx = photoSlideViewPagerComponent.LLLLLJIL;
                if (c0skx == null) {
                    synchronized (photoSlideViewPagerComponent) {
                        c0skx = photoSlideViewPagerComponent.LLLLLJIL;
                        if (c0skx == null) {
                            C0QSJ c0qsjKp = photoSlideViewPagerComponent.kp();
                            if (c0qsjKp != null) {
                                c0skx = (C0SKX) c0qsjKp.getAbility(C0SKX.class);
                            } else {
                                c0skx = null;
                            }
                            photoSlideViewPagerComponent.LLLLLJIL = c0skx;
                            if (c0skx == null) {
                                return;
                            }
                        }
                    }
                }
                c0skx.LLLLLJIL(i);
            }

            @Override // X.InterfaceC719700SKy
            public final void LJIIIZ(int i, int i2) {
                C0SKY c0skySp = this.LIZ.sp();
                if (c0skySp != null) {
                    c0skySp.R3(i, i2);
                }
            }

            @Override // X.InterfaceC719700SKy
            public final void LJIIJ(int i, ViewOutlineProvider viewOutlineProvider) {
                SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2;
                InterfaceC719460SKa interfaceC719460SKaRq2 = this.LIZ.LLLLIILLL.rq2(i);
                if ((interfaceC719460SKaRq2 instanceof SmartImagePhotoViewHolderV2) && (smartImagePhotoViewHolderV2 = (SmartImagePhotoViewHolderV2) interfaceC719460SKaRq2) != null) {
                    smartImagePhotoViewHolderV2.LLJLL.setOutlineProvider(viewOutlineProvider);
                    if (viewOutlineProvider != null) {
                        smartImagePhotoViewHolderV2.LLJLL.setClipToOutline(true);
                    }
                }
            }

            @Override // X.InterfaceC719700SKy
            public final void LJFF(int i, boolean z2, boolean z3) {
                SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2;
                InterfaceC719460SKa interfaceC719460SKaRq2 = this.LIZ.LLLLIILLL.rq2(i);
                if ((interfaceC719460SKaRq2 instanceof SmartImagePhotoViewHolderV2) && (smartImagePhotoViewHolderV2 = (SmartImagePhotoViewHolderV2) interfaceC719460SKaRq2) != null) {
                    if (z2) {
                        smartImagePhotoViewHolderV2.LJJLJLI(z3);
                        return;
                    }
                    if (!C0SKM.LJII()) {
                        return;
                    }
                    ViewPropertyAnimator viewPropertyAnimator = smartImagePhotoViewHolderV2.LLLJL;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    smartImagePhotoViewHolderV2.LLLJL = null;
                    smartImagePhotoViewHolderV2.LLLJIL = false;
                    smartImagePhotoViewHolderV2.LLLL = null;
                    smartImagePhotoViewHolderV2.LLLJ = false;
                    if (smartImagePhotoViewHolderV2.LLJLL.getTranslationY() == 0.0f) {
                        return;
                    }
                    smartImagePhotoViewHolderV2.LJJJIL(0.0f, z3);
                }
            }

            @Override // X.InterfaceC719700SKy
            public final void LJII(Pair<Integer, Integer> pair, Pair<Integer, ? extends Drawable> pair2, boolean z2) {
                TranslationAbility translationAbility = (TranslationAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), TranslationAbility.class, null);
                if (translationAbility != null) {
                    translationAbility.HI(pair2);
                }
                InteractInfoAuthorInfoAbility interactInfoAuthorInfoAbility = (InteractInfoAuthorInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), InteractInfoAuthorInfoAbility.class, null);
                if (interactInfoAuthorInfoAbility != null) {
                    interactInfoAuthorInfoAbility.Fr2(pair.getFirst().intValue(), pair.getSecond().intValue());
                }
                IUpvoteGuideAbility iUpvoteGuideAbility = (IUpvoteGuideAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), IUpvoteGuideAbility.class, null);
                if (iUpvoteGuideAbility != null) {
                    iUpvoteGuideAbility.mH(z2);
                }
            }

            @Override // X.InterfaceC719700SKy
            public final void LJIIIIZZ(int i, int i2, ImageView.ScaleType scaleType) {
                SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2;
                InterfaceC719460SKa interfaceC719460SKaRq2 = this.LIZ.LLLLIILLL.rq2(i);
                if ((interfaceC719460SKaRq2 instanceof SmartImagePhotoViewHolderV2) && (smartImagePhotoViewHolderV2 = (SmartImagePhotoViewHolderV2) interfaceC719460SKaRq2) != null) {
                    smartImagePhotoViewHolderV2.LJJZZI(i2, scaleType);
                }
            }

            @Override // X.InterfaceC719700SKy
            public final void LIZLLL(String str, boolean z2, Drawable drawable, Rect rect) {
                C0SKV c0skvYp;
                if (z2) {
                    IVideoCellViewAbility iVideoCellViewAbility = (IVideoCellViewAbility) this.LIZ.LLJLL.getValue();
                    if (iVideoCellViewAbility != null) {
                        iVideoCellViewAbility.UY1();
                    }
                    C0SKV c0skvYp2 = this.LIZ.yp();
                    if (c0skvYp2 != null) {
                        c0skvYp2.F8(drawable, str);
                    }
                    if (rect != null && (c0skvYp = this.LIZ.yp()) != null) {
                        c0skvYp.r4(rect.left, rect.top, rect.right, rect.bottom, str);
                        return;
                    }
                    return;
                }
                IVideoCellViewAbility iVideoCellViewAbility2 = (IVideoCellViewAbility) this.LIZ.LLJLL.getValue();
                if (iVideoCellViewAbility2 == null) {
                    return;
                }
                iVideoCellViewAbility2.IZ();
            }
        };
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (!C0SKM.LIZIZ()) {
            c719660SKu = null;
        } else {
            c719660SKu = new C719660SKu(c19egLIZ);
            c719660SKu.LJJZ = interfaceC719700SKy;
        }
        this.LLLJIL = c719660SKu;
        C736680Sv4.LJIIIIZZ(this, zp(), new C2217381BqS() { // from class: X.0S9o
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Boolean.valueOf(((C0S9P) obj2).LLILZLL);
            }
        }, null, AFwS294S0000000_11.get$arr$(180), 6);
        C736680Sv4.LJIIIIZZ(this, zp(), new C2217381BqS() { // from class: X.0S7b
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Boolean.valueOf(((C0S9P) obj2).LLJJIJIL);
            }
        }, null, AFwS294S0000000_11.get$arr$(181), 6);
        C736680Sv4.LJIIIIZZ(this, zp(), new C2217381BqS() { // from class: X.0RVV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C0S9P) obj2).LLJ;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(182), 4);
        C736680Sv4.LJIIIIZZ(this, zp(), new C2217381BqS() { // from class: X.0RVX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C0S9P) obj2).LLJI;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(183), 4);
        C736680Sv4.LJIIIIZZ(this, zp(), new C2217381BqS() { // from class: X.0RVU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C0S9P) obj2).LLIZ;
            }
        }, null, AFwS294S0000000_11.get$arr$(184), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0Rso
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLJLLIL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(185), 4);
        if (((Boolean) this.LLLF.getValue()).booleanValue()) {
            C736680Sv4.LJIIIIZZ(this, zp(), new C2217381BqS() { // from class: X.0RVW
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return Long.valueOf(((C0S9P) obj2).LLJJJJJIL);
                }
            }, null, AFwS294S0000000_11.get$arr$(186), 6);
        } else {
            C736680Sv4.LJIIIIZZ(this, zp(), new C2217381BqS() { // from class: X.0S9S
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C0S9P) obj2).LLJJJIL;
                }
            }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(187), 4);
        }
        if (C281430B1h.LIZ()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C719680SKw(this, null), 3);
        }
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLJL.getValue();
        if (homeTabAbility != null && C0SLG.LIZ().enable && !C0SLF.LIZJ) {
            C0SLF.LIZJ = true;
            homeTabAbility.ao((InterfaceC1585190rLx) C0SLF.LJI.getValue());
            homeTabAbility.UC1((InterfaceC1585190rLx) C0SLF.LJII.getValue());
        }
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, PhotoGetInitPositionProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideViewPagerComponent$onViewCreated$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, PhotoGetInitPositionProtocol.class, this);
                    }
                }
            });
        }
        C2271391DvN.LIZ(this.LLLFF, (C1A5L) C2271381DvM.LLLLLL.getValue());
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        if (c0rjnLIZIZ != null) {
            strLIZ = C1389300mG0.LIZ(c0rjnLIZIZ);
        }
        C0SLX c0slx2 = this.LLLFF;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 1067);
        if (c0slx2 != null && strLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("photomode_slides_scroll_");
            sbLIZ.append(strLIZ);
            C0SNV.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), strLIZ, c0slx2, awS555S0100000_11);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PhotoSlideScope.class});
        c0qsjLIZIZ.bindAbility(this.LLLLIIL.getValue(), InterfaceC717040SAs.class);
        c0qsjLIZIZ.bindAbility(this.LLLLIILL, C0S9L.class);
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class}).bindAbility(this.LLLLIILLL, IPhotoSlidesAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final InterfaceC719460SKa rq2(int i) {
        C719880SLq c719880SLq = this.LLLFFI;
        if (c719880SLq != null) {
            return c719880SLq.LJJJJJ(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0196  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideViewPagerComponent.up(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.protocol.PhotoGetInitPositionProtocol
    public final void BU0(int i, int i2) {
        String aid;
        Aweme awemeLJIIIIZZ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    zp().EQ2(i2);
                    C719880SLq c719880SLq = this.LLLFFI;
                    if (c719880SLq != null) {
                        c719880SLq.LJJJ(i2);
                    }
                    zp().PQ2();
                    C1375730lu7.LIZIZ.LIZLLL(i2);
                    Qp(i2);
                    return;
                }
                return;
            }
            Fp(i2);
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLJZ.getValue();
            Object obj = null;
            if (iFeedPanelPlatformAbility != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbility.LJIIIIZZ()) != null) {
                aid = awemeLJIIIIZZ.getAid();
            } else {
                aid = null;
            }
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            }
            O0(i2, false, Intrinsics.LJFF(aid, ((VideoItemParams) obj).getAweme().getAid()));
            return;
        }
        zp().EQ2(i2);
        Qp(i2);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        Object obj;
        C719660SKu c719660SKu = this.LLLJIL;
        if (c719660SKu != null) {
            c719660SKu.LJJJJJL(true);
        }
        C719670SKv c719670SKv = this.LLLJL;
        if (c719670SKv != null) {
            c719670SKv.LIZ(true);
        }
        C719720SLa.LIZIZ(this.LLLLIL);
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        C0SLF.LIZ(aweme, ((VideoItemParams) obj).mEventType);
    }

    public final void ep(boolean z, Integer num) {
        int iIntValue;
        int iLIZJ;
        SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2;
        C0SLX c0slx;
        int iLIZIZ = 0;
        if (z) {
            if (num != null || ((c0slx = this.LLLFF) != null && (num = Integer.valueOf(c0slx.getCurrentItem())) != null)) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                iLIZJ = C497820Jfg.LIZJ(c19egLIZ);
            } else {
                iLIZJ = 0;
            }
            InterfaceC719460SKa interfaceC719460SKaRq2 = this.LLLLIILLL.rq2(iIntValue);
            if (((interfaceC719460SKaRq2 instanceof SmartImagePhotoViewHolderV2) && (smartImagePhotoViewHolderV2 = (SmartImagePhotoViewHolderV2) interfaceC719460SKaRq2) != null && smartImagePhotoViewHolderV2.LLJZIJLIL.LJIIIZ(smartImagePhotoViewHolderV2.LLLLIIIILLL)) || C0SKM.LIZ()) {
                iLIZIZ = 1;
            }
            if (iLIZIZ != 0) {
                iLIZIZ = iLIZJ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            }
        }
        C0SKY c0skySp = sp();
        if (c0skySp != null) {
            c0skySp.Zk(iLIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility
    public final void rU1(int i, String str) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (TextUtils.equals(str, ((VideoItemParams) obj).getAweme().getAid()) && i >= 0 && i < tp()) {
            G91(i);
        }
    }

    @Override // X.C0S9L
    public final void LLJJIJIL(Function0 function0, boolean z, boolean z2) {
        C719660SKu c719660SKu = this.LLLJIL;
        if (c719660SKu != null) {
            c719660SKu.LLJJIJIL(new AwS94S0210000_11(z, (boolean) this, (PhotoSlideViewPagerComponent) function0, (Function0<Unit>) 5), z, z2);
        }
    }

    @Override // X.C0S9L
    public final void O0(int i, boolean z, boolean z2) {
        C0SLX c0slx = this.LLLFF;
        if (c0slx != null) {
            c0slx.LLFFF(i, z);
        }
        if (z2) {
            C1375730lu7.LIZIZ.LIZLLL(i);
        }
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), PhotoOnIndexSetProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            while (it2.hasNext()) {
                ((PhotoOnIndexSetProtocol) it2.next()).Sn0(i);
            }
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        C719880SLq c719880SLq = this.LLLFFI;
        if (c719880SLq != null && c719880SLq.LLJJIJIIJIL != i) {
            c719880SLq.LJJJ(i);
            C0SM8 c0sm8 = c719880SLq.LLIZLLLIL;
            if (c0sm8 != null) {
                c0sm8.LJFF(i);
            }
        }
    }
}
