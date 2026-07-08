package com.ttnet.org.chromium.net;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.text.Normalizer;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class NetStringUtil {
    public static String toUpperCase(String str) {
        try {
            return str.toUpperCase(Locale.getDefault());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String convertToUnicode(ByteBuffer byteBuffer, String str) {
        try {
            return Charset.forName(str).newDecoder().decode(byteBuffer).toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String convertToUnicodeAndNormalize(ByteBuffer byteBuffer, String str) {
        String strConvertToUnicode = convertToUnicode(byteBuffer, str);
        if (strConvertToUnicode == null) {
            return null;
        }
        return Normalizer.normalize(strConvertToUnicode, Normalizer.Form.NFC);
    }

    public static String convertToUnicodeWithSubstitutions(ByteBuffer byteBuffer, String str) {
        try {
            CharsetDecoder charsetDecoderNewDecoder = Charset.forName(str).newDecoder();
            charsetDecoderNewDecoder.onMalformedInput(CodingErrorAction.REPLACE);
            charsetDecoderNewDecoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
            charsetDecoderNewDecoder.replaceWith("�");
            return charsetDecoderNewDecoder.decode(byteBuffer).toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
