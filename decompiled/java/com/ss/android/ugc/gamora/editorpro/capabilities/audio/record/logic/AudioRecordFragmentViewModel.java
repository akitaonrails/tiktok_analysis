package com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic;

import X.C01GW;
import X.C0E5P;
import X.C349020DmG;
import X.C350340DoO;
import X.C352180DrM;
import X.C356530DyN;
import X.C361450EFb;
import X.C452501pT;
import X.InterfaceC2218151Brh;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic.AudioRecordFragmentViewModel;
import com.ss.android.vesdk.VEAudioRecorder;
import com.ss.android.vesdk.VERTAudioWaveformMgr;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes6.dex */
public final class AudioRecordFragmentViewModel extends ViewModel {
    public final MutableLiveData<List<Float>> LL;
    public final MutableLiveData LLILLJJLI;
    public final MutableLiveData<C349020DmG> LLILLL;
    public final MutableLiveData LLILZ;
    public final MutableLiveData<C350340DoO> LLILZIL;
    public final MutableLiveData LLILZLL;
    public final MutableLiveData<Unit> LLIZ;
    public final MutableLiveData<Unit> LLIZLLLIL;
    public final MutableLiveData<Integer> LLJ;
    public final MutableLiveData LLJI;
    public final List<Float> LLJIJIL;
    public final C01GW LLJILJIL;
    public C352180DrM LLJILJILJ;
    public final C01GW LLJILLL;
    public long LLJJ;
    public long LLJJI;
    public long LLJJIII;
    public boolean LLJJIJI;
    public final C361450EFb LLJJIJIIJIL;

    public final VEAudioRecorder vQ2() {
        return (VEAudioRecorder) this.LLJILJIL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0EFb] */
    public AudioRecordFragmentViewModel() {
        MutableLiveData<List<Float>> mutableLiveData = new MutableLiveData<>();
        this.LL = mutableLiveData;
        this.LLILLJJLI = mutableLiveData;
        MutableLiveData<C349020DmG> mutableLiveData2 = new MutableLiveData<>();
        this.LLILLL = mutableLiveData2;
        this.LLILZ = mutableLiveData2;
        MutableLiveData<C350340DoO> mutableLiveData3 = new MutableLiveData<>();
        this.LLILZIL = mutableLiveData3;
        this.LLILZLL = mutableLiveData3;
        MutableLiveData<Unit> mutableLiveData4 = new MutableLiveData<>();
        this.LLIZ = mutableLiveData4;
        this.LLIZLLLIL = mutableLiveData4;
        MutableLiveData<Integer> mutableLiveData5 = new MutableLiveData<>();
        this.LLJ = mutableLiveData5;
        this.LLJI = mutableLiveData5;
        this.LLJIJIL = new ArrayList();
        this.LLJILJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(127));
        this.LLJILLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(292));
        this.LLJJIJIIJIL = new InterfaceC2218151Brh() { // from class: X.0EFb
            @Override // X.InterfaceC2218151Brh
            public final void onInfo(int i, int i2, double d, Object obj) {
            }

            @Override // X.InterfaceC2218151Brh
            public final void LIZ(int i, byte[] bArr) {
                int length = bArr.length / 2;
                short[] sArr = new short[length];
                ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
                C01GW c01gw = C361440EFa.LIZ;
                int iProcess = ((VERTAudioWaveformMgr) c01gw.getValue()).process(sArr, 0, length / 2);
                float[] fArr = new float[iProcess];
                ((VERTAudioWaveformMgr) c01gw.getValue()).getRemainedPoints(fArr, 0, iProcess);
                ((ArrayList) this.LIZ.LLJIJIL).addAll(C13LQ.LJJLIL(fArr));
                int size = ((ArrayList) this.LIZ.LLJIJIL).size() * 30;
                C0E5P c0e5p = C0E5P.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("record time: ");
                sbLIZ.append(size);
                C356530DyN.LIZ(c0e5p, C2188811AlT.LIZIZ(sbLIZ));
                if (C0BYQ.LIZ()) {
                    AudioRecordFragmentViewModel audioRecordFragmentViewModel = this.LIZ;
                    if (audioRecordFragmentViewModel.LLJJIII <= 0) {
                        audioRecordFragmentViewModel.LL.postValue(C13LP.LLIIII(audioRecordFragmentViewModel.LLJIJIL));
                        return;
                    }
                }
                AudioRecordFragmentViewModel audioRecordFragmentViewModel2 = this.LIZ;
                if (audioRecordFragmentViewModel2.LLJJ + ((long) size) >= audioRecordFragmentViewModel2.LLJJIII) {
                    C356530DyN.LIZ(c0e5p, "record to the video end,auto stop audio recording");
                    this.LIZ.LLIZ.postValue(Unit.LIZ);
                } else {
                    audioRecordFragmentViewModel2.LL.postValue(C13LP.LLIIII(audioRecordFragmentViewModel2.LLJIJIL));
                }
            }

            @Override // X.InterfaceC2218151Brh
            public final void onError(int i, int i2, String str) {
                C0E5P c0e5p = C0E5P.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("recordListener onError errType=");
                sbLIZ.append(i);
                sbLIZ.append(", ret=");
                sbLIZ.append(i2);
                sbLIZ.append(", msg=");
                sbLIZ.append(str);
                C356530DyN.LIZJ(c0e5p, C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        vQ2().destory((Cert) this.LLJILLL.getValue());
        C356530DyN.LJ(C0E5P.LIZIZ, "on AudioRecordViewModelV2 cleared,destory VEAudioRecord");
    }
}
