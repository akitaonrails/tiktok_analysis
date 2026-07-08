package com.ss.bytertc.engine;

import X.C09NT;
import X.C0WZX;
import X.C2188811AlT;
import X.C2204961BRm;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.webkit.URLUtil;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.util.Vector;

/* JADX INFO: loaded from: classes21.dex */
public class RtcAudioFileDecoder {
    public boolean eoInputStream;
    public boolean eoOutputStream;
    public int mChannels;
    public byte[] mDecodedData;
    public MediaExtractor mExtractor;
    public long mFileLength;
    public ByteBuffer[] mInputBuffers;
    public MediaCodec mMediaCodec;
    public ByteBuffer[] mOutputBuffers;
    public int mRetryCount;
    public int mSampleRate;
    public Vector<Integer> mTrackIds;
    public MediaFormat mUsedTrackFormat;
    public int mUsedTrackIdx;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public HttpURLConnection f439oc;

    private boolean checkInfoChange() {
        try {
            MediaFormat outputFormat = this.mMediaCodec.getOutputFormat();
            int integer = outputFormat.getInteger("sample-rate");
            int integer2 = outputFormat.getInteger("channel-count");
            boolean z = (this.mSampleRate == integer && this.mChannels == integer2) ? false : true;
            this.mSampleRate = integer;
            this.mChannels = integer2;
            return z;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Logging.e("RtcAudioFileDecoder", "Error when checking file's new format");
            return false;
        }
    }

    public void disConnectURL() {
        Logging.e("RtcAudioFileDecoder", "disConnectURL");
        HttpURLConnection httpURLConnection = this.f439oc;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public int getAudioTrackCount() {
        Vector<Integer> vector = this.mTrackIds;
        if (vector == null) {
            return 0;
        }
        return vector.size();
    }

    public long getCurrentFilePosition() {
        try {
            return this.mExtractor.getSampleTime() / 1000;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Logging.e("RtcAudioFileDecoder", "Error when getCurrentFilePosition");
            return 0L;
        }
    }

    public long getFileLength() {
        return this.mFileLength / 1000;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010e A[Catch: Exception -> 0x0154, TryCatch #0 {Exception -> 0x0154, blocks: (B:3:0x0004, B:5:0x0008, B:7:0x000c, B:9:0x0014, B:11:0x001a, B:13:0x0028, B:14:0x002b, B:16:0x003b, B:17:0x003d, B:18:0x0047, B:20:0x004b, B:26:0x0062, B:28:0x0066, B:30:0x006d, B:31:0x006f, B:35:0x0084, B:36:0x008f, B:38:0x0094, B:41:0x00ce, B:42:0x00d1, B:40:0x00bb, B:43:0x00d8, B:45:0x00e2, B:47:0x00ee, B:49:0x00fa, B:51:0x0104, B:53:0x010e, B:54:0x0142, B:55:0x014c, B:56:0x0151), top: B:62:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean readAudioData() {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.RtcAudioFileDecoder.readAudioData():boolean");
    }

    public void uninit() {
        try {
            MediaCodec mediaCodec = this.mMediaCodec;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mMediaCodec.release();
                this.mMediaCodec = null;
            }
            MediaExtractor mediaExtractor = this.mExtractor;
            if (mediaExtractor != null) {
                mediaExtractor.release();
                this.mExtractor = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error when releasing audio file stream");
            sbLIZ.append(e.getMessage());
            Logging.e("RtcAudioFileDecoder", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.eoOutputStream = false;
        this.eoInputStream = false;
    }

    public RtcAudioFileDecoder() {
        Logging.e("RtcAudioFileDecoder", "AudioMix RtcAudioFileDecoder");
    }

    public int getChannelCount() {
        return this.mChannels;
    }

    public byte[] getDecodedData() {
        return this.mDecodedData;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public int getUsedTrackIdx() {
        return this.mUsedTrackIdx;
    }

    public static URLConnection INVOKEVIRTUAL_com_ss_bytertc_engine_RtcAudioFileDecoder_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
        return C2204961BRm.e0(url, new C0WZX("dzBzEhEpEcjFQVIzURHKY0i/duFJK8UWX9ItYsQ5i73mSs+XrQbi43s=", null));
    }

    private boolean checkUrlEncoded(String str) {
        try {
            return !TextUtils.equals(str, URLDecoder.decode(str, "UTF-8"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Logging.e("RtcAudioFileDecoder", "Error when releasing audio file stream");
            return false;
        }
    }

    private String encodeUrl(String str) {
        Logging.e("RtcAudioFileDecoder", "encodedUrl");
        try {
            URL url = new URL(str);
            return new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toASCIIString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }

    private boolean isAvailableOnlineURL(String str) {
        boolean z;
        Logging.e("RtcAudioFileDecoder", "isAvailableOnlineURL");
        this.f439oc = null;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) INVOKEVIRTUAL_com_ss_bytertc_engine_RtcAudioFileDecoder_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(new URL(str));
                this.f439oc = httpURLConnection;
                httpURLConnection.setUseCaches(false);
                this.f439oc.setConnectTimeout(4000);
                Logging.e("RtcAudioFileDecoder", "connect done....");
                int responseCode = this.f439oc.getResponseCode();
                if (200 == responseCode) {
                    z = true;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("url is not available, error:");
                    sbLIZ.append(responseCode);
                    Logging.e("RtcAudioFileDecoder", C2188811AlT.LIZIZ(sbLIZ));
                    z = false;
                }
                InputStream inputStream = this.f439oc.getInputStream();
                if (inputStream != null) {
                    inputStream.close();
                }
                HttpURLConnection httpURLConnection2 = this.f439oc;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return z;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("++Error when test online url: ");
                sbLIZ2.append(e.getMessage());
                Logging.e("RtcAudioFileDecoder", C2188811AlT.LIZIZ(sbLIZ2));
                HttpURLConnection httpURLConnection3 = this.f439oc;
                if (httpURLConnection3 != null) {
                    httpURLConnection3.disconnect();
                }
                return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            HttpURLConnection httpURLConnection4 = this.f439oc;
            if (httpURLConnection4 != null) {
                httpURLConnection4.disconnect();
            }
            throw th;
        }
    }

    public boolean selectTrack(int i) {
        try {
            Vector<Integer> vector = this.mTrackIds;
            if (vector == null || i + 1 > vector.size() || this.mUsedTrackIdx == i) {
                return false;
            }
            MediaExtractor mediaExtractor = this.mExtractor;
            if (mediaExtractor != null && this.mMediaCodec != null) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(this.mTrackIds.get(i).intValue());
                if (this.mSampleRate != trackFormat.getInteger("sample-rate")) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("mSampleRate = ");
                    sbLIZ.append(this.mSampleRate);
                    sbLIZ.append(", used_SampleRate = ");
                    sbLIZ.append(trackFormat.getInteger("sample-rate"));
                    Logging.e("RtcAudioFileDecoder", C2188811AlT.LIZIZ(sbLIZ));
                    return false;
                }
                long sampleTime = this.mExtractor.getSampleTime();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("++current_postion = ");
                sbLIZ2.append(sampleTime);
                Logging.e("RtcAudioFileDecoder", C2188811AlT.LIZIZ(sbLIZ2));
                this.mExtractor.unselectTrack(this.mTrackIds.get(this.mUsedTrackIdx).intValue());
                this.mMediaCodec.stop();
                trackFormat.getString("mime");
                this.mExtractor.selectTrack(this.mTrackIds.get(i).intValue());
                this.mExtractor.seekTo(sampleTime, 2);
                this.mMediaCodec.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
                this.mMediaCodec.start();
                this.mUsedTrackFormat = trackFormat;
                this.mUsedTrackIdx = i;
                return true;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("mExtractor or mMediaCodec is null, mExtractor = ");
            sbLIZ3.append(this.mExtractor);
            sbLIZ3.append(", mMediaCodec = ");
            sbLIZ3.append(this.mMediaCodec);
            Logging.e("RtcAudioFileDecoder", C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Logging.e("RtcAudioFileDecoder", "Error when selectTrack");
            return false;
        }
    }

    public void setCurrentFilePosition(long j) {
        if (this.eoOutputStream) {
            try {
                this.mMediaCodec.flush();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Logging.e("RtcAudioFileDecoder", "Error when setCurrentFilePosition, mMediaCodec.flush");
            }
        }
        try {
            this.mExtractor.seekTo(j * 1000, 2);
            this.eoInputStream = false;
            this.eoOutputStream = false;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            Logging.e("RtcAudioFileDecoder", "Error when setCurrentFilePosition, mExtractor.seekTo");
        }
    }

    public boolean init(String str, int i) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Try to decode audio file : ");
            sbLIZ.append(str);
            Logging.i("RtcAudioFileDecoder", C2188811AlT.LIZIZ(sbLIZ));
            this.mTrackIds = new Vector<>();
            if (URLUtil.isNetworkUrl(str)) {
                if (!checkUrlEncoded(str)) {
                    str = encodeUrl(str);
                }
                if (str == null || !isAvailableOnlineURL(str)) {
                    return false;
                }
            }
            this.mRetryCount = 0;
            this.mExtractor = new MediaExtractor();
            Context applicationContext = ContextUtils.getApplicationContext();
            if (!str.startsWith("/assets/") || applicationContext == null) {
                if (str.startsWith("content://") && applicationContext != null) {
                    this.mExtractor.setDataSource(C09NT.LIZLLL(applicationContext.getContentResolver(), UriProtector.parse(str), "r").getFileDescriptor());
                } else {
                    this.mExtractor.setDataSource(str);
                }
            } else {
                AssetFileDescriptor assetFileDescriptorOpenFd = applicationContext.getAssets().openFd(str.substring(8));
                this.mExtractor.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
            }
            int trackCount = this.mExtractor.getTrackCount();
            for (int i2 = 0; i2 < trackCount; i2++) {
                this.mExtractor.unselectTrack(i2);
            }
            if (i + 1 > trackCount) {
                Logging.e("RtcAudioFileDecoder", "useTrack > trackCount");
                return false;
            }
            this.mChannels = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < trackCount; i4++) {
                MediaFormat trackFormat = this.mExtractor.getTrackFormat(i4);
                String string = trackFormat.getString("mime");
                if (string.contains("audio/")) {
                    if (i == i3) {
                        this.mExtractor.selectTrack(i4);
                        MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
                        this.mMediaCodec = mediaCodecCreateDecoderByType;
                        mediaCodecCreateDecoderByType.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
                        this.mUsedTrackFormat = trackFormat;
                        this.mUsedTrackIdx = i3;
                    }
                    i3++;
                    this.mTrackIds.addElement(new Integer(i4));
                    int integer = trackFormat.getInteger("channel-count");
                    if (integer > this.mChannels) {
                        this.mChannels = integer;
                    }
                }
            }
            MediaCodec mediaCodec = this.mMediaCodec;
            if (mediaCodec != null) {
                mediaCodec.start();
                this.mSampleRate = this.mUsedTrackFormat.getInteger("sample-rate");
                this.mFileLength = this.mUsedTrackFormat.getLong("durationUs");
                return true;
            }
            Logging.e("RtcAudioFileDecoder", "mMediaCodec is null");
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Error when creating audio file decode, error:");
            sbLIZ2.append(e.getMessage());
            Logging.e("RtcAudioFileDecoder", C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("stack track: ");
            sbLIZ3.append(Log.getStackTraceString(e));
            Logging.e("RtcAudioFileDecoder", C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        }
    }
}
