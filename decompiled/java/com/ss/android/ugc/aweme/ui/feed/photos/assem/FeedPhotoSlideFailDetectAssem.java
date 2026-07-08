package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.C0SLX;
import X.C0ST8;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19EG;
import X.C2188811AlT;
import X.C724240Sb0;
import X.C786410Ut5;
import Y.ARunnableS111S0100000_11;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ability.IPhotoSlideFailDetectAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedPhotoSlideFailDetectAssem extends BaseCellContentComponent<FeedPhotoSlideFailDetectAssem> implements IPhotoSlideFailDetectAbility {
    public C0SLX LLJJJJLIIL;
    public WeakReference<View> LLJJL;
    public ARunnableS111S0100000_11 LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        C19EG activity;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (activity = fragmentLJI.getActivity()) != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(activity, null), IPhotoSlideFailDetectAbility.class, null);
        }
        this.LLJL = false;
    }

    public static View.OnClickListener ep(View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2;
        Class<?> cls = Class.forName("mf.a");
        Class<?> cls2 = Class.forName("avg.f");
        if (cls.isInstance(onClickListener)) {
            Field declaredField = cls.getDeclaredField("listener");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(onClickListener);
            if (obj instanceof View.OnClickListener) {
                onClickListener2 = (View.OnClickListener) obj;
            } else {
                onClickListener2 = null;
            }
            if (cls2.isInstance(onClickListener2)) {
                Field declaredField2 = cls2.getDeclaredField("originalListener");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(onClickListener2);
                if (!(obj2 instanceof View.OnClickListener)) {
                    return null;
                }
                return (View.OnClickListener) obj2;
            }
            return onClickListener2;
        }
        return onClickListener;
    }

    public static String hp(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("l:");
        sbLIZ.append(iArr[0]);
        sbLIZ.append(",r:");
        sbLIZ.append(iArr[0] + view.getWidth());
        sbLIZ.append(",t:");
        sbLIZ.append(iArr[1]);
        sbLIZ.append(",b:");
        sbLIZ.append(iArr[1] + view.getHeight());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C0SLX c0slx = (C0SLX) view;
        this.LLJJJJLIIL = c0slx;
        if (c0slx != null) {
            c0slx.setOnCannotScrollHorizontallyListener$post_mode_release(new AwS590S0100000_11(this, 607));
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlideFailDetectAbility
    public final void v60(MotionEvent motionEvent) {
        Handler handler;
        if (motionEvent == null) {
            return;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return;
            }
            ARunnableS111S0100000_11 aRunnableS111S0100000_11 = this.LLJJLIIIJLLLLLLLZ;
            if (aRunnableS111S0100000_11 != null && (handler = LJJIJL().getHandler()) != null) {
                handler.removeCallbacks(aRunnableS111S0100000_11);
            }
            this.LLJJLIIIJLLLLLLLZ = null;
            this.LLJJL = null;
            return;
        }
        this.LLJL = false;
        ARunnableS111S0100000_11 aRunnableS111S0100000_112 = new ARunnableS111S0100000_11(this, 55);
        this.LLJJLIIIJLLLLLLLZ = aRunnableS111S0100000_112;
        Handler handler2 = LJJIJL().getHandler();
        if (handler2 == null) {
            return;
        }
        C786410Ut5.LJJZZIII(handler2, aRunnableS111S0100000_112);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        Fragment fragmentLJI;
        C19EG activity;
        if (aweme != null && C0ST8.LIZJ(aweme) > 1 && (fragmentLJI = C724240Sb0.LJI(this)) != null && (activity = fragmentLJI.getActivity()) != null) {
            C1558520qew.LJII(C1558360qeg.LJI(activity, null), this, IPhotoSlideFailDetectAbility.class, null, null);
        }
    }
}
