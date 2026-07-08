package kotlin.jvm.internal;

import X.C09AY;
import X.C15LG;
import X.C1661100tKO;
import X.C20359714lX;
import X.C20360614lg;
import X.C20361214lm;
import X.C20634015og;
import X.InterfaceC20359614lW;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.dialog.PriorityTaskDispatcher;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public class AwS81S0301000_31 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS81S0301000_31 awS81S0301000_31) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.observe((LifecycleOwner) awS81S0301000_31.l0, (Observer) awS81S0301000_31.l1);
        ((PriorityTaskDispatcher) awS81S0301000_31.l2).LLILLL.append(awS81S0301000_31.i3, new C20634015og(mutableLiveData, (Observer) awS81S0301000_31.l1));
        ((PriorityTaskDispatcher) awS81S0301000_31.l2).LLILLJJLI.add(Integer.valueOf(awS81S0301000_31.i3));
        PriorityTaskDispatcher priorityTaskDispatcher = (PriorityTaskDispatcher) awS81S0301000_31.l2;
        if (!priorityTaskDispatcher.LLILZIL) {
            priorityTaskDispatcher.LLILZIL = true;
            priorityTaskDispatcher.vQ2();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS81S0301000_31 awS81S0301000_31) {
        C20359714lX c20359714lX = (C20359714lX) awS81S0301000_31.l0;
        long j = ((C20361214lm) awS81S0301000_31.l1).LIZIZ;
        c20359714lX.LJIIZILJ = j;
        InterfaceC20359614lW interfaceC20359614lW = c20359714lX.LJII;
        if (interfaceC20359614lW != null) {
            interfaceC20359614lW.LIZ(awS81S0301000_31.i3, j, ((C20360614lg) awS81S0301000_31.l2).LIZIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS81S0301000_31 awS81S0301000_31) {
        C20359714lX c20359714lX = (C20359714lX) awS81S0301000_31.l0;
        long j = ((C20361214lm) awS81S0301000_31.l1).LIZIZ;
        c20359714lX.LJIIZILJ = j;
        InterfaceC20359614lW interfaceC20359614lW = c20359714lX.LJII;
        if (interfaceC20359614lW != null) {
            interfaceC20359614lW.LIZ(awS81S0301000_31.i3, j, ((C20360614lg) awS81S0301000_31.l2).LIZIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS81S0301000_31 awS81S0301000_31) {
        ((MusicModel) awS81S0301000_31.l0).setDownloadComplete(true);
        ((MusicModel) awS81S0301000_31.l0).setDownloadAfterGoNext(false);
        C15LG c15lg = (C15LG) awS81S0301000_31.l1;
        String strLJFF = ((C1661100tKO) awS81S0301000_31.l2).LJFF();
        if (strLJFF == null) {
            strLJFF = ((MusicModel) awS81S0301000_31.l0).getDownloadUrl();
        }
        c15lg.eL(awS81S0301000_31.i3, (MusicModel) awS81S0301000_31.l0, strLJFF);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS81S0301000_31(C20359714lX c20359714lX, C20361214lm c20361214lm, C20360614lg c20360614lg, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c20359714lX;
        this.l1 = c20361214lm;
        this.l2 = c20360614lg;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS81S0301000_31(LifecycleOwner lifecycleOwner, LifecycleOwner lifecycleOwner2, Observer<Integer> observer, PriorityTaskDispatcher priorityTaskDispatcher, int i) {
        super(0);
        this.$t = i;
        this.l0 = lifecycleOwner;
        this.l1 = lifecycleOwner2;
        this.l2 = observer;
        this.i3 = priorityTaskDispatcher;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS81S0301000_31(MusicModel musicModel, C15LG c15lg, C1661100tKO c1661100tKO, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = musicModel;
        this.l1 = c15lg;
        this.l2 = c1661100tKO;
        this.i3 = i;
    }
}
