/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class Keys {
    
    private static ByteBuffer toBuffer(int[] array) {
        ByteBuffer result = ByteBuffer.allocate(array.length);
        for (int i = 0; i < array.length; ++i)
            result.put((byte) (array[i] & 0xff));
        result.flip();
        return result;
    }
    
    static final ByteBuffer RSA_private512 = toBuffer(new int[]{
            0x30, 0x82, 0x01, 0x55, 0x02, 0x01, 0x00, 0x30, 0x0D, 0x06, 0x09, 0x2A, 0x86, 0x48, 0x86, 0xF7, 0x0D, 0x01, 0x01, 0x01, 0x05, 0x00, 0x04, 0x82, 0x01, 0x3F, 0x30, 0x82, 0x01, 0x3B, 0x02, 0x01, 0x00, 0x02, 0x41, 0x00, 0xC2, 0xA1, 0x38, 0x3E, 0xE1, 0x39, 0x3A, 0x3F, 0xE9, 0xD1, 0x35, 0xC4, 0xDB, 0x06, 0xEF, 0x08, 0xA9, 0xC7, 0xAE, 0xCE, 0x60, 0xD1, 0x72, 0x39, 0x33, 0x0D, 0x03, 0x3F, 0xFB, 0xA1, 0x20, 0xAB, 0x6D, 0x5B, 0xEF, 0x20, 0x45, 0x9D, 0x6F, 0xE2, 0xDE, 0x59, 0xD8, 0x6A, 0xCF, 0xB2, 0xDE, 0xE8, 0xE2, 0xA3, 0x5B, 0x27, 0x46, 0x6C, 0x26, 0xA5, 0xF7, 0xE0, 0xB8, 0xE2, 0x27, 0xAA, 0x5B, 0xF7, 0x02, 0x03, 0x01, 0x00, 0x01, 0x02, 0x41, 0x00, 0xC0, 0x61, 0xB3, 0xC3, 0x13, 0xC5, 0x09, 0x7A, 0xDB, 0x97, 0xDC, 0x5A, 0x35, 0x55, 0xE9, 0x38, 0xDA, 0xF9, 0x72, 0x24, 0xB5, 0x36, 0xD2, 0x7D, 0x0F, 0xA5, 0x31, 0x2D, 0x31, 0x80, 0xD7, 0x54, 0x62, 0x77, 0x40, 0xCF, 0xC7, 0x2E, 0x7B, 0x26, 0x60, 0x17, 0xED, 0xAB, 0xBC, 0x13, 0xDA, 0xFC, 0xF2, 0xB5, 0xD1, 0x56, 0x27, 0xB6, 0xC8, 0x9B, 0x38, 0x91, 0x2A, 0x28, 0x99, 0x09, 0xF5, 0x61, 0x02, 0x21, 0x00, 0xE2, 0x19, 0x73, 0x72, 0x81, 0x35, 0xDE, 0x79, 0x2C, 0x61, 0xF6, 0x7B, 0x9F, 0x02, 0xE7, 0x28, 0xC0, 0xED, 0xB6, 0xFD, 0x86, 0x9A, 0x5C, 0x86, 0x09, 0x63, 0xCC, 0xC9, 0x85, 0x70, 0x80, 0x7B, 0x02, 0x21, 0x00, 0xDC, 0x5E, 0x5E, 0xC1, 0x52, 0x27, 0xEB, 0x1D, 0xBE, 0x6E, 0x62, 0x1E, 0x11, 0x5F, 0xE8, 0x41, 0x92, 0x43, 0x42, 0x54, 0xDE, 0x1A, 0x47, 0xE1, 0x4C, 0x59, 0xB9, 0x6D, 0x3C, 0xDF, 0xFF, 0xB5, 0x02, 0x21, 0x00, 0x88, 0xDF, 0x93, 0x6E, 0x0C, 0x1E, 0x8A, 0x51, 0x9C, 0xB6, 0xA9, 0x3A, 0x69, 0x26, 0x9E, 0xBD, 0xA3, 0x1D, 0xC5, 0x1B, 0x71, 0x72, 0xDC, 0xF4, 0x1F, 0x97, 0x15, 0x10, 0x22, 0x01, 0xDB, 0x25, 0x02, 0x20, 0x20, 0x74, 0x75, 0x98, 0x1B, 0x35, 0x6D, 0xD7, 0x2F, 0x98, 0xAA, 0x32, 0xAB, 0x74, 0x68, 0x8C, 0x5F, 0xB2, 0x30, 0x2E, 0xB7, 0x97, 0x3F, 0x46, 0xDB, 0x2B, 0xCB, 0xB7, 0x5E, 0xE3, 0xCE, 0x91, 0x02, 0x20, 0x1B, 0x27, 0xE5, 0xEE, 0xF5, 0xD4, 0xE9, 0x8C, 0xF3, 0x8E, 0x55, 0xA1, 0x46, 0xE3, 0xE1, 0xBF, 0x8E, 0x4D, 0x63, 0x2D, 0xE2, 0x28, 0xBB, 0x36, 0x4E, 0x4A, 0x09, 0x3B, 0xA1, 0x06, 0x3B, 0xE5
    });

    static final ByteBuffer RSA_public512 = toBuffer(new int[]{
            0x30, 0x5C, 0x30, 0x0D, 0x06, 0x09, 0x2A, 0x86, 0x48, 0x86, 0xF7, 0x0D, 0x01, 0x01, 0x01, 0x05, 0x00, 0x03, 0x4B, 0x00, 0x30, 0x48, 0x02, 0x41, 0x00, 0xC2, 0xA1, 0x38, 0x3E, 0xE1, 0x39, 0x3A, 0x3F, 0xE9, 0xD1, 0x35, 0xC4, 0xDB, 0x06, 0xEF, 0x08, 0xA9, 0xC7, 0xAE, 0xCE, 0x60, 0xD1, 0x72, 0x39, 0x33, 0x0D, 0x03, 0x3F, 0xFB, 0xA1, 0x20, 0xAB, 0x6D, 0x5B, 0xEF, 0x20, 0x45, 0x9D, 0x6F, 0xE2, 0xDE, 0x59, 0xD8, 0x6A, 0xCF, 0xB2, 0xDE, 0xE8, 0xE2, 0xA3, 0x5B, 0x27, 0x46, 0x6C, 0x26, 0xA5, 0xF7, 0xE0, 0xB8, 0xE2, 0x27, 0xAA, 0x5B, 0xF7, 0x02, 0x03, 0x01, 0x00, 0x01
    });

    static final ByteBuffer RSA_private1024 = toBuffer(new int[]{
            0x30, 0x82, 0x02, 0x76, 0x02, 0x01, 0x00, 0x30, 0x0D, 0x06, 0x09, 0x2A, 0x86, 0x48, 0x86, 0xF7, 0x0D, 0x01, 0x01, 0x01, 0x05, 0x00, 0x04, 0x82, 0x02, 0x60, 0x30, 0x82, 0x02, 0x5C, 0x02, 0x01, 0x00, 0x02, 0x81, 0x81, 0x00, 0xC3, 0xD2, 0x28, 0x30, 0x87, 0xAF, 0x04, 0xA7, 0x4A, 0x59, 0x4B, 0xB5, 0x46, 0xD6, 0xD6, 0x78, 0x09, 0x11, 0xA7, 0x1E, 0xAB, 0x1F, 0xBF, 0xB4, 0xB2, 0x0E, 0x56, 0x56, 0x50, 0xA9, 0x54, 0x3C, 0xA0, 0xEC, 0x45, 0xE7, 0xB9, 0x45, 0xB1, 0x0B, 0x47, 0xF0, 0xFC, 0x24, 0x98, 0x11, 0xBB, 0xE5, 0x65, 0x66, 0x55, 0x61, 0xD1, 0x5E, 0x7C, 0xCC, 0x04, 0x3F, 0xFA, 0xAD, 0xF4, 0xD8, 0x1D, 0xFB, 0x93, 0x0A, 0x8A, 0xA4, 0x34, 0xE6, 0xA5, 0x40, 0x22, 0xA8, 0x28, 0x59, 0x7C, 0x4D, 0x33, 0xB1, 0x93, 0x16, 0x8B, 0x69, 0xB9, 0xFA, 0x34, 0xED, 0x46, 0xE4, 0xB0, 0x6E, 0x4A, 0x5E, 0x9F, 0x1B, 0xD4, 0x0F, 0xEF, 0x7E, 0x63, 0xC3, 0xDE, 0xCE, 0xC2, 0x89, 0x3B, 0xC5, 0xDF, 0x85, 0x85, 0xB4, 0xC4, 0x46, 0xDF, 0x39, 0x68, 0x06, 0x53, 0x90, 0x25, 0x92, 0xFE, 0x10, 0x50, 0x18, 0xFE, 0x21, 0x02, 0x03, 0x01, 0x00, 0x01, 0x02, 0x81, 0x80, 0x03, 0xA1, 0x5E, 0xCB, 0x5F, 0x88, 0x98, 0x1E, 0x7D, 0xDB, 0x5F, 0xF2, 0xF1, 0x68, 0x44, 0x3B, 0x9F, 0x77, 0x6B, 0x50, 0xBF, 0x3D, 0x6C, 0x71, 0x6E, 0x27, 0xA3, 0xE4, 0x1F, 0xC4, 0xB3, 0xE2, 0x17, 0xDD, 0xA9, 0x82, 0x1D, 0x46, 0x34, 0x7D, 0x10, 0x0D, 0x60, 0xAF, 0x50, 0xFE, 0x6B, 0x2C, 0x5A, 0x8F, 0xE6, 0x1F, 0x55, 0x21, 0x5A, 0x50, 0xF1, 0xF7, 0x39, 0xAF, 0x85, 0xED, 0x87, 0xC8, 0xBC, 0xDF, 0x13, 0x84, 0xDF, 0x72, 0xA8, 0xC3, 0x91, 0x26, 0x38, 0xED, 0xC8, 0x14, 0x18, 0xA3, 0x5C, 0xD2, 0x14, 0x0C, 0x4A, 0x38, 0x98, 0x2F, 0x2B, 0xA9, 0xC9, 0x65, 0xD9, 0x1F, 0x5B, 0xD4, 0x2A, 0x9D, 0x4F, 0xEE, 0x2F, 0xE8, 0x4E, 0xCA, 0x30, 0x82, 0xD4, 0x19, 0xA0, 0x8A, 0x51, 0x95, 0xC3, 0xAF, 0x5A, 0xB6, 0x83, 0x55, 0x7E, 0x02, 0xEF, 0x42, 0x1F, 0x47, 0x7F, 0x82, 0x96, 0xD1, 0x02, 0x41, 0x00, 0xF6, 0x6E, 0x44, 0x12, 0xFB, 0x44, 0x49, 0x53, 0x04, 0x2F, 0x48, 0xCB, 0xA8, 0xC9, 0x99, 0x86, 0xB2, 0x15, 0xC8, 0xB4, 0xE6, 0x67, 0xF3, 0x0F, 0x29, 0x68, 0xF2, 0xB0, 0xFE, 0x13, 0x43, 0x8D, 0x55, 0xFD, 0xC1, 0x0F, 0x81, 0x1D, 0x4B, 0xA5, 0x95, 0xE5, 0xA4, 0x6C, 0x94, 0x82, 0x6C, 0xAA, 0xD4, 0x4B, 0xB8, 0x12, 0x67, 0xE3, 0x7A, 0xE2, 0x0C, 0xC6, 0xC2, 0xA0, 0x44, 0x3D, 0x75, 0x5D, 0x02, 0x41, 0x00, 0xCB, 0x6C, 0xC9, 0x36, 0x35, 0xBA, 0xC1, 0x6F, 0x8F, 0x73, 0x96, 0xDC, 0xA0, 0x56, 0xFE, 0x5D, 0x23, 0xB3, 0xAC, 0x15, 0x7B, 0x1A, 0x12, 0xB8, 0x6E, 0x9C, 0x98, 0xF1, 0xA7, 0x0F, 0xF3, 0x5C, 0x40, 0xA8, 0x15, 0xAD, 0x13, 0x6D, 0xBF, 0xEF, 0x61, 0x19, 0x74, 0x46, 0xD3, 0xC4, 0x7E, 0x5E, 0x29, 0x0E, 0x3E, 0x25, 0x84, 0x08, 0x6F, 0xA9, 0x67, 0x96, 0x63, 0xF8, 0xD5, 0xB0, 0x7B, 0x95, 0x02, 0x41, 0x00, 0xE2, 0x6C, 0x3E, 0x30, 0x12, 0x9E, 0x93, 0xA0, 0xAB, 0x5F, 0xA6, 0xCB, 0x39, 0xB2, 0xC2, 0x55, 0x78, 0x9B, 0x7B, 0x66, 0x7B, 0xAD, 0x57, 0x2E, 0xBF, 0x25, 0xA6, 0x97, 0xE9, 0x5B, 0x59, 0xDE, 0x2A, 0xFC, 0x94, 0xBE, 0xE2, 0x2B, 0x40, 0xAE, 0x4C, 0x24, 0x4C, 0x07, 0x58, 0x0C, 0xDE, 0x3B, 0xB8, 0x04, 0x3A, 0x84, 0xEE, 0xDF, 0x9C, 0xB0, 0xC6, 0x7C, 0x79, 0xA7, 0x38, 0x0C, 0x20, 0x21, 0x02, 0x40, 0x3C, 0xF0, 0xB5, 0x02, 0x81, 0x6C, 0x16, 0x20, 0xC6, 0x97, 0xB9, 0x1D, 0x15, 0x07, 0x9A, 0xA1, 0xEA, 0x5D, 0x1B, 0xF3, 0x3F, 0x72, 0x9B, 0x23, 0x17, 0x37, 0xE0, 0x75, 0x9C, 0x37, 0xA2, 0x0F, 0x03, 0xEB, 0x96, 0xBA, 0xC7, 0xB4, 0x3C, 0x28, 0x89, 0x2D, 0x27, 0xF1, 0x43, 0xE5, 0x7C, 0x79, 0xD6, 0xD0, 0xC6, 0x7B, 0x54, 0xA7, 0x76, 0x54, 0x08, 0x8D, 0x3C, 0x1B, 0xC2, 0x60, 0x61, 0x55, 0x02, 0x40, 0x07, 0xB6, 0xBA, 0x51, 0xE7, 0x02, 0x66, 0x4A, 0x08, 0xA3, 0x9C, 0x8E, 0x1B, 0x6C, 0x15, 0x35, 0x60, 0xD4, 0x44, 0xB4, 0x81, 0xFC, 0x1C, 0x22, 0x95, 0x65, 0x04, 0x73, 0x73, 0x03, 0xF0, 0xE5, 0x8E, 0x5E, 0xAD, 0xC6, 0x44, 0xC9, 0x0F, 0xAD, 0x59, 0x7E, 0xBC, 0x12, 0xF3, 0x37, 0x63, 0xC5, 0xFB, 0xD5, 0x71, 0x05, 0x62, 0xF7, 0x54, 0x7A, 0xA0, 0x27, 0xB7, 0xAA, 0x9B, 0x22, 0x79, 0xB2
    });

    static final ByteBuffer RSA_public1024 = toBuffer(new int[]{
            0x30, 0x81, 0x9F, 0x30, 0x0D, 0x06, 0x09, 0x2A, 0x86, 0x48, 0x86, 0xF7, 0x0D, 0x01, 0x01, 0x01, 0x05, 0x00, 0x03, 0x81, 0x8D, 0x00, 0x30, 0x81, 0x89, 0x02, 0x81, 0x81, 0x00, 0xC3, 0xD2, 0x28, 0x30, 0x87, 0xAF, 0x04, 0xA7, 0x4A, 0x59, 0x4B, 0xB5, 0x46, 0xD6, 0xD6, 0x78, 0x09, 0x11, 0xA7, 0x1E, 0xAB, 0x1F, 0xBF, 0xB4, 0xB2, 0x0E, 0x56, 0x56, 0x50, 0xA9, 0x54, 0x3C, 0xA0, 0xEC, 0x45, 0xE7, 0xB9, 0x45, 0xB1, 0x0B, 0x47, 0xF0, 0xFC, 0x24, 0x98, 0x11, 0xBB, 0xE5, 0x65, 0x66, 0x55, 0x61, 0xD1, 0x5E, 0x7C, 0xCC, 0x04, 0x3F, 0xFA, 0xAD, 0xF4, 0xD8, 0x1D, 0xFB, 0x93, 0x0A, 0x8A, 0xA4, 0x34, 0xE6, 0xA5, 0x40, 0x22, 0xA8, 0x28, 0x59, 0x7C, 0x4D, 0x33, 0xB1, 0x93, 0x16, 0x8B, 0x69, 0xB9, 0xFA, 0x34, 0xED, 0x46, 0xE4, 0xB0, 0x6E, 0x4A, 0x5E, 0x9F, 0x1B, 0xD4, 0x0F, 0xEF, 0x7E, 0x63, 0xC3, 0xDE, 0xCE, 0xC2, 0x89, 0x3B, 0xC5, 0xDF, 0x85, 0x85, 0xB4, 0xC4, 0x46, 0xDF, 0x39, 0x68, 0x06, 0x53, 0x90, 0x25, 0x92, 0xFE, 0x10, 0x50, 0x18, 0xFE, 0x21, 0x02, 0x03, 0x01, 0x00, 0x01
    });

    static final ByteBuffer RSA_private2048 = toBuffer(new int[]{
            0x30, 0x82, 0x04, 0xBD, 0x02, 0x01, 0x00, 0x30, 0x0D, 0x06, 0x09, 0x2A, 0x86, 0x48, 0x86, 0xF7, 0x0D, 0x01, 0x01, 0x01, 0x05, 0x00, 0x04, 0x82, 0x04, 0xA7, 0x30, 0x82, 0x04, 0xA3, 0x02, 0x01, 0x00, 0x02, 0x82, 0x01, 0x01, 0x00, 0xA3, 0xEF, 0xD9, 0x95, 0x59, 0xA9, 0x28, 0x33, 0x86, 0xDC, 0xA1, 0xAE, 0xB9, 0x37, 0xB3, 0x4A, 0xA9, 0x59, 0x3E, 0x15, 0x3E, 0xF8, 0xEA, 0x91, 0x28, 0x78, 0x9A, 0x8C, 0x3D, 0x26, 0x45, 0x45, 0x58, 0x75, 0x52, 0x68, 0x5F, 0x5E, 0xEB, 0xC9, 0xDE, 0x18, 0xD6, 0x42, 0x22, 0xCA, 0xE5, 0x78, 0x2C, 0x92, 0xD4, 0x29, 0x26, 0xD2, 0x14, 0xBF, 0x43, 0x0A, 0x2F, 0x54, 0x61, 0xAC, 0xEF, 0x9C, 0x23, 0xD3, 0x9E, 0xA4, 0x3C, 0xB7, 0xD7, 0x31, 0xC1, 0xDC, 0xD5, 0x3A, 0x25, 0x3C, 0x7B, 0x40, 0xA9, 0xFE, 0xA9, 0xB8, 0x6D, 0x9A, 0xEF, 0xFB, 0x4F, 0x7D, 0x5D, 0xB6, 0x58, 0x8B, 0xB7, 0x87, 0xAC, 0xCB, 0x24, 0xC4, 0x76, 0x66, 0x24, 0x99, 0xBC, 0x7A, 0x84, 0x6D, 0x61, 0xA8, 0xC8, 0xF7, 0xE9, 0x36, 0x4A, 0xDA, 0xA6, 0x75, 0x78, 0x32, 0xAD, 0x3C, 0x50, 0x64, 0x9E, 0x21, 0xFE, 0x3B, 0x94, 0x9D, 0x2D, 0x83, 0xF5, 0x24, 0xAA, 0x16, 0xDE, 0xD0, 0xAD, 0x3F, 0x05, 0xE8, 0x85, 0xEF, 0x7F, 0xFF, 0xDF, 0x41, 0xB6, 0xA3, 0x0F, 0xD3, 0x7E, 0x7C, 0xBF, 0xB1, 0xE6, 0x8A, 0xF7, 0x46, 0x35, 0x78, 0x45, 0xE8, 0x6B, 0x3B, 0x34, 0x25, 0x55, 0x20, 0xAB, 0x38, 0xE0, 0xE7, 0x6A, 0xAA, 0xD1, 0xC5, 0xD0, 0x2B, 0x0F, 0xB4, 0x62, 0xAA, 0xE6, 0x51, 0x1A, 0xF9, 0x9E, 0x21, 0xEE, 0x25, 0x60, 0x05, 0xB8, 0x6C, 0x85, 0x07, 0x6E, 0x9B, 0x7A, 0xAB, 0x24, 0x91, 0x44, 0x98, 0xB1, 0xA9, 0x24, 0x04, 0x0E, 0xFD, 0xC1, 0x8E, 0x63, 0x56, 0x1E, 0x25, 0x1A, 0xB6, 0x22, 0x29, 0xEC, 0x4C, 0x63, 0x34, 0x26, 0x5E, 0x7A, 0x82, 0xB3, 0xEE, 0x3F, 0x43, 0xB5, 0xD6, 0x48, 0xBB, 0x8A, 0x53, 0x07, 0xD4, 0x32, 0xA3, 0xEE, 0x58, 0x8D, 0xE4, 0x0D, 0x51, 0xF1, 0x0F, 0xE4, 0xF6, 0xA7, 0x4B, 0x02, 0x03, 0x01, 0x00, 0x01, 0x02, 0x82, 0x01, 0x00, 0x7B, 0xAD, 0x1D, 0x37, 0x61, 0x37, 0x0E, 0x8F, 0x20, 0xF5, 0x1E, 0x3D, 0x14, 0x9A, 0x82, 0xF6, 0x96, 0xA0, 0x2F, 0x08, 0x14, 0x43, 0xF1, 0xA2, 0xA5, 0x27, 0xA7, 0x60, 0x99, 0x59, 0x5F, 0xF5, 0x1A, 0xF1, 0x17, 0xC4, 0x89, 0xFE, 0xB0, 0x5F, 0xD0, 0xE0, 0x67, 0xF3, 0xE9, 0x0F, 0xAC, 0xE2, 0x66, 0xAE, 0x36, 0xC4, 0xFC, 0xF6, 0x8C, 0x94, 0x66, 0x5D, 0x2E, 0xAB, 0xB8, 0x2C, 0xA1, 0x6F, 0xE8, 0x4F, 0x64, 0x65, 0x7F, 0x31, 0x2A, 0x75, 0xED, 0x4D, 0x4E, 0xC7, 0xD9, 0x03, 0xB1, 0xF0, 0x6C, 0xCF, 0x24, 0xF7, 0x70, 0x28, 0xED, 0x57, 0x68, 0xF6, 0xA9, 0x56, 0x41, 0xA2, 0xD6, 0x48, 0xD3, 0x01, 0x46, 0xB1, 0xB8, 0xA9, 0x02, 0x7F, 0xC1, 0x03, 0xA5, 0x18, 0x68, 0x0E, 0xCF, 0xDE, 0xC7, 0xE0, 0x1F, 0xC4, 0xA8, 0xC4, 0x02, 0x74, 0x28, 0xE1, 0x51, 0xBD, 0x36, 0xD7, 0x6A, 0x56, 0x0F, 0x7F, 0x1D, 0x22, 0xA4, 0xC0, 0x57, 0x53, 0x5D, 0x1C, 0x9A, 0x9C, 0x64, 0xEC, 0x4E, 0xD3, 0x43, 0x14, 0x3B, 0x1A, 0x38, 0x9B, 0x0B, 0x86, 0x3D, 0x68, 0x5B, 0x98, 0x76, 0x72, 0x6E, 0x00, 0x3E, 0x8E, 0x05, 0x71, 0xD4, 0xCD, 0x03, 0x9A, 0xBA, 0xC9, 0xE5, 0x93, 0xD6, 0x57, 0x0D, 0xB1, 0x45, 0xDD, 0x1F, 0x09, 0x7E, 0x6C, 0x41, 0xF6, 0xB6, 0x8A, 0xEB, 0xD3, 0x27, 0xFC, 0xBF, 0x36, 0xEF, 0x30, 0x7E, 0x1C, 0x36, 0x54, 0x73, 0x79, 0x25, 0x7F, 0x76, 0x6C, 0x6B, 0xC1, 0x24, 0x15, 0x54, 0xDE, 0x1B, 0x33, 0x04, 0x3D, 0x58, 0x75, 0x04, 0x01, 0xF1, 0x05, 0x38, 0x10, 0x7E, 0xA2, 0xB3, 0xD6, 0xD0, 0x2E, 0x87, 0x81, 0xD1, 0x75, 0xA2, 0x0B, 0x5F, 0x77, 0xA3, 0xA1, 0x58, 0x38, 0xB3, 0x6B, 0xA8, 0x23, 0xAC, 0x0A, 0x7C, 0x26, 0xB5, 0xB8, 0xF6, 0xB3, 0xC1, 0xA5, 0xCE, 0x31, 0x02, 0x81, 0x81, 0x00, 0xCF, 0x0C, 0x90, 0x72, 0xE5, 0x41, 0xC7, 0xA9, 0x67, 0x4D, 0xF0, 0x7F, 0x74, 0xE0, 0xD4, 0xC3, 0x39, 0xCB, 0xFD, 0x1B, 0xD5, 0xA0, 0x19, 0x7D, 0xDE, 0x5C, 0x9F, 0xA3, 0x2E, 0x0C, 0x54, 0xC1, 0xED, 0x8B, 0x6C, 0xAD, 0x40, 0xF9, 0x30, 0xBC, 0x08, 0x4B, 0x43, 0xCA, 0xEE, 0x94, 0xBB, 0x56, 0x9F, 0x63, 0x64, 0x11, 0x76, 0x87, 0x69, 0xC7, 0xD0, 0x3F, 0x70, 0x93, 0x77, 0x4A, 0xA7, 0x52, 0x7C, 0xB2, 0xEE, 0xCF, 0x25, 0x6D, 0x20, 0x43, 0xF3, 0x4A, 0x0D, 0x8C, 0x3F, 0xEC, 0x8E, 0xD6, 0x06, 0x0D, 0xB3, 0x71, 0xC7, 0x5E, 0x25, 0x68, 0xF6, 0x71, 0x8F, 0x3C, 0x48, 0x76, 0xCF, 0xCF, 0x72, 0x77, 0x09, 0xE8, 0x4D, 0x29, 0xC9, 0xF1, 0x05, 0xBF, 0x4C, 0xB5, 0x3A, 0xEC, 0x24, 0x74, 0xAC, 0xBF, 0x84, 0xAC, 0xD1, 0x3F, 0x21, 0x20, 0xC1, 0xAC, 0x51, 0x6C, 0xED, 0x80, 0x9B, 0x7F, 0x02, 0x81, 0x81, 0x00, 0xCA, 0xB1, 0xF7, 0x2E, 0x9B, 0x69, 0x7F, 0x01, 0x5C, 0xE0, 0x57, 0xBC, 0x24, 0x28, 0x87, 0xE8, 0x82, 0x04, 0xE0, 0xE7, 0x28, 0x23, 0x2D, 0x80, 0x95, 0xFE, 0xA1, 0x4F, 0xBB, 0x93, 0x75, 0x22, 0x98, 0x10, 0xC8, 0x4A, 0x48, 0x6D, 0xFB, 0x20, 0xD1, 0xC9, 0x16, 0xDF, 0xF8, 0xDF, 0x9A, 0x70, 0xA5, 0x56, 0xEE, 0xEB, 0x2F, 0xFE, 0xD6, 0x0E, 0x66, 0xA3, 0x20, 0xDD, 0xC7, 0xBC, 0x63, 0x2B, 0x2A, 0xC7, 0x9F, 0x69, 0x82, 0xAF, 0x19, 0xDC, 0xAA, 0x53, 0x7E, 0x53, 0xCD, 0x70, 0x25, 0xA6, 0x38, 0x81, 0xAE, 0x5A, 0xBD, 0x4E, 0x62, 0x23, 0x4F, 0xF2, 0xCF, 0xE0, 0xFC, 0x79, 0xA2, 0x5E, 0x76, 0x24, 0x43, 0x4C, 0x64, 0xDF, 0x40, 0x76, 0x03, 0xBC, 0x4D, 0x5C, 0x50, 0x2C, 0x84, 0x15, 0xFC, 0xDD, 0x2D, 0x0D, 0x63, 0x37, 0x4F, 0x5E, 0x19, 0xFE, 0x63, 0xA9, 0xEC, 0x7C, 0x8A, 0x35, 0x02, 0x81, 0x81, 0x00, 0x9A, 0x40, 0x59, 0x09, 0x50, 0x25, 0x2E, 0x93, 0xD5, 0x83, 0xAA, 0x4D, 0xBA, 0x8C, 0x99, 0xD6, 0x0C, 0x24, 0x1E, 0x20, 0x73, 0x89, 0xC0, 0x14, 0x16, 0xEA, 0x58, 0x80, 0x20, 0x99, 0x4D, 0x37, 0xE1, 0x3A, 0x43, 0x2F, 0xDC, 0x3D, 0x0A, 0x02, 0xBC, 0x07, 0x1E, 0xAD, 0x7C, 0x0B, 0x50, 0x7A, 0x5B, 0x6A, 0x97, 0xAD, 0xAE, 0xE9, 0x79, 0x74, 0x44, 0x80, 0x4E, 0xE5, 0x7E, 0x35, 0x1E, 0xED, 0x04, 0x3B, 0xE6, 0x50, 0x6B, 0x28, 0x9E, 0xA6, 0x21, 0x05, 0xA5, 0x8C, 0x3C, 0x3F, 0x87, 0xB6, 0x89, 0x72, 0x01, 0xA3, 0x1D, 0x8D, 0xD5, 0x3F, 0x1A, 0x83, 0x45, 0xDB, 0xFA, 0x7C, 0x91, 0x9B, 0x92, 0x42, 0x7F, 0x1E, 0x13, 0x06, 0xB4, 0x0D, 0x1D, 0x64, 0x04, 0xC8, 0xEB, 0xE9, 0xEB, 0xCB, 0x04, 0xBB, 0xF6, 0x23, 0x2E, 0x0C, 0xE3, 0x28, 0x5D, 0x41, 0x7C, 0xB4, 0x33, 0x48, 0xE2, 0x0F, 0x02, 0x81, 0x80, 0x0D, 0xC3, 0x5B, 0xC7, 0x5C, 0x62, 0x23, 0x6F, 0x92, 0x40, 0xE1, 0x74, 0x32, 0xF8, 0x55, 0x92, 0x22, 0x11, 0xF6, 0xBB, 0x7B, 0x6C, 0x38, 0x10, 0xBD, 0x1E, 0x97, 0x11, 0x74, 0xE9, 0x24, 0x50, 0xFF, 0x06, 0x54, 0xB3, 0x46, 0x8B, 0xC1, 0x3B, 0x8F, 0x43, 0x1A, 0x3C, 0x87, 0x07, 0x97, 0xD3, 0x02, 0x47, 0x0E, 0xDE, 0x05, 0x5A, 0x46, 0x6A, 0x9F, 0xE9, 0x7F, 0xB7, 0xCF, 0x72, 0x29, 0x41, 0xAB, 0x1B, 0xF6, 0xE5, 0x11, 0x2C, 0x96, 0x92, 0xF7, 0x35, 0xC8, 0x24, 0x24, 0x94, 0xF2, 0xD9, 0x80, 0x88, 0xBD, 0xB0, 0x07, 0x9E, 0xA4, 0xE7, 0x44, 0xEC, 0x75, 0xD5, 0x0F, 0x0F, 0xAB, 0x48, 0xC2, 0xB8, 0xDF, 0xA0, 0xF6, 0x50, 0x7A, 0x6E, 0x08, 0xFE, 0xE6, 0x39, 0xD8, 0x6F, 0xCD, 0x60, 0x38, 0xD5, 0x43, 0xD3, 0xDE, 0xE2, 0xC8, 0x8E, 0xD9, 0x30, 0xFE, 0xCF, 0x70, 0xF1, 0x5B, 0xE9, 0x02, 0x81, 0x80, 0x1B, 0x5B, 0x26, 0x7A, 0x76, 0x4A, 0xB2, 0x54, 0x19, 0x68, 0xC6, 0x7B, 0x2F, 0x38, 0xE3, 0xDE, 0xFC, 0x55, 0xDC, 0x8A, 0xB8, 0xDB, 0xCD, 0xE5, 0x00, 0x8A, 0x85, 0x13, 0xEF, 0x93, 0xDA, 0xC4, 0xE2, 0x83, 0x2B, 0x54, 0xCD, 0x59, 0x24, 0xF9, 0x31, 0xB8, 0x2B, 0x60, 0x5E, 0x70, 0x9D, 0x3F, 0x47, 0xCE, 0x5D, 0x1A, 0x25, 0x74, 0x86, 0xB7, 0xD4, 0x38, 0x19, 0x7C, 0x43, 0x1E, 0x91, 0x29, 0x63, 0xF1, 0xCD, 0x8C, 0xA8, 0x1A, 0x7A, 0xBF, 0x71, 0x6C, 0xD9, 0xFE, 0xC9, 0x45, 0x7F, 0xF8, 0xCA, 0xE9, 0x5F, 0x8D, 0x0A, 0x6D, 0xF0, 0xD6, 0x1B, 0x13, 0xC1, 0x0A, 0x70, 0xC1, 0x84, 0x37, 0x6B, 0xB9, 0x3B, 0x5A, 0x55, 0x46, 0x93, 0xF1, 0x85, 0x95, 0xF7, 0x04, 0x77, 0x7A, 0x85, 0xA1, 0x4F, 0xB0, 0x8C, 0xA0, 0x11, 0x4D, 0x71, 0xDE, 0xC2, 0x4B, 0xAD, 0x9C, 0xA2, 0xD9, 0xBB, 0x9B
    });

    static final ByteBuffer RSA_public2048 = toBuffer(new int[]{
            0x30, 0x82, 0x01, 0x22, 0x30, 0x0D, 0x06, 0x09, 0x2A, 0x86, 0x48, 0x86, 0xF7, 0x0D, 0x01, 0x01, 0x01, 0x05, 0x00, 0x03, 0x82, 0x01, 0x0F, 0x00, 0x30, 0x82, 0x01, 0x0A, 0x02, 0x82, 0x01, 0x01, 0x00, 0xA3, 0xEF, 0xD9, 0x95, 0x59, 0xA9, 0x28, 0x33, 0x86, 0xDC, 0xA1, 0xAE, 0xB9, 0x37, 0xB3, 0x4A, 0xA9, 0x59, 0x3E, 0x15, 0x3E, 0xF8, 0xEA, 0x91, 0x28, 0x78, 0x9A, 0x8C, 0x3D, 0x26, 0x45, 0x45, 0x58, 0x75, 0x52, 0x68, 0x5F, 0x5E, 0xEB, 0xC9, 0xDE, 0x18, 0xD6, 0x42, 0x22, 0xCA, 0xE5, 0x78, 0x2C, 0x92, 0xD4, 0x29, 0x26, 0xD2, 0x14, 0xBF, 0x43, 0x0A, 0x2F, 0x54, 0x61, 0xAC, 0xEF, 0x9C, 0x23, 0xD3, 0x9E, 0xA4, 0x3C, 0xB7, 0xD7, 0x31, 0xC1, 0xDC, 0xD5, 0x3A, 0x25, 0x3C, 0x7B, 0x40, 0xA9, 0xFE, 0xA9, 0xB8, 0x6D, 0x9A, 0xEF, 0xFB, 0x4F, 0x7D, 0x5D, 0xB6, 0x58, 0x8B, 0xB7, 0x87, 0xAC, 0xCB, 0x24, 0xC4, 0x76, 0x66, 0x24, 0x99, 0xBC, 0x7A, 0x84, 0x6D, 0x61, 0xA8, 0xC8, 0xF7, 0xE9, 0x36, 0x4A, 0xDA, 0xA6, 0x75, 0x78, 0x32, 0xAD, 0x3C, 0x50, 0x64, 0x9E, 0x21, 0xFE, 0x3B, 0x94, 0x9D, 0x2D, 0x83, 0xF5, 0x24, 0xAA, 0x16, 0xDE, 0xD0, 0xAD, 0x3F, 0x05, 0xE8, 0x85, 0xEF, 0x7F, 0xFF, 0xDF, 0x41, 0xB6, 0xA3, 0x0F, 0xD3, 0x7E, 0x7C, 0xBF, 0xB1, 0xE6, 0x8A, 0xF7, 0x46, 0x35, 0x78, 0x45, 0xE8, 0x6B, 0x3B, 0x34, 0x25, 0x55, 0x20, 0xAB, 0x38, 0xE0, 0xE7, 0x6A, 0xAA, 0xD1, 0xC5, 0xD0, 0x2B, 0x0F, 0xB4, 0x62, 0xAA, 0xE6, 0x51, 0x1A, 0xF9, 0x9E, 0x21, 0xEE, 0x25, 0x60, 0x05, 0xB8, 0x6C, 0x85, 0x07, 0x6E, 0x9B, 0x7A, 0xAB, 0x24, 0x91, 0x44, 0x98, 0xB1, 0xA9, 0x24, 0x04, 0x0E, 0xFD, 0xC1, 0x8E, 0x63, 0x56, 0x1E, 0x25, 0x1A, 0xB6, 0x22, 0x29, 0xEC, 0x4C, 0x63, 0x34, 0x26, 0x5E, 0x7A, 0x82, 0xB3, 0xEE, 0x3F, 0x43, 0xB5, 0xD6, 0x48, 0xBB, 0x8A, 0x53, 0x07, 0xD4, 0x32, 0xA3, 0xEE, 0x58, 0x8D, 0xE4, 0x0D, 0x51, 0xF1, 0x0F, 0xE4, 0xF6, 0xA7, 0x4B, 0x02, 0x03, 0x01, 0x00, 0x01
    });

    static final ByteBuffer DEFAULT_RSA_PUBLIC_KEY_DER = toBuffer(new int[] {
    0x30, 0x82, 0x01, 0x22, 0x30, 0x0d, 0x06, 0x09, 0x2a, 0x86, 0x48, 0x86, 0xf7, 0x0d, 0x01, 0x01,
    0x01, 0x05, 0x00, 0x03, 0x82, 0x01, 0x0f, 0x00, 0x30, 0x82, 0x01, 0x0a, 0x02, 0x82, 0x01, 0x01,
    0x00, 0xb8, 0x09, 0xa7, 0x59, 0x82, 0x84, 0xec, 0x4f, 0x06, 0xfa, 0x1c, 0xb2, 0xe1, 0x38, 0x93,
    0x53, 0xbb, 0x7d, 0xd4, 0xac, 0x88, 0x1a, 0xf8, 0x25, 0x11, 0xe4, 0xfa, 0x1d, 0x61, 0x24, 0x5b,
    0x82, 0xca, 0xcd, 0x72, 0xce, 0xdb, 0x66, 0xb5, 0x8d, 0x54, 0xbd, 0xfb, 0x23, 0xfd, 0xe8, 0x8e,
    0xaf, 0xa7, 0xb3, 0x79, 0xbe, 0x94, 0xb5, 0xb7, 0xba, 0x17, 0xb6, 0x05, 0xae, 0xce, 0x43, 0xbe,
    0x3b, 0xce, 0x6e, 0xea, 0x07, 0xdb, 0xbf, 0x0a, 0x7e, 0xeb, 0xbc, 0xc9, 0x7b, 0x62, 0x3c, 0xf5,
    0xe1, 0xce, 0xe1, 0xd9, 0x8d, 0x9c, 0xfe, 0x1f, 0xc7, 0xf8, 0xfb, 0x59, 0xc0, 0x94, 0x0b, 0x2c,
    0xd9, 0x7d, 0xbc, 0x96, 0xeb, 0xb8, 0x79, 0x22, 0x8a, 0x2e, 0xa0, 0x12, 0x1d, 0x42, 0x07, 0xb6,
    0x5d, 0xdb, 0xe1, 0xf6, 0xb1, 0x5d, 0x7b, 0x1f, 0x54, 0x52, 0x1c, 0xa3, 0x11, 0x9b, 0xf9, 0xeb,
    0xbe, 0xb3, 0x95, 0xca, 0xa5, 0x87, 0x3f, 0x31, 0x18, 0x1a, 0xc9, 0x99, 0x01, 0xec, 0xaa, 0x90,
    0xfd, 0x8a, 0x36, 0x35, 0x5e, 0x12, 0x81, 0xbe, 0x84, 0x88, 0xa1, 0x0d, 0x19, 0x2a, 0x4a, 0x66,
    0xc1, 0x59, 0x3c, 0x41, 0x83, 0x3d, 0x3d, 0xb8, 0xd4, 0xab, 0x34, 0x90, 0x06, 0x3e, 0x1a, 0x61,
    0x74, 0xbe, 0x04, 0xf5, 0x7a, 0x69, 0x1b, 0x9d, 0x56, 0xfc, 0x83, 0xb7, 0x60, 0xc1, 0x5e, 0x9d,
    0x85, 0x34, 0xfd, 0x02, 0x1a, 0xba, 0x2c, 0x09, 0x72, 0xa7, 0x4a, 0x5e, 0x18, 0xbf, 0xc0, 0x58,
    0xa7, 0x49, 0x34, 0x46, 0x61, 0x59, 0x0e, 0xe2, 0x6e, 0x9e, 0xd2, 0xdb, 0xfd, 0x72, 0x2f, 0x3c,
    0x47, 0xcc, 0x5f, 0x99, 0x62, 0xee, 0x0d, 0xf3, 0x1f, 0x30, 0x25, 0x20, 0x92, 0x15, 0x4b, 0x04,
    0xfe, 0x15, 0x19, 0x1d, 0xdc, 0x7e, 0x5c, 0x10, 0x21, 0x52, 0x21, 0x91, 0x54, 0x60, 0x8b, 0x92,
    0x41, 0x02, 0x03, 0x01, 0x00, 0x01
    });
    
    
    static final ByteBuffer DEFAULT_RSA_PRIVATE_KEY_DER = toBuffer(new int[] {
    0x30, 0x82, 0x04, 0xbf, 0x02, 0x01, 0x00, 0x30, 0x0d, 0x06, 0x09, 0x2a, 0x86, 0x48, 0x86, 0xf7,
    0x0d, 0x01, 0x01, 0x01, 0x05, 0x00, 0x04, 0x82, 0x04, 0xa9, 0x30, 0x82, 0x04, 0xa5, 0x02, 0x01,
    0x00, 0x02, 0x82, 0x01, 0x01, 0x00, 0xb8, 0x09, 0xa7, 0x59, 0x82, 0x84, 0xec, 0x4f, 0x06, 0xfa,
    0x1c, 0xb2, 0xe1, 0x38, 0x93, 0x53, 0xbb, 0x7d, 0xd4, 0xac, 0x88, 0x1a, 0xf8, 0x25, 0x11, 0xe4,
    0xfa, 0x1d, 0x61, 0x24, 0x5b, 0x82, 0xca, 0xcd, 0x72, 0xce, 0xdb, 0x66, 0xb5, 0x8d, 0x54, 0xbd,
    0xfb, 0x23, 0xfd, 0xe8, 0x8e, 0xaf, 0xa7, 0xb3, 0x79, 0xbe, 0x94, 0xb5, 0xb7, 0xba, 0x17, 0xb6,
    0x05, 0xae, 0xce, 0x43, 0xbe, 0x3b, 0xce, 0x6e, 0xea, 0x07, 0xdb, 0xbf, 0x0a, 0x7e, 0xeb, 0xbc,
    0xc9, 0x7b, 0x62, 0x3c, 0xf5, 0xe1, 0xce, 0xe1, 0xd9, 0x8d, 0x9c, 0xfe, 0x1f, 0xc7, 0xf8, 0xfb,
    0x59, 0xc0, 0x94, 0x0b, 0x2c, 0xd9, 0x7d, 0xbc, 0x96, 0xeb, 0xb8, 0x79, 0x22, 0x8a, 0x2e, 0xa0,
    0x12, 0x1d, 0x42, 0x07, 0xb6, 0x5d, 0xdb, 0xe1, 0xf6, 0xb1, 0x5d, 0x7b, 0x1f, 0x54, 0x52, 0x1c,
    0xa3, 0x11, 0x9b, 0xf9, 0xeb, 0xbe, 0xb3, 0x95, 0xca, 0xa5, 0x87, 0x3f, 0x31, 0x18, 0x1a, 0xc9,
    0x99, 0x01, 0xec, 0xaa, 0x90, 0xfd, 0x8a, 0x36, 0x35, 0x5e, 0x12, 0x81, 0xbe, 0x84, 0x88, 0xa1,
    0x0d, 0x19, 0x2a, 0x4a, 0x66, 0xc1, 0x59, 0x3c, 0x41, 0x83, 0x3d, 0x3d, 0xb8, 0xd4, 0xab, 0x34,
    0x90, 0x06, 0x3e, 0x1a, 0x61, 0x74, 0xbe, 0x04, 0xf5, 0x7a, 0x69, 0x1b, 0x9d, 0x56, 0xfc, 0x83,
    0xb7, 0x60, 0xc1, 0x5e, 0x9d, 0x85, 0x34, 0xfd, 0x02, 0x1a, 0xba, 0x2c, 0x09, 0x72, 0xa7, 0x4a,
    0x5e, 0x18, 0xbf, 0xc0, 0x58, 0xa7, 0x49, 0x34, 0x46, 0x61, 0x59, 0x0e, 0xe2, 0x6e, 0x9e, 0xd2,
    0xdb, 0xfd, 0x72, 0x2f, 0x3c, 0x47, 0xcc, 0x5f, 0x99, 0x62, 0xee, 0x0d, 0xf3, 0x1f, 0x30, 0x25,
    0x20, 0x92, 0x15, 0x4b, 0x04, 0xfe, 0x15, 0x19, 0x1d, 0xdc, 0x7e, 0x5c, 0x10, 0x21, 0x52, 0x21,
    0x91, 0x54, 0x60, 0x8b, 0x92, 0x41, 0x02, 0x03, 0x01, 0x00, 0x01, 0x02, 0x82, 0x01, 0x01, 0x00,
    0x8a, 0x05, 0xfb, 0x73, 0x7f, 0x16, 0xaf, 0x9f, 0xa9, 0x4c, 0xe5, 0x3f, 0x26, 0xf8, 0x66, 0x4d,
    0xd2, 0xfc, 0xd1, 0x06, 0xc0, 0x60, 0xf1, 0x9f, 0xe3, 0xa6, 0xc6, 0x0a, 0x48, 0xb3, 0x9a, 0xca,
    0x21, 0xcd, 0x29, 0x80, 0x88, 0x3d, 0xa4, 0x85, 0xa5, 0x7b, 0x82, 0x21, 0x81, 0x28, 0xeb, 0xf2,
    0x43, 0x24, 0xb0, 0x76, 0xc5, 0x52, 0xef, 0xc2, 0xea, 0x4b, 0x82, 0x41, 0x92, 0xc2, 0x6d, 0xa6,
    0xae, 0xf0, 0xb2, 0x26, 0x48, 0xa1, 0x23, 0x7f, 0x02, 0xcf, 0xa8, 0x90, 0x17, 0xa2, 0x3e, 0x8a,
    0x26, 0xbd, 0x6d, 0x8a, 0xee, 0xa6, 0x0c, 0x31, 0xce, 0xc2, 0xbb, 0x92, 0x59, 0xb5, 0x73, 0xe2,
    0x7d, 0x91, 0x75, 0xe2, 0xbd, 0x8c, 0x63, 0xe2, 0x1c, 0x8b, 0xc2, 0x6a, 0x1c, 0xfe, 0x69, 0xc0,
    0x44, 0xcb, 0x58, 0x57, 0xb7, 0x13, 0x42, 0xf0, 0xdb, 0x50, 0x4c, 0xe0, 0x45, 0x09, 0x8f, 0xca,
    0x45, 0x8a, 0x06, 0xfe, 0x98, 0xd1, 0x22, 0xf5, 0x5a, 0x9a, 0xdf, 0x89, 0x17, 0xca, 0x20, 0xcc,
    0x12, 0xa9, 0x09, 0x3d, 0xd5, 0xf7, 0xe3, 0xeb, 0x08, 0x4a, 0xc4, 0x12, 0xc0, 0xb9, 0x47, 0x6c,
    0x79, 0x50, 0x66, 0xa3, 0xf8, 0xaf, 0x2c, 0xfa, 0xb4, 0x6b, 0xec, 0x03, 0xad, 0xcb, 0xda, 0x24,
    0x0c, 0x52, 0x07, 0x87, 0x88, 0xc0, 0x21, 0xf3, 0x02, 0xe8, 0x24, 0x44, 0x0f, 0xcd, 0xa0, 0xad,
    0x2f, 0x1b, 0x79, 0xab, 0x6b, 0x49, 0x4a, 0xe6, 0x3b, 0xd0, 0xad, 0xc3, 0x48, 0xb9, 0xf7, 0xf1,
    0x34, 0x09, 0xeb, 0x7a, 0xc0, 0xd5, 0x0d, 0x39, 0xd8, 0x45, 0xce, 0x36, 0x7a, 0xd8, 0xde, 0x3c,
    0xb0, 0x21, 0x96, 0x97, 0x8a, 0xff, 0x8b, 0x23, 0x60, 0x4f, 0xf0, 0x3d, 0xd7, 0x8f, 0xf3, 0x2c,
    0xcb, 0x1d, 0x48, 0x3f, 0x86, 0xc4, 0xa9, 0x00, 0xf2, 0x23, 0x2d, 0x72, 0x4d, 0x66, 0xa5, 0x01,
    0x02, 0x81, 0x81, 0x00, 0xdc, 0x4f, 0x99, 0x44, 0x0d, 0x7f, 0x59, 0x46, 0x1e, 0x8f, 0xe7, 0x2d,
    0x8d, 0xdd, 0x54, 0xc0, 0xf7, 0xfa, 0x46, 0x0d, 0x9d, 0x35, 0x03, 0xf1, 0x7c, 0x12, 0xf3, 0x5a,
    0x9d, 0x83, 0xcf, 0xdd, 0x37, 0x21, 0x7c, 0xb7, 0xee, 0xc3, 0x39, 0xd2, 0x75, 0x8f, 0xb2, 0x2d,
    0x6f, 0xec, 0xc6, 0x03, 0x55, 0xd7, 0x00, 0x67, 0xd3, 0x9b, 0xa2, 0x68, 0x50, 0x6f, 0x9e, 0x28,
    0xa4, 0x76, 0x39, 0x2b, 0xb2, 0x65, 0xcc, 0x72, 0x82, 0x93, 0xa0, 0xcf, 0x10, 0x05, 0x6a, 0x75,
    0xca, 0x85, 0x35, 0x99, 0xb0, 0xa6, 0xc6, 0xef, 0x4c, 0x4d, 0x99, 0x7d, 0x2c, 0x38, 0x01, 0x21,
    0xb5, 0x31, 0xac, 0x80, 0x54, 0xc4, 0x18, 0x4b, 0xfd, 0xef, 0xb3, 0x30, 0x22, 0x51, 0x5a, 0xea,
    0x7d, 0x9b, 0xb2, 0x9d, 0xcb, 0xba, 0x3f, 0xc0, 0x1a, 0x6b, 0xcd, 0xb0, 0xe6, 0x2f, 0x04, 0x33,
    0xd7, 0x3a, 0x49, 0x71, 0x02, 0x81, 0x81, 0x00, 0xd5, 0xd9, 0xc9, 0x70, 0x1a, 0x13, 0xb3, 0x39,
    0x24, 0x02, 0xee, 0xb0, 0xbb, 0x84, 0x17, 0x12, 0xc6, 0xbd, 0x65, 0x73, 0xe9, 0x34, 0x5d, 0x43,
    0xff, 0xdc, 0xf8, 0x55, 0xaf, 0x2a, 0xb9, 0xe1, 0xfa, 0x71, 0x65, 0x4e, 0x50, 0x0f, 0xa4, 0x3b,
    0xe5, 0x68, 0xf2, 0x49, 0x71, 0xaf, 0x15, 0x88, 0xd7, 0xaf, 0xc4, 0x9d, 0x94, 0x84, 0x6b, 0x5b,
    0x10, 0xd5, 0xc0, 0xaa, 0x0c, 0x13, 0x62, 0x99, 0xc0, 0x8b, 0xfc, 0x90, 0x0f, 0x87, 0x40, 0x4d,
    0x58, 0x88, 0xbd, 0xe2, 0xba, 0x3e, 0x7e, 0x2d, 0xd7, 0x69, 0xa9, 0x3c, 0x09, 0x64, 0x31, 0xb6,
    0xcc, 0x4d, 0x1f, 0x23, 0xb6, 0x9e, 0x65, 0xd6, 0x81, 0xdc, 0x85, 0xcc, 0x1e, 0xf1, 0x0b, 0x84,
    0x38, 0xab, 0x93, 0x5f, 0x9f, 0x92, 0x4e, 0x93, 0x46, 0x95, 0x6b, 0x3e, 0xb6, 0xc3, 0x1b, 0xd7,
    0x69, 0xa1, 0x0a, 0x97, 0x37, 0x78, 0xed, 0xd1, 0x02, 0x81, 0x80, 0x33, 0x18, 0xc3, 0x13, 0x65,
    0x8e, 0x03, 0xc6, 0x9f, 0x90, 0x00, 0xae, 0x30, 0x19, 0x05, 0x6f, 0x3c, 0x14, 0x6f, 0xea, 0xf8,
    0x6b, 0x33, 0x5e, 0xee, 0xc7, 0xf6, 0x69, 0x2d, 0xdf, 0x44, 0x76, 0xaa, 0x32, 0xba, 0x1a, 0x6e,
    0xe6, 0x18, 0xa3, 0x17, 0x61, 0x1c, 0x92, 0x2d, 0x43, 0x5d, 0x29, 0xa8, 0xdf, 0x14, 0xd8, 0xff,
    0xdb, 0x38, 0xef, 0xb8, 0xb8, 0x2a, 0x96, 0x82, 0x8e, 0x68, 0xf4, 0x19, 0x8c, 0x42, 0xbe, 0xcc,
    0x4a, 0x31, 0x21, 0xd5, 0x35, 0x6c, 0x5b, 0xa5, 0x7c, 0xff, 0xd1, 0x85, 0x87, 0x28, 0xdc, 0x97,
    0x75, 0xe8, 0x03, 0x80, 0x1d, 0xfd, 0x25, 0x34, 0x41, 0x31, 0x21, 0x12, 0x87, 0xe8, 0x9a, 0xb7,
    0x6a, 0xc0, 0xc4, 0x89, 0x31, 0x15, 0x45, 0x0d, 0x9c, 0xee, 0xf0, 0x6a, 0x2f, 0xe8, 0x59, 0x45,
    0xc7, 0x7b, 0x0d, 0x6c, 0x55, 0xbb, 0x43, 0xca, 0xc7, 0x5a, 0x01, 0x02, 0x81, 0x81, 0x00, 0xab,
    0xf4, 0xd5, 0xcf, 0x78, 0x88, 0x82, 0xc2, 0xdd, 0xbc, 0x25, 0xe6, 0xa2, 0xc1, 0xd2, 0x33, 0xdc,
    0xef, 0x0a, 0x97, 0x2b, 0xdc, 0x59, 0x6a, 0x86, 0x61, 0x4e, 0xa6, 0xc7, 0x95, 0x99, 0xa6, 0xa6,
    0x55, 0x6c, 0x5a, 0x8e, 0x72, 0x25, 0x63, 0xac, 0x52, 0xb9, 0x10, 0x69, 0x83, 0x99, 0xd3, 0x51,
    0x6c, 0x1a, 0xb3, 0x83, 0x6a, 0xff, 0x50, 0x58, 0xb7, 0x28, 0x97, 0x13, 0xe2, 0xba, 0x94, 0x5b,
    0x89, 0xb4, 0xea, 0xba, 0x31, 0xcd, 0x78, 0xe4, 0x4a, 0x00, 0x36, 0x42, 0x00, 0x62, 0x41, 0xc6,
    0x47, 0x46, 0x37, 0xea, 0x6d, 0x50, 0xb4, 0x66, 0x8f, 0x55, 0x0c, 0xc8, 0x99, 0x91, 0xd5, 0xec,
    0xd2, 0x40, 0x1c, 0x24, 0x7d, 0x3a, 0xff, 0x74, 0xfa, 0x32, 0x24, 0xe0, 0x11, 0x2b, 0x71, 0xad,
    0x7e, 0x14, 0xa0, 0x77, 0x21, 0x68, 0x4f, 0xcc, 0xb6, 0x1b, 0xe8, 0x00, 0x49, 0x13, 0x21, 0x02,
    0x81, 0x81, 0x00, 0xb6, 0x18, 0x73, 0x59, 0x2c, 0x4f, 0x92, 0xac, 0xa2, 0x2e, 0x5f, 0xb6, 0xbe,
    0x78, 0x5d, 0x47, 0x71, 0x04, 0x92, 0xf0, 0xd7, 0xe8, 0xc5, 0x7a, 0x84, 0x6b, 0xb8, 0xb4, 0x30,
    0x1f, 0xd8, 0x0d, 0x58, 0xd0, 0x64, 0x80, 0xa7, 0x21, 0x1a, 0x48, 0x00, 0x37, 0xd6, 0x19, 0x71,
    0xbb, 0x91, 0x20, 0x9d, 0xe2, 0xc3, 0xec, 0xdb, 0x36, 0x1c, 0xca, 0x48, 0x7d, 0x03, 0x32, 0x74,
    0x1e, 0x65, 0x73, 0x02, 0x90, 0x73, 0xd8, 0x3f, 0xb5, 0x52, 0x35, 0x79, 0x1c, 0xee, 0x93, 0xa3,
    0x32, 0x8b, 0xed, 0x89, 0x98, 0xf1, 0x0c, 0xd8, 0x12, 0xf2, 0x89, 0x7f, 0x32, 0x23, 0xec, 0x67,
    0x66, 0x52, 0x83, 0x89, 0x99, 0x5e, 0x42, 0x2b, 0x42, 0x4b, 0x84, 0x50, 0x1b, 0x3e, 0x47, 0x6d,
    0x74, 0xfb, 0xd1, 0xa6, 0x10, 0x20, 0x6c, 0x6e, 0xbe, 0x44, 0x3f, 0xb9, 0xfe, 0xbc, 0x8d, 0xda,
    0xcb, 0xea, 0x8f
    });
    
}