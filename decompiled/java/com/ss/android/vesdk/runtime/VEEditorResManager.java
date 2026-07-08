package com.ss.android.vesdk.runtime;

import X.C0VSJ;
import X.C1293970jmF;
import X.C2188811AlT;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes36.dex */
public class VEEditorResManager {
    public String[] mAudioPaths;
    public String mComposedVideoPath;
    public String mCropedAudioPath;
    public String mCropedVideoPath;
    public int mOriginalSoundTrackIndex;
    public int mOriginalSoundTrackType;
    public boolean mReverseAudioDone;
    public String[] mReverseAudioPaths;
    public ArrayList<String> mReverseCacheFiles = new ArrayList<>();
    public boolean mReverseDone;
    public String[] mReverseVideoPath;
    public int mTimeMode;
    public String[] mTransitions;
    public String[] mVideoPaths;
    public String mWorkSpace;

    public void clearReverseCacheFiles() {
        ArrayList<String> arrayList = this.mReverseCacheFiles;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Iterator<String> it2 = this.mReverseCacheFiles.iterator();
        while (it2.hasNext()) {
            C0VSJ c0vsj = new C0VSJ(it2.next());
            if (c0vsj.exists()) {
                c0vsj.delete();
            }
        }
    }

    public String genComposedVideoPath() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1293970jmF.LIZIZ(this.mWorkSpace, "compose"));
        sbLIZ.append(File.separator);
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append("_");
        sbLIZ.append("composed");
        sbLIZ.append(".mp4");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getWorkspace() {
        return this.mWorkSpace;
    }

    public VEEditorResManager(String str) {
        this.mWorkSpace = str;
    }

    public String genReverseVideoPath(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1293970jmF.LIZIZ(this.mWorkSpace, "concat"));
        sbLIZ.append(File.separator);
        sbLIZ.append(str);
        sbLIZ.append("_");
        sbLIZ.append("reverse");
        sbLIZ.append(".mp4");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.mReverseCacheFiles.add(strLIZIZ);
        return strLIZIZ;
    }

    public String genSeqAudioPath(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1293970jmF.LIZIZ(this.mWorkSpace, "concat"));
        sbLIZ.append(File.separator);
        sbLIZ.append(str);
        sbLIZ.append("_");
        sbLIZ.append("reverse");
        sbLIZ.append(".wav");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.mReverseCacheFiles.add(strLIZIZ);
        return strLIZIZ;
    }
}
