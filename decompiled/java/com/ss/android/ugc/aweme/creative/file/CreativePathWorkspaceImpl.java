package com.ss.android.ugc.aweme.creative.file;

import X.C01GW;
import X.C0CHQ;
import X.C0VSJ;
import X.C1449640npK;
import X.C14D1;
import X.C14D3;
import X.C2188811AlT;
import X.C2286708xd;
import X.C2298208zU;
import X.C2347009Ho;
import X.C281040Azu;
import X.C452501pT;
import X.C570490MZb;
import X.EnumC20228214Cy;
import X.InterfaceC1294060jmO;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.file.CreativePathWorkspaceImpl;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl;
import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public final class CreativePathWorkspaceImpl implements WorkspaceImpl, C14D3 {
    public static int concatAudioIndex;
    public static int concatVideoIndex;
    public static int recordMP4Index;
    public String backgroundAudioFile;
    public final C01GW backgroundVideoDir$delegate;
    public String backgroundVideoFile;
    public final C01GW concatAudioName$delegate;
    public String concatAudioPath;
    public final C01GW concatDir$delegate;
    public final C01GW concatVideoName$delegate;
    public String concatVideoPath;
    public final CreativeInfo creativeInfo;
    public final C01GW diyPropVideoDir$delegate;
    public String diyPropVideoFile;
    public final C01GW encodedAudioOutputFile$delegate;
    public String localMusicUri;
    public String mMusicPath;
    public final C01GW mixDir$delegate;
    public Function0<? extends File> mp4FileProvider;
    public final C01GW originSoundDir$delegate;
    public final C01GW parallelUploadDir$delegate;
    public final C01GW parallelUploadOutputFile$delegate;
    public final C01GW recordCacheMp4Dir$delegate;
    public String recordDir;
    public final C01GW recordMP4Dir$delegate;
    public final C01GW recordMP4Name$delegate;
    public String recordMP4Path;
    public String recordMp4Mode;
    public final C01GW recordingMp4File$delegate;
    public final C01GW reverseDir$delegate;
    public final C01GW reversePath$delegate;
    public final C01GW synthesisDir$delegate;
    public String synthesiseOutputFile;
    public String tempMixMusicFile;
    public final C01GW tempMixOutputFile$delegate;
    public static final C14D1 CREATOR = new Parcelable.Creator<CreativePathWorkspaceImpl>() { // from class: X.14D1
        @Override // android.os.Parcelable.Creator
        public final CreativePathWorkspaceImpl createFromParcel(Parcel parcel) {
            return new CreativePathWorkspaceImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CreativePathWorkspaceImpl[] newArray(int i) {
            return new CreativePathWorkspaceImpl[i];
        }
    };
    public static final int $stable = 8;

    @Override // X.C14D3
    public final void LIZ() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void wQ() {
        this.mMusicPath = null;
        this.localMusicUri = null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void Di() {
        this.recordMp4Mode = "ecommerce_comment";
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final C0VSJ GQ() {
        if (this.recordDir.length() == 0) {
            return null;
        }
        return new C0VSJ(this.recordDir);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File Ho() {
        File fileInvoke;
        Function0<? extends File> function0 = this.mp4FileProvider;
        if (function0 != null && (fileInvoke = function0.invoke()) != null) {
            return fileInvoke;
        }
        if (Intrinsics.LJFF(this.recordMp4Mode, "ecommerce_comment")) {
            return new C0VSJ((String) this.recordingMp4File$delegate.getValue());
        }
        String strLJIIIIZZ = LJIIIIZZ();
        if (strLJIIIIZZ == null || strLJIIIIZZ.length() == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) this.recordMP4Dir$delegate.getValue());
            sbLIZ.append((String) this.recordMP4Name$delegate.getValue());
            this.recordMP4Path = C2188811AlT.LIZIZ(sbLIZ);
        }
        C0VSJ c0vsj = new C0VSJ(LJIIIIZZ());
        C570490MZb.LJFF(c0vsj.getParentFile());
        return c0vsj;
    }

    public final String LIZIZ() {
        return (String) this.concatAudioName$delegate.getValue();
    }

    public final String LIZJ() {
        return (String) this.concatDir$delegate.getValue();
    }

    public final String LIZLLL() {
        return (String) this.concatVideoName$delegate.getValue();
    }

    public final String LJ() {
        return (String) this.mixDir$delegate.getValue();
    }

    public final String LJFF() {
        return (String) this.originSoundDir$delegate.getValue();
    }

    public final String LJI() {
        return (String) this.parallelUploadDir$delegate.getValue();
    }

    public final String LJII() {
        return (String) this.recordCacheMp4Dir$delegate.getValue();
    }

    public final String LJIIIZ() {
        return (String) this.reverseDir$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File[] U4() {
        return new C0VSJ(this.recordDir).listFiles(new FilenameFilter() { // from class: X.14Cz
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return u.LJIIZILJ(str, "_frag_a", false);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final C0VSJ UK() {
        return new C0VSJ((String) this.encodedAudioOutputFile$delegate.getValue());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final C0VSJ XK() {
        String str = this.synthesiseOutputFile;
        if (str == null || str.length() == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) this.synthesisDir$delegate.getValue());
            sbLIZ.append(LIZLLL());
            this.synthesiseOutputFile = C2188811AlT.LIZIZ(sbLIZ);
        }
        return new C0VSJ(this.synthesiseOutputFile);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File[] Ym() {
        return new C0VSJ(this.recordDir).listFiles(new FilenameFilter() { // from class: X.14D0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return u.LJIIZILJ(str, "_frag_v", false);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final C0VSJ cF() {
        return new C0VSJ((String) this.parallelUploadOutputFile$delegate.getValue());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void eb() {
        if (this.tempMixMusicFile == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.mMusicPath);
            sbLIZ.append(".wav");
            this.tempMixMusicFile = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).getPath();
        }
        C0VSJ c0vsj = new C0VSJ(this.tempMixMusicFile);
        if (c0vsj.exists()) {
            c0vsj.delete();
        }
        C0VSJ c0vsj2 = new C0VSJ((String) this.tempMixOutputFile$delegate.getValue());
        if (c0vsj2.exists()) {
            c0vsj2.delete();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void hH() {
        if (Intrinsics.LJFF(this.recordMp4Mode, "ecommerce_comment")) {
            File fileHo = Ho();
            if (fileHo.exists()) {
                fileHo.delete();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final C0VSJ Bg() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) this.backgroundVideoDir$delegate.getValue());
        sbLIZ.append(C1449640npK.LIZ("-bgv-v"));
        this.backgroundVideoFile = C2188811AlT.LIZIZ(sbLIZ);
        C0VSJ c0vsj = new C0VSJ(this.backgroundVideoFile);
        C570490MZb.LJFF(c0vsj.getParentFile());
        return c0vsj;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final C0VSJ Jj() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) this.diyPropVideoDir$delegate.getValue());
        sbLIZ.append(C1449640npK.LIZ(".mp4"));
        this.diyPropVideoFile = C2188811AlT.LIZIZ(sbLIZ);
        C0VSJ c0vsj = new C0VSJ(this.diyPropVideoFile);
        C570490MZb.LJFF(c0vsj.getParentFile());
        return c0vsj;
    }

    public final String LJIIIIZZ() {
        if (C281040Azu.LIZ() && this.recordMP4Path == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) this.recordMP4Dir$delegate.getValue());
            sbLIZ.append((String) this.recordMP4Name$delegate.getValue());
            this.recordMP4Path = C2188811AlT.LIZIZ(sbLIZ);
        }
        return this.recordMP4Path;
    }

    public final String getConcatAudioPath() {
        if (C281040Azu.LIZ() && this.concatAudioPath == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZJ());
            sbLIZ.append(LIZIZ());
            this.concatAudioPath = C2188811AlT.LIZIZ(sbLIZ);
        }
        return this.concatAudioPath;
    }

    public final String getConcatVideoPath() {
        if (C281040Azu.LIZ() && this.concatVideoPath == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZJ());
            sbLIZ.append(LIZLLL());
            this.concatVideoPath = C2188811AlT.LIZIZ(sbLIZ);
        }
        return this.concatVideoPath;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final C0VSJ oy() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) this.backgroundVideoDir$delegate.getValue());
        sbLIZ.append(C1449640npK.LIZ("-bgv-a"));
        this.backgroundAudioFile = C2188811AlT.LIZIZ(sbLIZ);
        C0VSJ c0vsj = new C0VSJ(this.backgroundAudioFile);
        C570490MZb.LJFF(c0vsj.getParentFile());
        return c0vsj;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final C0VSJ s4() {
        String concatAudioPath = getConcatAudioPath();
        if (concatAudioPath == null || concatAudioPath.length() == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZJ());
            sbLIZ.append(LIZIZ());
            this.concatAudioPath = C2188811AlT.LIZIZ(sbLIZ);
        }
        C0VSJ c0vsj = new C0VSJ(getConcatAudioPath());
        C570490MZb.LJFF(c0vsj.getParentFile());
        return c0vsj;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final C0VSJ uR() {
        String concatVideoPath = getConcatVideoPath();
        if (concatVideoPath == null || concatVideoPath.length() == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZJ());
            sbLIZ.append(LIZLLL());
            this.concatVideoPath = C2188811AlT.LIZIZ(sbLIZ);
        }
        C0VSJ c0vsj = new C0VSJ(getConcatVideoPath());
        C570490MZb.LJFF(c0vsj.getParentFile());
        return c0vsj;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final String getMusicPath() {
        return this.mMusicPath;
    }

    public CreativePathWorkspaceImpl(CreativeInfo creativeInfo) {
        this.creativeInfo = creativeInfo;
        this.recordDir = C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.RECORD, null, false, 12);
        this.concatDir$delegate = C452501pT.LIZIZ(new AwS574S0100000_30(this, 34));
        this.recordMP4Dir$delegate = C452501pT.LIZIZ(new AwS574S0100000_30(this, 42));
        this.reverseDir$delegate = C452501pT.LIZIZ(new AwS574S0100000_30(this, 44));
        this.mixDir$delegate = C452501pT.LIZIZ(new AwS574S0100000_30(this, 37));
        this.synthesisDir$delegate = C452501pT.LIZIZ(new AwS574S0100000_30(this, 46));
        this.originSoundDir$delegate = C452501pT.LIZIZ(new AwS574S0100000_30(this, 38));
        this.parallelUploadDir$delegate = C452501pT.LIZIZ(new AwS574S0100000_30(this, 39));
        this.backgroundVideoDir$delegate = C452501pT.LIZIZ(new AwS574S0100000_30(this, 33));
        this.diyPropVideoDir$delegate = C452501pT.LIZIZ(new AwS574S0100000_30(this, 35));
        this.recordCacheMp4Dir$delegate = C452501pT.LIZIZ(new AwS574S0100000_30(this, 41));
        this.concatVideoName$delegate = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(65));
        this.concatAudioName$delegate = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(64));
        this.recordMP4Name$delegate = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(66));
        this.reversePath$delegate = C452501pT.LIZIZ(new AwS574S0100000_30(this, 45));
        this.tempMixOutputFile$delegate = C452501pT.LIZIZ(new AwS574S0100000_30(this, 47));
        this.encodedAudioOutputFile$delegate = C452501pT.LIZIZ(new AwS574S0100000_30(this, 36));
        this.parallelUploadOutputFile$delegate = C452501pT.LIZIZ(new AwS574S0100000_30(this, 40));
        this.recordingMp4File$delegate = C452501pT.LIZIZ(new AwS574S0100000_30(this, 43));
        this.backgroundVideoFile = "";
        this.backgroundAudioFile = "";
        this.diyPropVideoFile = "";
        this.recordMp4Mode = "";
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void MC(String str) {
        wQ();
        this.mMusicPath = str;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final C0VSJ VD(int i) {
        String str = this.recordDir;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append("_frag_v");
        return new C0VSJ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void g9(C2347009Ho c2347009Ho) {
        this.mp4FileProvider = c2347009Ho;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void kr(String str) {
        if (str != null && str.length() != 0) {
            this.recordDir = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void ll(String str) {
        if (C2286708xd.LIZJ(str)) {
            new C0VSJ(str).delete();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CreativePathWorkspaceImpl(Parcel parcel) {
        CreativeInfo creativeInfo = (CreativeInfo) parcel.readParcelable(CreativeInfo.class.getClassLoader());
        this(creativeInfo == null ? new CreativeInfo(null, 0, null, 7, null) : creativeInfo);
        if (C281040Azu.LIZ()) {
            this.concatVideoPath = parcel.readString();
            this.concatAudioPath = parcel.readString();
            this.tempMixMusicFile = parcel.readString();
            this.synthesiseOutputFile = parcel.readString();
            this.mMusicPath = parcel.readString();
            this.localMusicUri = parcel.readString();
            return;
        }
        String string = parcel.readString();
        if (string == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZJ());
            sbLIZ.append(LIZLLL());
            string = C2188811AlT.LIZIZ(sbLIZ);
        }
        this.concatVideoPath = string;
        String string2 = parcel.readString();
        if (string2 == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(LIZJ());
            sbLIZ2.append(LIZIZ());
            string2 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        this.concatAudioPath = string2;
        this.tempMixMusicFile = parcel.readString();
        String string3 = parcel.readString();
        if (string3 == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append((String) this.synthesisDir$delegate.getValue());
            sbLIZ3.append(LIZLLL());
            string3 = C2188811AlT.LIZIZ(sbLIZ3);
        }
        this.synthesiseOutputFile = string3;
        this.mMusicPath = parcel.readString();
        this.localMusicUri = parcel.readString();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final C0VSJ Af(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('/');
        sbLIZ.append(str2);
        this.backgroundVideoFile = C2188811AlT.LIZIZ(sbLIZ);
        C0VSJ c0vsj = new C0VSJ(this.backgroundVideoFile);
        C570490MZb.LJFF(c0vsj.getParentFile());
        return c0vsj;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.creativeInfo, i);
        parcel.writeString(getConcatVideoPath());
        parcel.writeString(getConcatAudioPath());
        parcel.writeString(this.tempMixMusicFile);
        parcel.writeString(this.synthesiseOutputFile);
        parcel.writeString(this.mMusicPath);
        parcel.writeString(this.localMusicUri);
    }
}
