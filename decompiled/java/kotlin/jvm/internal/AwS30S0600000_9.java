package kotlin.jvm.internal;

import X.AbstractC1321260kUG;
import X.AbstractC589670NAv;
import X.AbstractC636210OxP;
import X.C05P0;
import X.C09AY;
import X.C1322200kVm;
import X.C1325710kbR;
import X.C1390410mHn;
import X.C1602160rnK;
import X.C1670140tYy;
import X.C19F0;
import X.C19FT;
import X.C20684815ws;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C5185020h;
import X.C589690NAx;
import X.C589710NAz;
import X.C632480OrO;
import X.C636170OxL;
import X.C636180OxM;
import X.C636220OxQ;
import X.C636260OxU;
import X.C636350Oxd;
import X.C786410Ut5;
import X.C823050WQl;
import X.C844470XAv;
import X.EnumC329800CwM;
import X.InterfaceC636240OxS;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS113S0200000_9;
import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.ss.android.ugc.aweme.music.search.SearchMusicActivity;
import com.ss.android.ugc.aweme.music.search.SearchPinnedMusicList;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public class AwS30S0600000_9 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS30S0600000_9 awS30S0600000_9, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (((C589710NAz) awS30S0600000_9.l0).LIZ) {
            ((Function2) awS30S0600000_9.l1).invoke(Boolean.FALSE, null);
        } else if (zBooleanValue) {
            Executor executor = C589690NAx.LIZ;
            C589690NAx.LIZ((C1325710kbR) awS30S0600000_9.l2, (Context) awS30S0600000_9.l3, (Function0) awS30S0600000_9.l4, (C589710NAz) awS30S0600000_9.l0, new C5185020h((Function2) awS30S0600000_9.l1, (Function2<? super Boolean, ? super Throwable, Unit>) 14));
        } else {
            Executor executor2 = C589690NAx.LIZ;
            C1325710kbR c1325710kbR = (C1325710kbR) awS30S0600000_9.l2;
            Context context = (Context) awS30S0600000_9.l3;
            C589710NAz c589710NAz = (C589710NAz) awS30S0600000_9.l0;
            AwS42S0600000_9 awS42S0600000_9 = new AwS42S0600000_9(context, c1325710kbR, c589710NAz, (Function0) awS30S0600000_9.l5, (Function0) awS30S0600000_9.l4, (Function2) awS30S0600000_9.l1, 1);
            AbstractC1321260kUG abstractC1321260kUGLJIJ = C1322200kVm.LIZ().LJIJ(c1325710kbR, context);
            if (c589710NAz != null) {
                c589710NAz.LIZ(abstractC1321260kUGLJIJ);
            }
            final AwS440S0200000_4 awS440S0200000_4 = new AwS440S0200000_4(new AtomicBoolean(false), (AtomicBoolean) awS42S0600000_9, (Function2<? super Boolean, ? super Throwable, Unit>) 9);
            final ScheduledFuture<?> scheduledFutureSchedule = C823050WQl.LJ().schedule(new ARunnableS75S0200000_6(abstractC1321260kUGLJIJ, awS440S0200000_4, 73), Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS);
            abstractC1321260kUGLJIJ.LIZJ(new AbstractC589670NAv() { // from class: X.0NAu
                @Override // X.AbstractC589670NAv
                public final void LJFF() {
                    ScheduledFuture<?> scheduledFuture = scheduledFutureSchedule;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    awS440S0200000_4.invoke(Boolean.TRUE, null);
                }

                @Override // X.AbstractC589670NAv
                public final void LJ(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                    Throwable exc;
                    ScheduledFuture<?> scheduledFuture = scheduledFutureSchedule;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    if (interfaceC1320200kSY == null || (exc = ((AbstractC1321260kUG) interfaceC1320200kSY).LIZLLL()) == null) {
                        exc = new Exception("Disk prefetch failed");
                    }
                    awS440S0200000_4.invoke(Boolean.FALSE, exc);
                }
            }, C589690NAx.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS30S0600000_9 awS30S0600000_9, Object obj) {
        String userId;
        String secUserID;
        Music sourceMusic;
        ((MusicPlayViewModel) awS30S0600000_9.l0).yQ2(true);
        Context context = (Context) awS30S0600000_9.l1;
        C19F0 c19f0 = (C19F0) awS30S0600000_9.l2;
        C05P0 c05p0 = (C05P0) awS30S0600000_9.l3;
        OriginMusicArg originMusicArg = (OriginMusicArg) awS30S0600000_9.l4;
        OriginMusicListViewModel originMusicListViewModel = (OriginMusicListViewModel) awS30S0600000_9.l5;
        Intent intent = new Intent(context, (Class<?>) SearchMusicActivity.class);
        SearchPinnedMusicList searchPinnedMusicList = new SearchPinnedMusicList();
        PinnedMusicList pinnedMusicList = originMusicListViewModel.LLIZLLLIL;
        if (pinnedMusicList != null) {
            searchPinnedMusicList.setAvalibleCapicity(pinnedMusicList.getAvalibleCapicity());
            CopyOnWriteArrayList<MusicGroup> copyOnWriteArrayList = originMusicListViewModel.LLJJ;
            ArrayList arrayList = new ArrayList();
            Iterator<MusicGroup> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                Music sourceMusic2 = it2.next().getSourceMusic();
                if (sourceMusic2 != null) {
                    arrayList.add(sourceMusic2);
                }
            }
            searchPinnedMusicList.setMusicList(new ArrayList(arrayList));
            searchPinnedMusicList.setMusicGroups(originMusicListViewModel.LLJJ);
            MusicGroup highlightedGroup = pinnedMusicList.getHighlightedGroup();
            if (highlightedGroup != null) {
                sourceMusic = highlightedGroup.getSourceMusic();
            } else {
                sourceMusic = null;
            }
            searchPinnedMusicList.setHighlightedMusic(sourceMusic);
            searchPinnedMusicList.setHighlightedGroup(pinnedMusicList.getHighlightedGroup());
            searchPinnedMusicList.setSpotlightGroup(pinnedMusicList.getSpotlightGroup());
        }
        List<MusicGroup> musicGroups = searchPinnedMusicList.getMusicGroups();
        String str = "";
        if (originMusicArg == null || (userId = originMusicArg.getUserId()) == null) {
            userId = "";
        }
        intent.putExtra("user_id", userId);
        if (originMusicArg != null && (secUserID = originMusicArg.getSecUserID()) != null) {
            str = secUserID;
        }
        intent.putExtra("sec_user_id", str);
        intent.putExtra("pinned_music_list", searchPinnedMusicList);
        c05p0.setValue(new C632480OrO(musicGroups, originMusicListViewModel));
        c19f0.LIZ(intent);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        C20684815ws.LJIILLIIL("enter_search", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS30S0600000_9 awS30S0600000_9, Object obj) {
        CharSequence text;
        TextView textViewLIZJ;
        C636350Oxd c636350Oxd = (C636350Oxd) obj;
        ((C05P0) awS30S0600000_9.l3).setValue(c636350Oxd);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, ((Context) awS30S0600000_9.l0).getResources().getDimensionPixelSize(R.dimen.q1));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c636350Oxd);
        c636350Oxd.setLayoutParams(layoutParams);
        TextView textViewLIZJ2 = C1670140tYy.LIZJ((C05P0) awS30S0600000_9.l4);
        if (textViewLIZJ2 != null) {
            C844470XAv.LIZ.getClass();
            textViewLIZJ2.setText(C844470XAv.LIZ().getString(2131836754));
        }
        TextView textViewLIZJ3 = C1670140tYy.LIZJ((C05P0) awS30S0600000_9.l4);
        if (textViewLIZJ3 != null) {
            textViewLIZJ3.setGravity(17);
        }
        TextView textViewLIZJ4 = C1670140tYy.LIZJ((C05P0) awS30S0600000_9.l4);
        if (textViewLIZJ4 != null) {
            textViewLIZJ4.setTextColor(-16777216);
        }
        c636350Oxd.setLoadMoreListener$mention_video_release((Function0) awS30S0600000_9.l1);
        TextView textViewLIZJ5 = C1670140tYy.LIZJ((C05P0) awS30S0600000_9.l4);
        if (textViewLIZJ5 != null) {
            C786410Ut5.T7(textViewLIZJ5, new ACListenerS113S0200000_9((Function0) awS30S0600000_9.l1, c636350Oxd, 54));
        }
        C636260OxU c636260OxULIZIZ = ((InterfaceC636240OxS) awS30S0600000_9.l2).LIZIZ();
        AbstractC636210OxP abstractC636210OxP = c636260OxULIZIZ.LIZIZ;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (abstractC636210OxP instanceof C636180OxM) {
            if (c636260OxULIZIZ.LIZ != EnumC329800CwM.REFRESH) {
                TextView textViewLIZJ6 = C1670140tYy.LIZJ((C05P0) awS30S0600000_9.l4);
                if (textViewLIZJ6 != null) {
                    text = textViewLIZJ6.getText();
                } else {
                    text = null;
                }
                if (!TextUtils.equals(text, ((Context) awS30S0600000_9.l0).getString(2131845625)) && (textViewLIZJ = C1670140tYy.LIZJ((C05P0) awS30S0600000_9.l4)) != null) {
                    textViewLIZJ.setText(2131845625);
                }
                ViewGroup viewGroup = (ViewGroup) ((C05P0) awS30S0600000_9.l3).getValue();
                if (viewGroup != null) {
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewGroup, null);
                    viewGroup.removeAllViews();
                }
                ((C1390410mHn) ((C05P0) awS30S0600000_9.l5).getValue()).LIZLLL();
                ViewGroup viewGroup2 = (ViewGroup) ((C05P0) awS30S0600000_9.l3).getValue();
                if (viewGroup2 != null) {
                    viewGroup2.addView(C1670140tYy.LIZJ((C05P0) awS30S0600000_9.l4));
                }
                TextView textViewLIZJ7 = C1670140tYy.LIZJ((C05P0) awS30S0600000_9.l4);
                if (textViewLIZJ7 != null) {
                    layoutParams2 = textViewLIZJ7.getLayoutParams();
                }
                ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
                c636350Oxd.setWaitingToLoadMore$mention_video_release(true);
            }
        } else if (abstractC636210OxP instanceof C636220OxQ) {
            ViewGroup viewGroup3 = (ViewGroup) ((C05P0) awS30S0600000_9.l3).getValue();
            if (viewGroup3 != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewGroup3, null);
                viewGroup3.removeAllViews();
            }
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) C418440Gaw.LIZIZ(32), (int) C418440Gaw.LIZIZ(32));
            layoutParams3.gravity = 17;
            C786410Ut5.V6((C1390410mHn) ((C05P0) awS30S0600000_9.l5).getValue(), layoutParams3);
            ViewGroup viewGroup4 = (ViewGroup) ((C05P0) awS30S0600000_9.l3).getValue();
            if (viewGroup4 != null) {
                viewGroup4.addView((View) ((C05P0) awS30S0600000_9.l5).getValue());
            }
            ((C1390410mHn) ((C05P0) awS30S0600000_9.l5).getValue()).LIZJ();
        } else if ((abstractC636210OxP instanceof C636170OxL) && !((C636170OxL) abstractC636210OxP).LIZ && c636260OxULIZIZ.LIZ != EnumC329800CwM.REFRESH) {
            RecyclerView.LayoutParams layoutParams4 = new RecyclerView.LayoutParams(-1, 0);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c636350Oxd);
            c636350Oxd.setLayoutParams(layoutParams4);
            int visibility = c636350Oxd.getVisibility();
            c636350Oxd.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c636350Oxd);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S0600000_9(Context context, C1325710kbR c1325710kbR, C589710NAz c589710NAz, Function0 function0, Function0 function02, Function2 function2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c589710NAz;
        this.l1 = function2;
        this.l2 = c1325710kbR;
        this.l3 = context;
        this.l4 = function0;
        this.l5 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S0600000_9(Context context, C19FT c19ft, C05P0 c05p0, OriginMusicArg originMusicArg, MusicPlayViewModel musicPlayViewModel, OriginMusicListViewModel originMusicListViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = musicPlayViewModel;
        this.l1 = context;
        this.l2 = c19ft;
        this.l3 = c05p0;
        this.l4 = originMusicArg;
        this.l5 = originMusicListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS30S0600000_9(Context context, Context context2, Function0<Unit> function0, InterfaceC636240OxS<?> interfaceC636240OxS, C05P0<C636350Oxd> c05p0, C05P0<TextView> c05p02, C05P0<C1390410mHn> c05p03) {
        super(1);
        this.$t = c05p03;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = function0;
        this.l3 = interfaceC636240OxS;
        this.l4 = c05p0;
        this.l5 = c05p02;
    }
}
