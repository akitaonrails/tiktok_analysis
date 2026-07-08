package com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter;

import X.C0165003f;
import X.C1116150f9R;
import X.C1116190f9V;
import X.C1116210f9X;
import X.C1116220f9Y;
import X.C1116230f9Z;
import X.C1116380f9o;
import X.C1151670g4j;
import X.C1161920gLG;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C520890Kbn;
import X.C786410Ut5;
import X.EnumC1116160f9S;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentConfig;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class StarCommentViewModel extends ViewModel {
    public DataChannel LLILZIL;
    public C1116230f9Z LLILZLL;
    public boolean LLIZ;
    public long LLJI;
    public long LLJIJIL;
    public boolean LLJILJILJ;
    public final MutableLiveData<C1116220f9Y> LL = new MutableLiveData<>(new C1116220f9Y(new ArrayList()));
    public final MutableLiveData<C1116210f9X> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<List<C1116210f9X>> LLILLL = new MutableLiveData<>(new ArrayList());
    public final MutableLiveData<C1116150f9R> LLILZ = new MutableLiveData<>();
    public String LLIZLLLIL = "";
    public final HashSet<String> LLJ = new HashSet<>();
    public final BPEAHandler LLJILJIL = new BPEAHandler(Looper.getMainLooper(), new C1151670g4j(this, 1));
    public final HashMap<String, C1116210f9X> LLJILLL = new HashMap<>();

    public final void reset() {
        this.LLILLJJLI.setValue(null);
        MutableLiveData<List<C1116210f9X>> mutableLiveData = this.LLILLL;
        List<C1116210f9X> value = mutableLiveData.getValue();
        if (value != null) {
            value.clear();
        } else {
            value = null;
        }
        mutableLiveData.setValue(value);
        this.LLILZ.setValue(null);
        this.LLJI = 0L;
        this.LLJILLL.clear();
        C1116230f9Z c1116230f9Z = this.LLILZLL;
        if (c1116230f9Z == null || c1116230f9Z.LLJJIII != 3) {
            return;
        }
        c1116230f9Z.LJIIJJI(0);
    }

    public final boolean xQ2() {
        DataChannel dataChannel;
        Room room;
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus.StarCommentPermissionSwitch starCommentPermissionSwitch;
        C1116230f9Z c1116230f9Z = this.LLILZLL;
        if (c1116230f9Z != null) {
            if (((c1116230f9Z.LLJJIII == 1) || (c1116230f9Z != null && c1116230f9Z.LLJJIII == 2)) && ((dataChannel = this.LLILZIL) == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || (starCommentPermissionSwitch = roomAuthStatus.starCommentPermissionSwitch) == null || starCommentPermissionSwitch.status != 2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[PHI: r8
      0x005a: PHI (r8v1 X.0f9X) = (r8v4 X.0f9X), (r8v7 X.0f9X) binds: [B:16:0x0058, B:10:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zQ2() {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.StarCommentViewModel.zQ2():void");
    }

    public final void vQ2() {
        IMessageManager iMessageManager;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.LLJILJIL.removeMessages(1);
        this.LLJILJIL.removeMessages(2);
        C1116210f9X value = this.LLILLJJLI.getValue();
        if (value == null) {
            List<C1116210f9X> value2 = this.LLILLL.getValue();
            if (value2 == null || value2.isEmpty()) {
                return;
            }
            wQ2(this.LLILLL.getValue(), true);
            return;
        }
        if (value.LLJI + value.LLILZIL + value.LLJILJIL > SystemClock.elapsedRealtime()) {
            EnumC1116160f9S enumC1116160f9S = value.LLJIJIL;
            if (enumC1116160f9S != EnumC1116160f9S.BLANK && enumC1116160f9S != EnumC1116160f9S.SELF_WAITING) {
                value.LLJ = (((value.LLILZIL - (SystemClock.elapsedRealtime() - value.LLJI)) + 499) + value.LLJILJIL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                this.LLILLJJLI.setValue(value);
            } else if (SystemClock.elapsedRealtime() - value.LLJI >= value.LLJILJIL) {
                value.LLJIJIL = EnumC1116160f9S.DISPLAYING;
                this.LLILLJJLI.setValue(value);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("update status -> ");
                sbLIZ.append(C1116190f9V.LIZIZ(value.LLJIJIL));
                C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("progress difference: ");
                sbLIZ2.append(System.currentTimeMillis() - value.LLILZ);
                sbLIZ2.append("ms");
                C2188811AlT.LIZIZ(sbLIZ2);
            }
            MutableLiveData<List<C1116210f9X>> mutableLiveData = this.LLILLL;
            mutableLiveData.setValue(mutableLiveData.getValue());
            zQ2();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            BPEAHandler bPEAHandler = this.LLJILJIL;
            C786410Ut5.LJLJLJ(bPEAHandler, bPEAHandler.obtainMessage(1), 1000 - (jElapsedRealtime2 - jElapsedRealtime));
            return;
        }
        this.LLJ.add(value.LL);
        C1116230f9Z c1116230f9Z = this.LLILZLL;
        boolean z = c1116230f9Z != null && c1116230f9Z.LLJJIII == 1;
        ChatMessage chatMessage = null;
        if (z) {
            MutableLiveData<C1116220f9Y> mutableLiveData2 = this.LL;
            C1116220f9Y value3 = mutableLiveData2.getValue();
            if (value3 != null) {
                value3.LIZ(value);
            } else {
                value3 = null;
            }
            mutableLiveData2.setValue(value3);
        }
        C1116230f9Z c1116230f9Z2 = this.LLILZLL;
        if (c1116230f9Z2 != null && (iMessageManager = c1116230f9Z2.LLILZLL) != null) {
            IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
            Room roomLJI = c1116230f9Z2.LJI();
            long id = roomLJI != null ? roomLJI.getId() : 0L;
            String str = value.LLILLL;
            User user = (User) c1116230f9Z2.LLJ.get(Long.valueOf(value.LLILLJJLI.getId()));
            if (user == null) {
                user = value.LLILLJJLI;
            }
            ChatMessage chatMessageV41 = iPublicScreenService.v41(id, str, user, new C520890Kbn("", C0165003f.LIZ(value.LLJJIJI)), Long.valueOf(value.getMessageId()));
            if (chatMessageV41 != null) {
                chatMessageV41.contentLanguage = value.LLIZLLLIL;
                chatMessage = chatMessageV41;
            }
            iMessageManager.insertMessage(chatMessage, true);
        }
        wQ2(this.LLILLL.getValue(), false);
    }

    public final void yQ2(List<C1116210f9X> list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            wQ2(list, true);
        }
        C500260Jjc.LJJJLIIL(list, new AwS596S0100000_17(this, 163));
        this.LLJIJIL = -1L;
        C1116210f9X value = this.LLILLJJLI.getValue();
        if (value != null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (((C1116210f9X) ListProtector.get(list, i)).LLILZ >= value.LLILZ && ((C1116210f9X) ListProtector.get(list, i)).LLILZ < value.LLILZ + value.LLILZIL) {
                    if (i >= 0) {
                        if (Intrinsics.LJFF(value.LL, ((C1116210f9X) ListProtector.get(list, i)).LL)) {
                            if (i < arrayList.size()) {
                                MutableLiveData<List<C1116210f9X>> mutableLiveData = this.LLILLL;
                                List<C1116210f9X> listSubList = arrayList.subList(i + 1, arrayList.size());
                                AQ2(value.LLJI + value.LLJILJIL + value.LLILZIL, listSubList);
                                mutableLiveData.setValue(listSubList);
                            } else {
                                this.LLILLL.setValue(new ArrayList());
                            }
                            long j = ((C1116210f9X) ListProtector.get(list, i)).LLILZ;
                            value.LLILZ = j;
                            C1116230f9Z c1116230f9Z = this.LLILZLL;
                            if (c1116230f9Z != null) {
                                c1116230f9Z.LLIZLLLIL = j;
                                return;
                            }
                            return;
                        }
                        wQ2(arrayList.subList(i, arrayList.size()), true);
                        return;
                    }
                } else {
                    i++;
                }
            }
            if (!(!arrayList.isEmpty()) || ((C1116210f9X) ListProtector.get(list, 0)).LLILZ <= value.LLILZ) {
                return;
            }
            MutableLiveData<List<C1116210f9X>> mutableLiveData2 = this.LLILLL;
            AQ2(value.LLJI + value.LLJILJIL + value.LLILZIL, list);
            mutableLiveData2.setValue(list);
            return;
        }
        if (!(!arrayList.isEmpty())) {
            return;
        }
        this.LLILLL.setValue(list);
        vQ2();
    }

    public static void AQ2(long j, List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1116210f9X c1116210f9X = (C1116210f9X) it2.next();
            c1116210f9X.LLJI = j;
            j += c1116210f9X.LLJILJIL + c1116210f9X.LLILZIL;
        }
    }

    public final void wQ2(List<C1116210f9X> list, boolean z) {
        this.LLJILJIL.removeMessages(1);
        this.LLJILJIL.removeMessages(2);
        if (list != null && !list.isEmpty()) {
            C1116210f9X c1116210f9X = (C1116210f9X) ListProtector.remove(list, 0);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (c1116210f9X.LLJIJIL == EnumC1116160f9S.SELF_WAITING) {
                c1116210f9X.LLJILJIL = LiveStarCommentConfig.INSTANCE.getSettingValue();
            } else if (z) {
                c1116210f9X.LLJILJIL = 0L;
                c1116210f9X.LLJIJIL = EnumC1116160f9S.DISPLAYING;
            } else {
                long j = this.LLJIJIL;
                if (j > 0 && j < c1116210f9X.LLILZ) {
                    c1116210f9X.LLJILJIL = C1116380f9o.LIZLLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("display fast ");
                    sbLIZ.append(c1116210f9X.LLILZ - this.LLJIJIL);
                    sbLIZ.append("ms");
                    C2188811AlT.LIZIZ(sbLIZ);
                } else if (j > c1116210f9X.LLILZ) {
                    c1116210f9X.LLJILJIL = C1116380f9o.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("display slow ");
                    sbLIZ2.append(this.LLJIJIL - c1116210f9X.LLILZ);
                    sbLIZ2.append("ms");
                    C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    c1116210f9X.LLJILJIL = C1116380f9o.LIZJ;
                }
                c1116210f9X.LLJIJIL = EnumC1116160f9S.BLANK;
            }
            c1116210f9X.LLJI = jElapsedRealtime;
            c1116210f9X.LLJ = c1116210f9X.LLILZIL / 1000;
            this.LLILLJJLI.setValue(c1116210f9X);
            C1116230f9Z c1116230f9Z = this.LLILZLL;
            if (c1116230f9Z != null) {
                c1116230f9Z.LLIZLLLIL = c1116210f9X.LLILZ;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("play next -> ");
            sbLIZ3.append(C1116190f9V.LIZIZ(c1116210f9X.LLJIJIL));
            C2188811AlT.LIZIZ(sbLIZ3);
            MutableLiveData<List<C1116210f9X>> mutableLiveData = this.LLILLL;
            AQ2(c1116210f9X.LLILZIL + jElapsedRealtime + c1116210f9X.LLJILJIL, list);
            mutableLiveData.setValue(list);
            zQ2();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            BPEAHandler bPEAHandler = this.LLJILJIL;
            C786410Ut5.LJLJLJ(bPEAHandler, bPEAHandler.obtainMessage(1), ((long) LSPassThroughRecordSizeConfig.DEFAULT) - (jElapsedRealtime2 - jElapsedRealtime));
            return;
        }
        reset();
    }
}
