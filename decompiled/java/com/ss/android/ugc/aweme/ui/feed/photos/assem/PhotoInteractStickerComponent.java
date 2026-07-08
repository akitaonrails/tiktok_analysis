package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.C01GW;
import X.C0OD3;
import X.C0R60;
import X.C10EU;
import X.C12ES;
import X.C1389340mG4;
import X.C13LE;
import X.C14LC;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1866270yfJ;
import X.C19EG;
import X.C21600219g8;
import X.C2189821An6;
import X.C309690CBz;
import X.C584850Mwl;
import X.C611410NyV;
import X.C692980RGe;
import X.C693020RGi;
import X.C705930RmZ;
import X.C719880SLq;
import X.C724270Sb3;
import X.C729510SjV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC19578611iq;
import X.InterfaceC665370Q7z;
import android.content.Intent;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.ui.feed.protocol.PhotoGetInitPositionProtocol;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS129S0110000_11;
import kotlin.jvm.internal.AwS54S0010000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoInteractStickerComponent extends BaseCellContentComponent<PhotoInteractStickerComponent> implements InterfaceC19578611iq, PhotoGetInitPositionProtocol {
    public final C01GW LLJJJJLIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(517));
    public C692980RGe LLJJL;
    public C705930RmZ LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: cp */
    public final boolean ur(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct, PointF pointF) {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void onDestroyView() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        C692980RGe c692980RGe = this.LLJJL;
        if (c692980RGe != null) {
            C786410Ut5.m1(c692980RGe, 8);
        }
    }

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct) {
        ((PhotoViewModelV2) this.LLJJJJLIIL.getValue()).wQ2();
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C719880SLq c719880SLq;
        C21600219g8 c21600219g8 = (C21600219g8) view.findViewById(R.id.qez);
        if (c21600219g8 != null) {
            PagerAdapter adapter = c21600219g8.getAdapter();
            if ((adapter instanceof C719880SLq) && (c719880SLq = (C719880SLq) adapter) != null) {
                c719880SLq.LLJLIL = this;
            }
        }
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, PhotoGetInitPositionProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoInteractStickerComponent$onViewCreated$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, PhotoGetInitPositionProtocol.class, this);
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        Object obj;
        String stringExtra;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String str;
        Object obj6;
        User user;
        Object obj7;
        Object obj8;
        BaseFeedPageParams baseFeedPageParams;
        ViewStub viewStub;
        BaseFeedPageParams baseFeedPageParams2;
        Fragment fragment;
        C19EG activity;
        Intent intent;
        C705930RmZ c705930RmZ = new C705930RmZ();
        C724270Sb3 c724270Sb3 = this.LLJI;
        C2189821An6 c2189821An6 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        c705930RmZ.LIZJ = C693020RGi.LIZ(((VideoItemParams) obj).getAweme());
        VideoItemParams videoItemParams2 = ((PhotoViewModelV2) this.LLJJJJLIIL.getValue()).LLILLL;
        if (videoItemParams2 != null && (fragment = videoItemParams2.fragment) != null && (activity = fragment.getActivity()) != null && (intent = activity.getIntent()) != null) {
            try {
                stringExtra = intent.getStringExtra("add_yours_enter_from_before_detail_page");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
        } else {
            stringExtra = null;
        }
        C0R60 c0r60 = new C0R60();
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        c0r60.LIZJ = AwemeExtKt.getAuthorUid(((VideoItemParams) obj2).getAweme());
        if (stringExtra == null) {
            VideoItemParams videoItemParams3 = ((PhotoViewModelV2) this.LLJJJJLIIL.getValue()).LLILLL;
            if (videoItemParams3 != null && (baseFeedPageParams2 = videoItemParams3.baseFeedPageParams) != null) {
                stringExtra = baseFeedPageParams2.eventType;
            } else {
                stringExtra = null;
            }
        }
        c0r60.LIZ = stringExtra;
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj3 = c724270Sb33.LL;
        } else {
            obj3 = null;
        }
        c0r60.LIZLLL = ((VideoItemParams) obj3).getAweme().getAid();
        C611410NyV c611410NyV = C584850Mwl.LIZ;
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (c724270Sb34 != null) {
            obj4 = c724270Sb34.LL;
        } else {
            obj4 = null;
        }
        c0r60.LJ = c611410NyV.LIZIZ(((VideoItemParams) obj4).getAweme().getRequestId());
        C724270Sb3 c724270Sb35 = this.LLJI;
        if (c724270Sb35 != null) {
            obj5 = c724270Sb35.LL;
        } else {
            obj5 = null;
        }
        if (C729510SjV.LJJ(((VideoItemParams) obj5).getAweme())) {
            str = "story";
        } else {
            str = "post";
        }
        c0r60.LJFF = str;
        c705930RmZ.LJIIZILJ = c0r60;
        this.LLJJLIIIJLLLLLLLZ = c705930RmZ;
        C724270Sb3 c724270Sb36 = this.LLJI;
        if (c724270Sb36 != null) {
            obj6 = c724270Sb36.LL;
        } else {
            obj6 = null;
        }
        if (((VideoItemParams) obj6).getAweme().getInteractStickerStructs() != null && (!r0.isEmpty())) {
            if (this.LLJJL == null) {
                View viewFindViewById = LJJIJL().findViewById(R.id.qf0);
                if ((viewFindViewById instanceof ViewStub) && (viewStub = (ViewStub) viewFindViewById) != null) {
                    C786410Ut5.LLIIIJ(viewStub, 0);
                }
                this.LLJJL = (C692980RGe) LJJIJL().findViewById(R.id.qej);
            }
            C692980RGe c692980RGe = this.LLJJL;
            if (c692980RGe != null) {
                float fLIZJ = C12ES.LIZJ(C1389340mG4.LJ(), getContext());
                boolean z = C14LC.LJIIIZ;
                C692980RGe.LIZ(c692980RGe, new RectF(0.0f, 0.0f, fLIZJ, C309690CBz.LIZ.LIZJ));
            }
            C692980RGe c692980RGe2 = this.LLJJL;
            if (c692980RGe2 != null) {
                c692980RGe2.LIZJ(false);
            }
            C705930RmZ c705930RmZ2 = this.LLJJLIIIJLLLLLLLZ;
            if (c705930RmZ2 != null) {
                user = c705930RmZ2.LIZJ;
            } else {
                user = null;
            }
            boolean zLJIILLIIL = C10EU.LJIILLIIL(user);
            C692980RGe c692980RGe3 = this.LLJJL;
            if (c692980RGe3 != null) {
                C692980RGe.LIZLLL(c692980RGe3, new C1866270yfJ(this, new AwS129S0110000_11(this, zLJIILLIIL, 8), new AwS54S0010000_11(zLJIILLIIL, 8), null, new AwS54S0010000_11(zLJIILLIIL, 9), false, 40), zLJIILLIIL, this.LLJJLIIIJLLLLLLLZ, this);
            }
            C692980RGe c692980RGe4 = this.LLJJL;
            if (c692980RGe4 != null) {
                C724270Sb3 c724270Sb37 = this.LLJI;
                if (c724270Sb37 != null) {
                    obj7 = c724270Sb37.LL;
                } else {
                    obj7 = null;
                }
                List<InteractStickerStruct> interactStickerStructs = ((VideoItemParams) obj7).getAweme().getInteractStickerStructs();
                ArrayList arrayList = new ArrayList();
                for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                    if (!interactStickerStruct.getNoGlobal()) {
                        arrayList.add(interactStickerStruct);
                    }
                }
                C724270Sb3 c724270Sb38 = this.LLJI;
                if (c724270Sb38 != null) {
                    obj8 = c724270Sb38.LL;
                } else {
                    obj8 = null;
                }
                Aweme aweme = ((VideoItemParams) obj8).getAweme();
                C705930RmZ c705930RmZ3 = this.LLJJLIIIJLLLLLLLZ;
                VideoItemParams videoItemParams4 = ((PhotoViewModelV2) this.LLJJJJLIIL.getValue()).LLILLL;
                if (videoItemParams4 != null && (baseFeedPageParams = videoItemParams4.baseFeedPageParams) != null) {
                    c2189821An6 = baseFeedPageParams.param;
                }
                c692980RGe4.LIZIZ(arrayList, aweme, c705930RmZ3, c2189821An6);
            }
            C692980RGe c692980RGe5 = this.LLJJL;
            if (c692980RGe5 != null) {
                C786410Ut5.m1(c692980RGe5, 0);
                return;
            }
            return;
        }
        C692980RGe c692980RGe6 = this.LLJJL;
        if (c692980RGe6 != null) {
            C786410Ut5.m1(c692980RGe6, 8);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.protocol.PhotoGetInitPositionProtocol
    public final void BU0(int i, int i2) {
        C692980RGe c692980RGe;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = null;
        if (i == 2 && (c692980RGe = this.LLJJL) != null) {
            Iterator it2 = ((ArrayList) c692980RGe.LLILLJJLI).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((InteractStickerStruct) next).getType() == 88) {
                    obj = next;
                    break;
                }
            }
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) obj;
            if (interactStickerStruct != null) {
                C0OD3 c0od3 = C0OD3.LIZ;
                AddYoursStickerStruct addYoursStickerStruct = interactStickerStruct.getAddYoursStickerStruct();
                Aweme aweme = c692980RGe.LLILZ;
                C705930RmZ c705930RmZ = c692980RGe.LLILLL;
                c0od3.getClass();
                C0OD3.LIZIZ(addYoursStickerStruct, aweme, c705930RmZ);
            }
        }
    }
}
